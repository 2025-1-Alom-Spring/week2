package com.example.week2.builder;


import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class App1 {
  public static void main(String[] args) {
    Student student = Student.builder()
            .name("김세희")
            .age(23)
            .school("세종대학교")
            .build();
  }
}
