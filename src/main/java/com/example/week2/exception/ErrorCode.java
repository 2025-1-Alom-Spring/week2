package com.example.week2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
//http 상태코드, 메세지 받음
  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청이 들어왔습니다"),
  SEJONG_UNI(HttpStatus.BAD_GATEWAY,"세종대왕이 아닙니다");


  private final HttpStatus status;
  private final String message;
}
