package com.design.patterns.behavioral.command.commands;

import com.design.patterns.behavioral.command.Stock;

public class SellOrder implements Order {

  private Stock stock;

  public SellOrder(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    stock.sellStock();
  }
}
