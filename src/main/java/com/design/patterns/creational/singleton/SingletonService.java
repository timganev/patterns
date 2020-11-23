package com.design.patterns.creational.singleton;


import org.springframework.stereotype.Service;

@Service
public class SingletonService {

  public void print() throws CloneNotSupportedException {
    System.out.println("===================================");
    System.out.println("Singleton pattern demo: ");
    System.out.println("Eager: ");
    SingletonEager singleton3 = SingletonEager.getInstance();
    singleton3.setValue("MMM");
    SingletonEager singleton4 = SingletonEager.getInstance();
    singleton4.setValue("ZZZ");
    System.out.println("value singleton3:" + singleton3.getValue());
    System.out.println("value singleton4:" + singleton3.getValue());
    System.out.println();


    System.out.println("Lazy: ");
    SingletonLazy singleton1 = SingletonLazy.getInstance();
    singleton1.setValue("AAA");
    SingletonLazy singleton2 = SingletonLazy.getInstance();
    singleton2.setValue("BBB");
    System.out.println("value singleton1:" + singleton1.getValue());
    System.out.println("value singleton2:" + singleton2.getValue());
    System.out.println();


    System.out.println("DoubleCheckedLocking:");
    Thread thread1 = new Thread(new Runnable() {
      public void run() {
        SingletonDoubleCheckedLocking singleton = SingletonDoubleCheckedLocking.getInstance();
        singleton.setValue("s1");
      }
    });
    Thread thread2 = new Thread(new Runnable() {
      public void run() {
        SingletonDoubleCheckedLocking singleton = SingletonDoubleCheckedLocking.getInstance();
        singleton.setValue("s2");
      }
    });

    thread1.start();
    thread2.start();



  }


}
