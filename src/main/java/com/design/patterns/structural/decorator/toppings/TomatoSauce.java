package com.design.patterns.structural.decorator.toppings;

import com.design.patterns.structural.decorator.Pizza;
import com.design.patterns.structural.decorator.PizzaDecorator;

public class TomatoSauce extends PizzaDecorator {

  public TomatoSauce(Pizza newPizza) {
    super(newPizza);
    System.out.println("Adding Tomato Sauce");
  }

  public String getDescription() {
    return tempPizza.getDescription()+ ", Tomato Sauce";
  }

  public double getCost() {
    return tempPizza.getCost()+0.55;
  }
}
