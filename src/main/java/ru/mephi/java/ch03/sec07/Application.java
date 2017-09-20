package ru.mephi.java.ch03.sec07;

public class Application {
  public void doWork() {
    Runnable runner = () -> {
      System.out.println(this.toString());
    };
  }
}
