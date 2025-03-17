package com.example.week2.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample1 {

  private static final Logger LOGGER = LoggerFactory.getLogger(LoggerExample1.class);

  public static void main(String[] args) {
    LOGGER.trace("Trace입니다");
    LOGGER.debug("Debug입니다");
    LOGGER.info("Info입니다");
    LOGGER.warn("Warn입니다");
    LOGGER.error("Error입니다");
  }
}
