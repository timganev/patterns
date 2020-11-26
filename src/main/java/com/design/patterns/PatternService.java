package com.design.patterns;

import com.design.patterns.behavioral.command.CommandService;
import com.design.patterns.behavioral.observer.ObserverService;
import com.design.patterns.creational.builder.BuilderService;
import com.design.patterns.creational.factory.FactoryService;
import com.design.patterns.creational.prototype.PrototypeService;
import com.design.patterns.creational.singleton.SingletonService;
import com.design.patterns.structural.bridge.BridgeService;
import com.design.patterns.structural.decorator.DecoratorService;
import org.springframework.stereotype.Service;

@Service
public class PatternService {

  private BuilderService builderService;
  private PrototypeService prototypeService;
  private FactoryService factoryService;
  private SingletonService singletonService;
  private ObserverService observerService;
  private CommandService commandService;
  private DecoratorService decoratorService;
  private BridgeService bridgeService;

  public PatternService(
      BuilderService builderService,
      PrototypeService prototypeService,
      FactoryService factoryService,
      SingletonService singletonService,
      ObserverService observerService,
      CommandService commandService,
      DecoratorService decoratorService,
      BridgeService bridgeService) {
    this.builderService = builderService;
    this.prototypeService = prototypeService;
    this.factoryService = factoryService;
    this.singletonService = singletonService;
    this.observerService = observerService;
    this.commandService = commandService;
    this.decoratorService = decoratorService;
    this.bridgeService = bridgeService;
  }

  public void printPatterns() throws CloneNotSupportedException {

    System.out.println("################## Creational ##################");
    builderService.print();
    prototypeService.print();
    factoryService.print();
    singletonService.print();
    System.out.println("################## Behavioral ##################");
    observerService.print();
    commandService.print();
    System.out.println("################## Structural ##################");
    decoratorService.print();
    bridgeService.print();
  }

}
