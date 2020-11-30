package com.design.patterns.structural.bridge.device;

public abstract class Device {

  public int deviceState;
  public int maxSetting;
  public int volume = 0;

  public abstract void leftPressed();

  public abstract void rightPressed();

  public void feedback() {
    if (deviceState > maxSetting || deviceState < 0) {
      deviceState = 0;
    }
    System.out.println("On " + deviceState);
  }

  public void deviceSpecial() {
  }

}
