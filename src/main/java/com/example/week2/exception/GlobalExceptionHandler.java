package com.example.week2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//rest 붙으면 바디만 반환
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  //null pointer exception 을 잡고 메소드 실행 중요!!
  @ExceptionHandler(NullPointerException.class)
  public String handleNullPointerException() {
    log.error("NullPointer Exception 처리 시작");
    return "NullPointer Exception 핸들링";
  }

  @ExceptionHandler(InternalError.class)
  public String handleInternalError() {
    log.error("InternalError 처리 시작");
    return "InternalError 핸들링";
  }

  @ExceptionHandler(CustomException.class)
  public String handleCustomException() {
    log.error("CustomException 처리 시작");
    return "CustomException 핸들링";
  }

  @ExceptionHandler(CustomException.class)
  public ResponseEntity<ErrorResponse> handleCustomException(CustomException e) {
    log.error("CustomException 발생: {}", e.getMessage(), e);

    ErrorCode errorCode = e.getErrorCode();

    ErrorResponse response = ErrorResponse.builder()
            .errorCode(errorCode)
            .errorMessage(errorCode.getMessage())
            .build();

    return ResponseEntity.status(errorCode.getStatus()).body(response);
  }
}
