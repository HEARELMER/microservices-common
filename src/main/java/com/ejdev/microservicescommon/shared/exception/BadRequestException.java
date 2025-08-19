package com.ejdev.microservicescommon.shared.exception;

public class BadRequestException extends DomainException {
    public BadRequestException(String message) {
        super(message);
    }

      public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
