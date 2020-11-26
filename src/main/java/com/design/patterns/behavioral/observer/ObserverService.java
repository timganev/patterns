package com.design.patterns.behavioral.observer;


import org.springframework.stereotype.Service;

@Service
public class ObserverService {

  public void print() {
    System.out.println("===================================");
    System.out.println("Observer pattern demo: ");
    Channel myChannel = new Channel();
    Subscriber s1 = new Subscriber("Subscriber1");
    Subscriber s2 = new Subscriber("Subscriber2");
    Subscriber s3 = new Subscriber("Subscriber3");

    myChannel.subscribe(s1);
    myChannel.subscribe(s2);
    myChannel.subscribe(s3);

    s1.setChannel(myChannel);
    s2.setChannel(myChannel);
    s3.setChannel(myChannel);




    myChannel.notifySubs();

  }


}
