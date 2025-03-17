package com.example.week2.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

  @GetMapping("/null")
  public void throwNullPointerException() {
    throw new NullPointerException();
  }

  @GetMapping("/runtime")
  public void throwRuntimeException() {
    throw new RuntimeException();
  }

}
