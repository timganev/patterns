package com.design.patterns.config;


import com.design.patterns.creational.builder.BuilderService;
import com.design.patterns.creational.prototype.PrototypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  CommandLineRunner runner(BuilderService builderService, PrototypeService prototypeService)  {

    return args -> {

      System.out.println("============creational=============");
      builderService.print();
      prototypeService.print();


    };
  }


}
