package com.design.patterns.structural.decorator;


import com.design.patterns.structural.decorator.toppings.Dough;
import com.design.patterns.structural.decorator.toppings.Mozzarella;
import com.design.patterns.structural.decorator.toppings.Proshuto;
import com.design.patterns.structural.decorator.toppings.TomatoSauce;
import org.springframework.stereotype.Service;

@Service
public class DecoratorService {

  public void print() {
    System.out.println("===================================");
    System.out.println("Decorator pattern demo: ");

    System.out.println("Order 1:");
    Pizza pizza = new Mozzarella(new TomatoSauce(new Dough()));
    System.out.println("Ingredients: "+pizza.getDescription());
    System.out.println("Price: "+pizza.getCost());

    System.out.println();

    System.out.println("Order 2:");
    Pizza pizza2 = new Mozzarella(new Proshuto(new Dough()));
    System.out.println("Ingredients: "+pizza2.getDescription());
    System.out.println("Price: "+pizza2.getCost());

  }


}
