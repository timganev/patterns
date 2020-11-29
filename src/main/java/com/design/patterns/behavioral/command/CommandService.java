package com.design.patterns.behavioral.command;


import com.design.patterns.behavioral.command.commands.BuyOrder;
import com.design.patterns.behavioral.command.commands.Order;
import com.design.patterns.behavioral.command.commands.SellOrder;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

  private List<Order> orderList = new ArrayList<>();

  public void print() {
    System.out.println("===================================");
    System.out.println("Command pattern demo: ");

    testOrders();

    executeOrders();

  }
  private void testOrders() {

    Stock aapl = new Stock("AAPL");
    Stock msft = new Stock("MSFT");

    placeOrder(new BuyOrder(aapl));
    placeOrder(new BuyOrder(msft));
    placeOrder(new SellOrder(msft));

  }

  private void executeOrders() {
    orderList.forEach(order -> {
      order.execute();
    });
    orderList.clear();
  }

  private void placeOrder(Order order){
    orderList.add(order);
  }




}
