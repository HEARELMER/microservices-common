package com.ejdev.microservicescommon.shared.util;

import com.ejdev.microservicescommon.shared.dto.BaseResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ResponseBuilderTest {

    @Test
    void testSuccessResponse() {
        String message = "Operación exitosa";
        String data = "resultado";
        BaseResponse<String> response = ResponseBuilder.success(message, data);

        assertEquals("success", response.getStatus());
        assertEquals(message, response.getMessage());
        assertEquals(data, response.getData());
    }

    @Test
    void testErrorResponseWithoutData() {
        String message = "Ocurrió un error";
        BaseResponse<String> response = ResponseBuilder.error(message);

        assertEquals("error", response.getStatus());
        assertEquals(message, response.getMessage());
        assertNull(response.getData());
    }

    @Test
    void testErrorResponseWithData() {
        String message = "Error con datos";
        String data = "detalle";
        BaseResponse<String> response = ResponseBuilder.error(message, data);

        assertEquals("error", response.getStatus());
        assertEquals(message, response.getMessage());
        assertEquals(data, response.getData());
    }
}