package com.design.patterns.behavioral.command.commands;

import com.design.patterns.behavioral.command.Stock;

public class BuyOrder implements Order {

  private Stock stock;

  public BuyOrder(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    stock.buyStock();
  }
}
