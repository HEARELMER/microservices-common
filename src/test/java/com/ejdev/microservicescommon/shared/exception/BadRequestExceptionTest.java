package com.ejdev.microservicescommon.shared.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestExceptionTest {

    @Test
    void testMessageConstructor() {
        String message = "Bad request";
        BadRequestException ex = new BadRequestException(message);
        assertEquals(message, ex.getMessage());
    }

    @Test
    void testInheritance() {
        BadRequestException ex = new BadRequestException("error");
        assertTrue(ex instanceof DomainException);
        assertTrue(ex instanceof RuntimeException);
    }
}