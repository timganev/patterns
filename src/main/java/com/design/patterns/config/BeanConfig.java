package com.design.patterns.config;


import com.design.patterns.PatternService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  CommandLineRunner runner(PatternService service)  {
    return args -> {
      service.printPatterns();
    };
  }
}
