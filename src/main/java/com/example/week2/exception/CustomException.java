package com.example.week2.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

  private final ErrorCode errorCode;

  public CustomException(ErrorCode errorCode) {
    super(errorCode.getMessage()); // RuntimeException은 string을 받아 단순 출력 -> 커스텀 errorCode를 전달
    this.errorCode = errorCode;
  }
}
