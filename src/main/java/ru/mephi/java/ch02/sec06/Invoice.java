package ru.mephi.java.ch02.sec06;

import java.util.ArrayList;

public class Invoice {
  private ArrayList<Item> items = new ArrayList<>();

  public void add(Item item) {
    items.add(item);
  }

  public void printAll() {
    for (Item item : items) {
      System.out.printf("%s for %f\n", item.description, item.price());
    }
  }

  public static class Item {
    private String description;
    private int quantity;
    private double unitPrice;

    public Item(String description, int quantity, double unitPrice) {
      // ...
      this.description = description;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
    }

    public double price() {
      return quantity * unitPrice;
    }
  }
}
