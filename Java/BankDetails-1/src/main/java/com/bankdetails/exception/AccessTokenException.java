package com.bankdetails.exception;

public class AccessTokenException extends RuntimeException {
    public AccessTokenException() {
        super();
    }

    public AccessTokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessTokenException(String message) {
        super(message);
    }

    public AccessTokenException(Throwable cause) {
        super(cause);
    }
}
