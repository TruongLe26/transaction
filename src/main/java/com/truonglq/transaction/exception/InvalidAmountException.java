package com.truonglq.transaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Amount")
public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException () {
        super("Invalid amount");
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}
