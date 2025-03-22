package com.example.week2.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Slf4j
public class Student {
  private String name;
  private int age;
  private String school;

  public static void main(String[] args) {
    Student student = Student.builder()
            .name("홍길동")
            .age(20)
            .school("세종대학교")
            .build();

    System.out.println(student);
  }
}