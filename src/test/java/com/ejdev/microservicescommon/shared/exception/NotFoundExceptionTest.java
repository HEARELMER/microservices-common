package com.ejdev.microservicescommon.shared.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotFoundExceptionTest {

    @Test
    void testMessageConstructor() {
        String message = "Not found";
        NotFoundException ex = new NotFoundException(message);
        assertEquals(message, ex.getMessage());
    }

    @Test
    void testInheritance() {
        NotFoundException ex = new NotFoundException("error");
        assertTrue(ex instanceof DomainException);
        assertTrue(ex instanceof RuntimeException);
    }
}