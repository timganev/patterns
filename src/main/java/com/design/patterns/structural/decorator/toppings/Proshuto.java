package com.design.patterns.structural.decorator.toppings;

import com.design.patterns.structural.decorator.Pizza;
import com.design.patterns.structural.decorator.PizzaDecorator;

public class Proshuto extends PizzaDecorator {

  public Proshuto(Pizza newPizza) {
    super(newPizza);
    System.out.println("Adding Proshuto");
  }

  public String getDescription() {
    return tempPizza.getDescription()+ ", Proshuto";
  }

  public double getCost() {
    return tempPizza.getCost()+7.55;
  }
}
