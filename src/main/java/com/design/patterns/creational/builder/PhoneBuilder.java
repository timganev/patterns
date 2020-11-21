package com.design.patterns.creational.builder;

public class PhoneBuilder {

  private String os;
  private String procesor;
  private int battery;
  private int ram;

  public PhoneBuilder setOs(String os) {
    this.os = os;
    return this;
  }

  public PhoneBuilder setProcesor(String procesor) {
    this.procesor = procesor;
    return this;
  }

  public PhoneBuilder setBattery(int battery) {
    this.battery = battery;
    return this;
  }

  public PhoneBuilder setRam(int ram) {
    this.ram = ram;
    return this;
  }

  public Phone build() {
    return new Phone(os, procesor, battery, ram);
  }
}
