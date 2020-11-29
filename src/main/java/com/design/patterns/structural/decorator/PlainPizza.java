package com.design.patterns.structural.decorator;

public class PlainPizza implements Pizza{

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
