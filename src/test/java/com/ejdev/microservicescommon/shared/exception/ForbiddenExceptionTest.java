package com.ejdev.microservicescommon.shared.exception;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForbiddenExceptionTest {

    @Test
    void testMessageConstructor() {
        String message = "Forbidden";
        ForbiddenException ex = new ForbiddenException(message);
        assertEquals(message, ex.getMessage());
    }

    @Test
    void testInheritance() {
        ForbiddenException ex = new ForbiddenException("error");
        assertTrue(ex instanceof DomainException);
        assertTrue(ex instanceof RuntimeException);
    }
}