package com.intimetec.dummy.commonLib.exception;

public class OrderNotFoundException  extends GlobalException {
    public OrderNotFoundException(Long id) {
        super("Order with id " + id + " not found", "ORDER_NOT_FOUND");
    }
}
