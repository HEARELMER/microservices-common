package com.ejdev.microservicescommon.shared.exception;

public class UnprocessableEntityException extends DomainException {
    public UnprocessableEntityException(String message) {
        super(message);
    }
}