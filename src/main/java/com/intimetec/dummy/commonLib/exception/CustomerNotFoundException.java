package com.intimetec.dummy.commonLib.exception;

public class CustomerNotFoundException extends GlobalException {
    public CustomerNotFoundException(Long id) {
        super("Customer with id " + id + " not found", "CUSTOMER_NOT_FOUND");
    }
}