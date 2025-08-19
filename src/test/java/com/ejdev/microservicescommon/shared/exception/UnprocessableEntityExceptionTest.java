package com.ejdev.microservicescommon.shared.exception;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnprocessableEntityExceptionTest {

    @Test
    void testMessageConstructor() {
        String message = "Unprocessable";
        UnprocessableEntityException ex = new UnprocessableEntityException(message);
        assertEquals(message, ex.getMessage());
    }

    @Test
    void testInheritance() {
        UnprocessableEntityException ex = new UnprocessableEntityException("error");
        assertTrue(ex instanceof DomainException);
        assertTrue(ex instanceof RuntimeException);
    }
}