package com.design.patterns.structural.decorator;


import org.springframework.stereotype.Service;

@Service
public class DecoratorService {

  public void print() {
    System.out.println("===================================");
    System.out.println("Decorator pattern demo: ");


    Pizza pizza = new Mozzarella(new TomatoSauce(new PlainPizza()));
    System.out.println("Ingredients: "+pizza.getDescription());
    System.out.println("Price: "+pizza.getCost());


  }


}
