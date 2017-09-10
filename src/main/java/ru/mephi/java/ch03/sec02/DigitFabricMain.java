package ru.mephi.java.ch03.sec02;

public class DigitFabricMain {
  public static void main(String[] args) {
    IntSequence digits = IntSequence.digitsOf(1729);
    // ...
    while (digits.hasNext()) {
      System.out.println(digits.next());
    }
  }
}
