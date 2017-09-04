package ru.mephi.java.ch02.sec06;

import ru.mephi.java.ch02.sec06.Invoice.Item;

public class InvoceMain {
  public static void main(String[] args) {
    Invoice invoice = new Invoice();
    invoice.add(new Invoice.Item("T-short", 12, 29.95));
    invoice.add(new Item("Socks", 12, 29.95));
  }
}
