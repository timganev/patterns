package com.design.patterns.structural.bridge.remote;

import com.design.patterns.structural.bridge.device.Device;

public abstract class Remote {

  private Device device;

  public Remote(Device device) {
    this.device = device;
  }

  public void rightPressed() {
    device.rightPressed();
  }

  public void leftPressed() {
    device.leftPressed();
  }

  public void feedback() {
    device.feedback();
  }

  public abstract void deviceSpecial();
}
