package orders;

import items.ItemGroup;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Order {
    private List<ItemGroup> itemGroups;
    private UUID customerId;
    private double totalPrice;
    private LocalDate orderShippingDate;

    public Order(List<ItemGroup> itemGroups, UUID customerId) {
        this.itemGroups = itemGroups;
        this.customerId = customerId;
        this.totalPrice = calculateTotalPrice();
        orderShippingDate = getLatestShippingDateFromItemGroup();
    }

    public LocalDate getLatestShippingDateFromItemGroup() {
        LocalDate shippingDate = LocalDate.now();
        for (ItemGroup itemGroup : itemGroups
        ) {
            if (itemGroup.getShippingDate().isAfter(shippingDate)) {
                shippingDate = itemGroup.getShippingDate();
            }
        }
        return shippingDate;
    }

    public double calculateTotalPrice() {
        for (ItemGroup itemGroup : itemGroups
        ) {
            totalPrice += itemGroup.calculateItemGroupPrice();
        }
        return totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDate getOrderShippingDate() {
        return orderShippingDate;
    }
}