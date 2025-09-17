package com.intimetec.dummy.commonLib.exception;

public class PaymentNotFoundException extends GlobalException {
    public PaymentNotFoundException(Long id) {
        super("Payment with id " + id + " not found", "PAYMENT_NOT_FOUND");
    }
}