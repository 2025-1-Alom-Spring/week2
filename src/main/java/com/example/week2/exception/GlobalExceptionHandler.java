package com.example.week2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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

//  @ExceptionHandler(CustomException.class)
//  public String handleCustomException(CustomException e) {
//    log.error(e.getMessage());
//    return "커스텀 예외 발생";
//  }

  @ExceptionHandler(CustomException.class)
  public ResponseEntity<ErrorResponse> handleCustomException(CustomException e) {
    log.error("CustomException 발생: {}", e.getMessage(), e);

    ErrorResponse errorResponse = ErrorResponse.builder()
            .errorMessage(e.getMessage())
            .errorCode(e.getErrorCode())
            .build();

    return ResponseEntity.badRequest().body(errorResponse);
  }
}
