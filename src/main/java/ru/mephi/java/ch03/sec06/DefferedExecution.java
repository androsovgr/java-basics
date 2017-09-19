package ru.mephi.java.ch03.sec06;

import java.util.function.IntConsumer;

public class DefferedExecution {

  public static void main(String[] args) {
    repeat(2, () -> System.out.println("HW!"));
    repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
  }

  public static void repeat(int n, Runnable action) {
    for (int i = 0; i < n; i++) {
      action.run();
    }
  }

  public static void repeat(int n, IntConsumer action) {
    for (int i = 0; i < n; i++) {
      action.accept(i);
    }
  }
}
