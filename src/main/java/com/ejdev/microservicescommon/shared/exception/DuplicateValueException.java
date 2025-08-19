package com.ejdev.microservicescommon.shared.exception;

public class DuplicateValueException extends DomainException {
    public DuplicateValueException(String field, String value) {
        super("Ya existe un registro con " + field + ": " + value);
    }

    public DuplicateValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
