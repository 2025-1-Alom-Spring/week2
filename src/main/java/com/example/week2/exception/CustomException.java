package com.example.week2.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

  private final ErrorCode errorCode;

  public CustomException(ErrorCode errorCode) {
    super(errorCode.getMessage());    //에러 메세지 출력
    this.errorCode = errorCode;
  }
}
