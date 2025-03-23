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
@Builder
@ToString
@Slf4j
public class Student {
  final private String name;
  final private int age;
  final private String school;
}
