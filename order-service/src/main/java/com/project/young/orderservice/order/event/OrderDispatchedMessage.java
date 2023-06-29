package com.project.young.orderservice.order.event;

public record OrderDispatchedMessage(
        Long orderId
) {
}
