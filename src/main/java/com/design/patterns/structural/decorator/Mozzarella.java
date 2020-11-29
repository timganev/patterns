package com.design.patterns.structural.decorator;

public class Mozzarella extends ToppingDecorator {

  public Mozzarella(Pizza newPizza) {
    super(newPizza);
    System.out.println("Adding Mozzarella");
  }

  public String getDescription() {
    return tempPizza.getDescription()+ ", Mozzarella";
  }

  public double getCost() {
    return tempPizza.getCost()+1.50;
  }
}
