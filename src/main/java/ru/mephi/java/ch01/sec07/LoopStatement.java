package ru.mephi.java.ch01.sec07;

public class LoopStatement {
  public static void main(String[] args) {
    while (Math.random() < 0.9) {
      System.out.println("Continue");
    }

    double val;
    do {
      val = Math.random();
      System.out.printf("Current value is %f\n", val);
    } while (val < 0.9);
    System.out.println("==Finished do while==");

    for (int i = 0; i < 10; i++) {
      System.out.printf("Current count is %d\n", i);
    }
    System.out.println("==Finished for loop==");

    for (String arg : args) {
      System.out.println(arg);
    }
  }
}
