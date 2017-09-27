package ru.mephi.java.ch04.sec03;

public enum Modifier {
  PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
  private static int maskBit = 1;
  private int mask;

  Modifier() {
    // mask = maskBit;
    // maskBit *= 2;
  }
}
