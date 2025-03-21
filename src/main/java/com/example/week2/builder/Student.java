package com.example.week2.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

  private Long id;
  private String name;
  private int age;
  private String school;

  @Builder
  public Student(String name, int age, String school) {
    this.name = name;
    this.age = age;
    this.school = school;
  }
}
