package com.example.week2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청이 들어왔습니다"),
  SEJONG_UNIV(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "가나다라마바사");  //에러 타입과 에러메세지 형식

  private final HttpStatus status;
  private final String message;
}
