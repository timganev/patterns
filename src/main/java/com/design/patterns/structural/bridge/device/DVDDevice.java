package com.design.patterns.structural.bridge.device;

public class DVDDevice extends Device {

  public int deviceState;
  public int maxSetting;
  public int volume = 0;

  public DVDDevice(int deviceState, int maxSetting) {
    this.deviceState = deviceState;
    this.maxSetting = maxSetting;
  }

  public void leftPressed() {
    System.out.println("DVD Prev Song");
  }


  public void rightPressed() {
    System.out.println("DVD Next Song");
  }
}
