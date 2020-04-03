package be.matias.service.mappers;

import be.matias.domain.orders.Order;
import be.matias.service.orderdto.OrderDto;

import java.time.LocalDate;
import java.util.UUID;

public class OrderMapper {
    public static OrderDto turnOrderIntoOrderDto(Order order) {
        return new OrderDto(
                ItemGroupMapper.turnItemGroupListIntoItemGroupDtoList(order.getItemGroups()),
                order.getCustomerId().toString(),
                order.getTotalPrice(),
                order.getOrderShippingDate().toString());
    }

    public static Order turnOrderDtoIntoOrder(OrderDto orderDto) {
        return new Order(
                ItemGroupMapper.turnItemGroupDtoListIntoItemGroupList(orderDto.getItemGroups()),
                UUID.fromString(orderDto.getCustomerId()),
                orderDto.getTotalPrice(),
                LocalDate.parse(orderDto.getOrderShippingDate()));
    }
}
