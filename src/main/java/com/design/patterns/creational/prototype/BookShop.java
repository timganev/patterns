package com.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

  private String name;
  List<Book> bookList = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  public void loadData() {
    for (int i = 0; i < 5; i++) {
      Book book = new Book();
      book.setId(i);
      book.setName("Legends part " + i);
      getBookList().add(book);
    }
  }

  @Override
  public String toString() {
    return "BookShop{" +
        "name='" + name + '\'' +
        ", bookList=" + bookList +
        '}';
  }

  @Override
  protected BookShop clone() throws CloneNotSupportedException {
    BookShop shop = new BookShop();
    for (Book book : this.getBookList()) {
      shop.getBookList().add(book);
    }
    return shop;
  }
}
