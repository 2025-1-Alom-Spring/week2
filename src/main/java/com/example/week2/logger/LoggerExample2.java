package com.example.week2.logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerExample2 {
  //어노테이션 사용해서 자동으로 log 생성
  public static void main(String[] args) {
    log.trace("Trace입니다");
    log.debug("Debug입니다");
    log.info("Info입니다");
    log.warn("Warn입니다");
    log.error("Error입니다");
  }
}
