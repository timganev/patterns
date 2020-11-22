package com.design.patterns.creational.prototype;


import org.springframework.stereotype.Service;

@Service
public class PrototypeService {

  public void print() throws CloneNotSupportedException {
    System.out.println("===================================");
    System.out.println("Prototype pattern demo: ");
    BookShop bookShop1 = new BookShop();
    bookShop1.setName("bookShop1");
    bookShop1.loadData();

    BookShop bookShop2 =  bookShop1.clone();
    bookShop2.setName("bookShop2");
    bookShop1.getBookList().remove(0);

    System.out.println(bookShop1);
    System.out.println(bookShop2);

  }


}
