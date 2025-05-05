package org.example.preassignment.common.exception;

import org.example.preassignment.common.dto.ErrorInfo;

public class ApiException extends RuntimeException{
    private final ErrorInfo errorInfo;

    public ApiException(ErrorInfo errorInfo) {
        // super 호출 이유
        // 1. 로그 출력시 메시지를 남기기 위해서
        // 2. 예외 전파 시 메시지 유지
        super(errorInfo.getMessage());
        this.errorInfo = errorInfo;
    }

    public ErrorCode getErrorCode() {
        return ErrorCode.valueOf(errorInfo.getCode()); // 문자열 code → enum
    }

    public Object getDetails() {
        return errorInfo.getDetails();
    }

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }
}
