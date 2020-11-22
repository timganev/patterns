package com.design.patterns.creational.builder;

import org.springframework.stereotype.Service;

@Service
public class BuilderService {

  public void print() {
    Phone phone = new PhoneBuilder().setRam(1024).setOs("Android").build();
    System.out.println("===================================");
    System.out.println("Builder pattern demo: ");
    System.out.println(phone);
  }
}
