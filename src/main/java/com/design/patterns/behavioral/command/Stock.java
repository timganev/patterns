package com.design.patterns.behavioral.command;

public class Stock {

  private String name;

  public Stock(String name) {
    this.name = name;
  }

  public void buyStock() {
    System.out.println("buy " + name);
  }

  public void sellStock() {
    System.out.println("sell " + name);
  }

}
