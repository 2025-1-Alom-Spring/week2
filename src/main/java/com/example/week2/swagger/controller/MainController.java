package com.example.week2.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/main")
  public String mainMethod(@RequestParam String str) {
    return str;
  }

}
