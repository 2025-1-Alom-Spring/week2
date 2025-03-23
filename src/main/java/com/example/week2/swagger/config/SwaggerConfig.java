package com.example.week2.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI()
        .info(new Info().title("Alom Spring Study") //제목 지정
            .version("1.0") //버전 지정
            .description("Alom Spring Study API 문서"));  //디스크립션 지정
  }

}