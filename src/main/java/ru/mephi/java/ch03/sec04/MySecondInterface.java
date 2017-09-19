package ru.mephi.java.ch03.sec04;

public interface MySecondInterface {
  boolean calculate(String s);

  default boolean calculateReverse(String s) {
    return !calculate(s);
  }
}
