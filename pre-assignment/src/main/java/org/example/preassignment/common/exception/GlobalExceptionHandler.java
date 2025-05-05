package org.example.preassignment.common.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.example.preassignment.common.dto.ApiResponse;
import org.example.preassignment.common.dto.ErrorInfo;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    // <?> : 제네릭 와일드카드
    // ApiResponse<T>: 응답을 만들거나 data에 값을 넣을 때
    // ApiResponse<?>: 응답을 읽거나 리턴할 때, 구체적인 타입이 필요 없을 때
    public ResponseEntity<ApiResponse<?>> handleApiException(ApiException ex) {
        ErrorInfo error = new ErrorInfo(ex.getErrorCode(), ex.getDetails());
        return ResponseEntity
                .status(ex.getErrorCode().getHttpStatus())
                .body(ApiResponse.error(error));
    }
}
