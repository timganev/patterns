package com.design.patterns.config;


import com.design.patterns.creational.builder.BuilderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  CommandLineRunner runner(BuilderService builderService)  {

    return args -> {

      builderService.print();

    };
  }


}
