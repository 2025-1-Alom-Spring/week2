package com.example.week2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
//enum 상수로 관리
public enum ErrorCode {

  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청이 들어왔습니다"),
  SEJONG_UNI(HttpStatus.BAD_GATEWAY, "출력하고 싶은 메시지");


  private final HttpStatus status;
  private final String message;
}
