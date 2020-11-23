package com.design.patterns.creational.singleton;

public class SingletonLazy {

  static SingletonLazy singletonLazy;
  private String value;

  private SingletonLazy() {
    System.out.println("Lazy instance created");
  }

  public static SingletonLazy getInstance() {
    if (singletonLazy == null) {
      singletonLazy = new SingletonLazy();
    }
    return singletonLazy;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
