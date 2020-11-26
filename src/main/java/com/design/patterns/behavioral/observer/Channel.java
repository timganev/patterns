package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

  private List<Subscriber> subs = new ArrayList<>();
  private String title;

  public void subscribe(Subscriber sub) {
    subs.add(sub);
  }

  public void unSubscribe(Subscriber sub) {
    subs.remove(sub);
  }

  public void  notifySubs () {
    subs.forEach(subscriber -> {
      subscriber.update();
    });
  }
}
