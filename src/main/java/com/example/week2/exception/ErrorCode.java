package com.example.week2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청이 들어왔습니다"),
  SEJONG_UNIT(HttpStatus.OK,"세종대 학생 등록이 되었습니다"),
  CUSTOM_ERROR(HttpStatus.BAD_REQUEST, "커스텀 에러가 발생했습니다.");

  private final HttpStatus status;
  private final String message;
}
