package com.design.patterns.creational.factory;


import org.springframework.stereotype.Service;

@Service
public class FactoryService {

  public void print() {
    System.out.println("===================================");
    System.out.println("Factory pattern demo: ");

    OS os1 = getInstance(OsEnum.IOS);
    OS os2 = getInstance(OsEnum.Android);
    os1.spec();
    os2.spec();

  }

  public OS getInstance(OsEnum osEnum) {

    switch (osEnum) {
      case Android:
        return new Android();
      default:
        return new IOS();
    }


  }


}
