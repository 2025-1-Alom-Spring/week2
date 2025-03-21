package com.example.week2.builder;

import com.example.week2.exception.CustomException;
import com.example.week2.exception.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1 {

  private static final Logger log = LoggerFactory.getLogger(App1.class);

  public static void main(String[] args) {

    Student.StudentBuilder school = Student.builder()
            .name("heeun")
            .age(28)
            .school("sejong");

    Student st = school.build();


  }
}
