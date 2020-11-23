package com.design.patterns.creational.singleton;

public class SingletonDoubleCheckedLocking {

  static SingletonDoubleCheckedLocking singletonCheckedLocking;
  private String value;

  private SingletonDoubleCheckedLocking() {
    System.out.println("DoubleCheckedLocking instance created");
  }

  public static SingletonDoubleCheckedLocking getInstance() {
    if (singletonCheckedLocking == null) {
      synchronized (SingletonDoubleCheckedLocking.class) {
        if (singletonCheckedLocking == null) {
          singletonCheckedLocking = new SingletonDoubleCheckedLocking();
        }
      }
    }
    return singletonCheckedLocking;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
