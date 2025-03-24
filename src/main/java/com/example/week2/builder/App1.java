package com.example.week2.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1 {

  private static final Logger log = LoggerFactory.getLogger(App1.class);

  public static void main(String[] args) {

    log.error("에러입니다.");
    Student student = Student.builder()
            .name("최수빈")
            .age(25)
            .school("세종대학교")
            .build();

    System.out.println(student);

  }
}
