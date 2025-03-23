package com.example.week2.builder;

import com.example.week2.exception.CustomException;
import com.example.week2.exception.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1 {

  private static final Logger log = LoggerFactory.getLogger(App1.class);

  public static void main(String[] args) {
    Student student = Student.builder()
            .age(20)
            .name("구나현")
            .school("세종대학교")
            .build();
    log.error("에러가 났습니다");
    System.out.println(student);

    throw new CustomException(ErrorCode.INVALID_REQUEST);
  }
}
