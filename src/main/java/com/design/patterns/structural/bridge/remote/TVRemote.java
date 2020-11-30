package com.design.patterns.structural.bridge.remote;

import com.design.patterns.structural.bridge.device.Device;

public class TVRemote extends Remote {

  public TVRemote(Device device) {
    super(device);
  }


  @Override
  public void deviceSpecial() {
    System.out.println("TV special function");
  }


}
