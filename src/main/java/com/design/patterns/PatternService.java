package com.design.patterns;

import com.design.patterns.creational.builder.BuilderService;
import com.design.patterns.creational.factory.FactoryService;
import com.design.patterns.creational.prototype.PrototypeService;
import com.design.patterns.creational.singleton.SingletonService;
import org.springframework.stereotype.Service;

@Service
public class PatternService {

  private BuilderService builderService;
  private PrototypeService prototypeService;
  private FactoryService factoryService;
  private SingletonService singletonService;


  public PatternService(BuilderService builderService,
      PrototypeService prototypeService, FactoryService factoryService,
      SingletonService singletonService) {
    this.builderService = builderService;
    this.prototypeService = prototypeService;
    this.factoryService = factoryService;
    this.singletonService = singletonService;
  }

  public void printPatterns() throws CloneNotSupportedException {

    System.out.println("################## Creational ##################");
    builderService.print();
    prototypeService.print();
    factoryService.print();
    singletonService.print();
    System.out.println("################## Behavioral ##################");
    System.out.println("################## Structural ##################");
  }

}
