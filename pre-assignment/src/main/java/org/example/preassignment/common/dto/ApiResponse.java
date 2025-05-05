package org.example.preassignment.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    // final 키워드 붙이면 JSON으로 Jackson이 직렬화/역직렬화 어려움
    private boolean success;
    private T data;
    private ErrorInfo error;
    private String message;

    // 성공 응답 생성
    public static <T> ApiResponse<T> ok(T data, String message) {
        ApiResponse<T> response = new ApiResponse<>();
        response.success = true;
        response.data = data;
        response.message = message;

        return response;
    }

    // 실패 응답 생성
    public static <T> ApiResponse<T> error(ErrorInfo error) {
        ApiResponse<T> response = new ApiResponse<>();
        response.success = false;
        response.error = error;

        return response;
    }
}
