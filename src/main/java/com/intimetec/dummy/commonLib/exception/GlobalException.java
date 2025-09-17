package com.intimetec.dummy.commonLib.exception;

import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException {
    private final String errorCode;

    public GlobalException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
