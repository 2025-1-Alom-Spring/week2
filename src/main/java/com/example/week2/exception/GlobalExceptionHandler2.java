package com.example.week2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//View를 반환
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler2 {

  //handler가 ILLegalAru~~ 에로를 자바준다. 잡고 싶은 에러.class로 선언
  //@controller여서 view에서 찾고
  @ExceptionHandler(IllegalArgumentException.class)
  public String handleIllegalArgumentException() {
    log.error("IllegalArgumentException 발생");
    return "error";
  }

}
