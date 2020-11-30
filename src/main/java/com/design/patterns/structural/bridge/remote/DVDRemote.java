package com.design.patterns.structural.bridge.remote;

import com.design.patterns.structural.bridge.device.Device;

public class DVDRemote extends Remote {


  public DVDRemote(Device device) {
    super(device);

  }

  @Override
  public void deviceSpecial() {
    System.out.println("DVD special function");
  }

  Device getdevice() {
    return this.getdevice();
  }
}
