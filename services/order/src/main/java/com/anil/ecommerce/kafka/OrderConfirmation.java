package com.anil.ecommerce.kafka;

import com.anil.ecommerce.customer.CustomerResponse;
import com.anil.ecommerce.order.PaymentMethod;
import com.anil.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
