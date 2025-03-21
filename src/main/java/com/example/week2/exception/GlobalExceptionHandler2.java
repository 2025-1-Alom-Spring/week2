package com.example.week2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //-> 에러를 잡아서 View를 반환
@Slf4j
public class GlobalExceptionHandler2 {

  @ExceptionHandler(IllegalArgumentException.class) // -> IllegalArgumentException이 발생하면 얘가 잡아서 처리
  public String handleIllegalArgumentException() {
    log.error("IllegalArgumentException 발생");
    return "error";
  }

}
