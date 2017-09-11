package ru.mephi.java.ch03.sec03;

public class SayMessageTask implements Runnable {
  private final String message;
  private final int sayCount;

  public SayMessageTask(String message, int sayCount) {
    super();
    this.message = message;
    this.sayCount = sayCount;
  }

  @Override
  public void run() {
    for (int i = 0; i < sayCount; i++) {
      System.out.println(message);
    }
  }
}
