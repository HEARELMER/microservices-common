package com.ejdev.microservicescommon.shared.exception;

public class ForbiddenException extends DomainException {
    public ForbiddenException(String message) {
        super(message);
    }
}