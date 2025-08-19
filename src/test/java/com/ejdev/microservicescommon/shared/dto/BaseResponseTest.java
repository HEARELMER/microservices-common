package com.ejdev.microservicescommon.shared.dto;

import com.ejdev.microservicescommon.shared.exception.DomainException;
import com.ejdev.microservicescommon.shared.exception.InternalServerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternalServerExceptionTest {

    @Test
    void testMessageConstructor() {
        String message = "Internal error";
        InternalServerException ex = new InternalServerException(message);
        assertEquals(message, ex.getMessage());
    }

    @Test
    void testInheritance() {
        InternalServerException ex = new InternalServerException("error");
        assertTrue(ex instanceof DomainException);
        assertTrue(ex instanceof RuntimeException);
    }
}