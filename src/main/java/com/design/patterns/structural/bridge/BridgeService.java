package com.design.patterns.structural.bridge;


import com.design.patterns.structural.bridge.device.DVDDevice;
import com.design.patterns.structural.bridge.device.TVDevice;
import com.design.patterns.structural.bridge.remote.DVDRemote;
import com.design.patterns.structural.bridge.remote.Remote;
import com.design.patterns.structural.bridge.remote.TVRemote;
import org.springframework.stereotype.Service;

@Service
public class BridgeService {

  public void print() {
    System.out.println("===================================");
    System.out.println("Bridge pattern demo: ");

    Remote tvRemote = new TVRemote(new TVDevice(1, 200));
    Remote dvdRemote = new DVDRemote(new DVDDevice(1, 100));

    tvRemote.rightPressed();
    tvRemote.deviceSpecial();
    tvRemote.leftPressed();

    dvdRemote.rightPressed();
    dvdRemote.leftPressed();
    dvdRemote.deviceSpecial();

  }


}
