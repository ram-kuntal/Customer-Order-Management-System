package com.mike.ordermanagement.mapper;

import com.mike.ordermanagement.dto.order.OrderResponse;
import com.mike.ordermanagement.entity.Order;

public class OrderConverter {

    public static OrderResponse toOrderResponse(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }

        return new OrderResponse(
                order.getId(),
                order.getCustomer().getId(),
                order.getStatus(),
                order.getOrderDate(),
                order.getCanceledDate(),
                order.getDeliveryDate()
        );
    }

}
