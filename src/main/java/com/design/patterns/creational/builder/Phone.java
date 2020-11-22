package com.design.patterns.creational.builder;

public class Phone {

  private String os;
  private String procesor;
  private int battery;
  private int ram;


  public Phone(String os, String procesor, int battery, int ram) {
    this.os = os;
    this.procesor = procesor;
    this.battery = battery;
    this.ram = ram;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getProcesor() {
    return procesor;
  }

  public void setProcesor(String procesor) {
    this.procesor = procesor;
  }

  public int getBattery() {
    return battery;
  }

  public void setBattery(int battery) {
    this.battery = battery;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "os='" + os + '\'' +
        ", procesor='" + procesor + '\'' +
        ", battery=" + battery +
        ", ram=" + ram +
        '}';
  }
}
