package com.ejdev.microservicescommon.shared.util;

import com.ejdev.microservicescommon.shared.dto.BaseResponse;
import com.ejdev.microservicescommon.shared.dto.ApiResponseStatus;

public class ResponseBuilder {
    public static <T> BaseResponse<T> success(String message, T data) {
        return new BaseResponse<>(ApiResponseStatus.SUCCESS.name().toLowerCase(), message, data);
    }

    public static <T> BaseResponse<T> error(String message) {
        return new BaseResponse<>(ApiResponseStatus.ERROR.name().toLowerCase(), message, null);
    }

    public static <T> BaseResponse<T> error(String message, T data) {
        return new BaseResponse<>(ApiResponseStatus.ERROR.name().toLowerCase(), message, data);
    }
}