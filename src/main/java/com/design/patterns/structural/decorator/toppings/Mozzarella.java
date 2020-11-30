package com.design.patterns.structural.decorator.toppings;

import com.design.patterns.structural.decorator.Pizza;
import com.design.patterns.structural.decorator.PizzaDecorator;

public class Mozzarella extends PizzaDecorator {

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
