package com.example.week2.builder;

import com.example.week2.exception.CustomException;
import com.example.week2.exception.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1 {

  private static final Logger log = LoggerFactory.getLogger(App1.class);

  public static void main(String[] args) {

    log.error("에러입니다.");

    throw new CustomException(ErrorCode.INVALID_REQUEST);
  }
}
