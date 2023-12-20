package com.mycompany.ooseca.pay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentTest {
    Payment payment = new Payment(0, 0d, true);

    @Test
    void testSelectPaymentType() {
        String result = payment.selectPaymentType("type");
        Assertions.assertEquals("type", result);
    }

    @Test
    void testSetPaymentStatus() {
        payment.setPaymentStatus();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme