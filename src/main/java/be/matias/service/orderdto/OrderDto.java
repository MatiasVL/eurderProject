package be.matias.service.orderdto;

import java.util.List;

public class OrderDto {
    private List<ItemGroupDto> itemGroups;
    private String customerId;
    private double totalPrice;
    private String orderShippingDate;

    public OrderDto(List<ItemGroupDto> itemGroups, String customerId, double totalPrice, String orderShippingDate) {
        this.itemGroups = itemGroups;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.orderShippingDate = orderShippingDate;
    }

    public List<ItemGroupDto> getItemGroups() {
        return itemGroups;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderShippingDate() {
        return orderShippingDate;
    }
}
