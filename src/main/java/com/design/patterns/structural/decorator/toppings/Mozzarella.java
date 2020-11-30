package com.design.patterns.structural.decorator.toppings;

import com.design.patterns.structural.decorator.Pizza;
import com.design.patterns.structural.decorator.ToppingDecorator;

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
