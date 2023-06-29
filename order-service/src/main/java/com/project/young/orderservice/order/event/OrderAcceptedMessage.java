package com.project.young.orderservice.order.event;

public record OrderAcceptedMessage(
        Long orderId
) {
}
