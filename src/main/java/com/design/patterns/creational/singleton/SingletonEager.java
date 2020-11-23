package com.design.patterns.creational.singleton;

public class SingletonEager {

  static SingletonEager singletonEager = new SingletonEager();
  private String value;
  private SingletonEager() {
    System.out.println("Eager instance created");
  }

  public static SingletonEager getInstance(){
    return singletonEager;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
