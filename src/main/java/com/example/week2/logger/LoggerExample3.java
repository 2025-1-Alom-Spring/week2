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

    log.info("학생 이름은" + student.getName() + "입니다"); //로그 레벨에 상관없이 항상 출력됨 + 계산이 처리된다.

    log.info("학생 이름은 {} 입니다.", student.getName());
    //SLF4J 포매팅 방식
    //INFO 레벨로 출력될 때만 호출되어 성능 최적화
  }
}
