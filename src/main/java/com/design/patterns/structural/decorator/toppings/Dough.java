package com.design.patterns.structural.decorator.toppings;

import com.design.patterns.structural.decorator.Pizza;

public class Dough implements Pizza {

  @Override
  public String getDescription() {
    System.out.println("Adding Dough");
    return "Thin Dough";
  }

  @Override
  public double getCost() {
    return 4.00;
  }
}
