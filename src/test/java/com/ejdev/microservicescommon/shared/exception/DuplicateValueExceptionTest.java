package com.ejdev.microservicescommon.shared.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateValueExceptionTest {

    @Test
    void testFieldValueConstructor() {
        DuplicateValueException ex = new DuplicateValueException("email", "test@example.com");
        assertTrue(ex.getMessage().contains("email"));
        assertTrue(ex.getMessage().contains("test@example.com"));
    }

    @Test
    void testMessageAndCauseConstructor() {
        Throwable cause = new RuntimeException("cause");
        DuplicateValueException ex = new DuplicateValueException("Duplicate", cause);
        assertEquals("Duplicate", ex.getMessage());
        assertEquals(cause, ex.getCause());
    }
}