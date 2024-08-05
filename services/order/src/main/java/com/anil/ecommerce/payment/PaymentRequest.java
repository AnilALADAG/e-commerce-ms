package com.anil.ecommerce.payment;

import com.anil.ecommerce.customer.CustomerResponse;
import com.anil.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
