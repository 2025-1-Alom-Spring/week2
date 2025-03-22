package com.example.week2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//body 반환
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  //RestControllerAdvice 선언하고
  //ExceptionHandler 해당 에러 클랫스로 선언하고
  //로드 에러 찍고
  //메세지 반환

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
    log.error("CustomError 처리 시작");
    return "CustomException 핸들링";
  }

  //과제
  @ExceptionHandler(CustomException.class)
  public ResponseEntity<ErrorResponse> handleCustomException(CustomException e) {
    log.error("CustomeException 발생 : {}", e.getMessage(), e);
    ErrorCode errorCode = e.getErrorCode();

    ErrorResponse response = ErrorResponse.builder()
            .errorCode(errorCode)
            .errorMessage(errorCode.getMessage())
            .build();

    return ResponseEntity.status(errorCode.getStatus()).body(response);
  }
}
