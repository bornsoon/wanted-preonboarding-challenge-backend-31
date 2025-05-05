package org.example.preassignment.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import org.example.preassignment.common.exception.ErrorCode;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorInfo {

    @JsonIgnore
    private final ErrorCode errorCode; // enum

    private final String code;
    private final String message;
    private final Object details; // 구조가 정해져 있고 타입 안정성이 필요하면 제너릭

    public ErrorInfo(ErrorCode errorCode, Object details) {
        this.errorCode = errorCode;
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        this.details = details;
    }

    /*
    public ErrorInfo (ErrorCode errorCode) {
        this(errorCode, null);   // erroCode만 받는 생성자 호출 (반드시 첫 줄에만)
        // this.details = null;  // final 변수인데 다시 값 할당 X
    }
    */

}
