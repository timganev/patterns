package com.design.patterns;

import com.design.patterns.creational.builder.BuilderService;
import com.design.patterns.creational.factory.FactoryService;
import com.design.patterns.creational.prototype.PrototypeService;
import org.springframework.stereotype.Service;

@Service
public class PatternService {

  private BuilderService builderService;
  private PrototypeService prototypeService;
  private FactoryService factoryService;


  public PatternService(BuilderService builderService,
      PrototypeService prototypeService, FactoryService factoryService) {
    this.builderService = builderService;
    this.prototypeService = prototypeService;
    this.factoryService = factoryService;
  }

  public void printPatterns() throws CloneNotSupportedException {

    System.out.println("============creational=============");
    builderService.print();
    prototypeService.print();
    factoryService.print();
    System.out.println("============behavioral=============");
    System.out.println("============structural=============");
  }

}
