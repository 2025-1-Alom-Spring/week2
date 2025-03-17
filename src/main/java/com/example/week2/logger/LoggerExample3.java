package com.example.week2.logger;

import com.example.week2.builder.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerExample3 {

  public static void main(String[] args) {
    Student student = Student.builder()
        .name("홍길동")
        .age(20)
        .school("세종대학교")
        .build();

    log.info("학생 이름은" + student.getName() + "입니다");

    log.info("학생 이름은 {} 입니다.", student.getName());
  }
}
