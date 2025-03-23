package com.example.week2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//rest 가 안붙으면 뷰!! 그래서 error.html 을 찾아서 반환
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler2 {

  @ExceptionHandler(IllegalArgumentException.class)
  public String handleIllegalArgumentException() {
    log.error("IllegalArgumentException 발생");
    return "error";
  }

}
