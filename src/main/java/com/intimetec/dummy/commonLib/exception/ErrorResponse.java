package com.intimetec.dummy.commonLib.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private String message;
    private String errorCode;
    private int status;
}