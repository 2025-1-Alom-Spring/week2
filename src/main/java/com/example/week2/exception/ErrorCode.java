package com.example.week2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode { // 직접 커스텀

  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청이 들어왔습니다"),;
  


  private final HttpStatus status;
  private final String message;
}
