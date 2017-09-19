package ru.mephi.java.ch03.sec04;

public class FunctionalInterface {

  public static void main(String[] args) {
    Runnable r = () -> System.out.println("Hello");
    new Thread(r).start();
    new Thread(() -> System.out.println("Hello")).start();
  }
}
