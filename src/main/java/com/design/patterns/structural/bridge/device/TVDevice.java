package com.design.patterns.structural.bridge.device;


public class TVDevice extends Device {

  public int deviceState;
  public int maxSetting;

  public TVDevice(int deviceState, int maxSetting) {
    this.deviceState = deviceState;
    this.maxSetting = maxSetting;
  }


  public void leftPressed() {
    System.out.println("TV Channel Down");
    deviceState--;
  }

  public void rightPressed() {
    System.out.println("TV Channel Up");
    deviceState++;
  }

}
