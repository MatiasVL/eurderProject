package be.matias.domain.orders;

import be.matias.domain.items.ItemGroup;

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

    public Order(List<ItemGroup> itemGroups, UUID customerId, double totalPrice, LocalDate orderShippingDate) {
        this.itemGroups = itemGroups;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.orderShippingDate = orderShippingDate;
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

    public List<ItemGroup> getItemGroups() {
        return itemGroups;
    }

    public UUID getCustomerId() {
        return customerId;
    }
}