package com.ejdev.microservicescommon.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private String details;
    private int status;
    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();
}