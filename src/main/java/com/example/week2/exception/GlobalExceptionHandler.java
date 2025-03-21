package com.example.week2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//컨트롤러를 보고있는 상태유지?
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

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
  public ResponseEntity<ErrorResponse> handleCustomeException(CustomException e) {
    log.info("customError 처리 시작 {}", e.getMessage(), e);

    ErrorCode errorCode = e.getErrorCode();
    ErrorResponse response = ErrorResponse.builder()
            .errorCode(errorCode)
            .errorMessage(errorCode.getMessage())
            .build();
    return ResponseEntity.status(errorCode.getStatus()).body(response);
  }






}
