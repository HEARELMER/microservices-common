package com.ejdev.microservicescommon.shared.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnauthorizedExceptionTest {

    @Test
    void testMessageConstructor() {
        String message = "Unauthorized";
        UnauthorizedException ex = new UnauthorizedException(message);
        assertEquals(message, ex.getMessage());
    }

    @Test
    void testInheritance() {
        UnauthorizedException ex = new UnauthorizedException("error");
        assertTrue(ex instanceof DomainException);
        assertTrue(ex instanceof RuntimeException);
    }
}