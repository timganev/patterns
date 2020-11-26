package com.design.patterns.behavioral.observer;

public class Subscriber {

  private String name;
  private Channel channel = new Channel();

  public Subscriber(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  public void update() {
    System.out.println("Hi " + name+ " you have update!!!");
  }
}
