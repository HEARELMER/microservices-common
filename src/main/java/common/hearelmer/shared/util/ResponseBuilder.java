package common.hearelmer.shared.util;
import common.hearelmer.shared.dto.ApiResponseStatus;
import common.hearelmer.shared.dto.BaseResponse;

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