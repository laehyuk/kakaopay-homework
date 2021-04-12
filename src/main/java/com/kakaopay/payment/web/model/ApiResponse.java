package com.kakaopay.payment.web.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

public class ApiResponse<T> {

    private final ApiResult result;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final T data;


    private ApiResponse(T data, ApiResult result) {
        this.data = data;
        this.result = result;
    }

    public static <T> ApiResponse<T> OK() {
        return new ApiResponse<>(null, new ApiResult(String.valueOf(HttpStatus.OK.value()), HttpStatus.OK.getReasonPhrase()));
    }

    public static <T> ApiResponse<T> OK(T data) {
        return new ApiResponse<>(data, new ApiResult(String.valueOf(HttpStatus.OK.value()), HttpStatus.OK.getReasonPhrase()));
    }

    public static ApiResponse ERROR(String code, String desc) {
        return new ApiResponse<>(null, new ApiResult(code, desc));
    }

    public static ApiResponse ERROR(HttpStatus status, Throwable throwable) {
        return new ApiResponse<>(null, new ApiResult(status, throwable));
    }

    public static ApiResponse ERROR(HttpStatus status, String errorMessage) {
        return new ApiResponse<>(null, new ApiResult(status, errorMessage));
    }

    @NoArgsConstructor
    public static class ApiResult {

        private String code;
        private String desc;

        ApiResult(HttpStatus status, Throwable throwable) {
            this(status, throwable.getMessage());
        }

        ApiResult(String code, String desc){
            this.code = code;
            this.desc = desc;
        }

        ApiResult(HttpStatus status, String desc) {
            this.code = String.valueOf((status.value()));
            this.desc = desc;
        }
    }

}
