package ru.mephi.java.ch01.sec07;

public class VariableScope {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      // ...
    }
    // compile error: i defined inside loop
    // System.out.println(i);
    int i2;
    for (i2 = 0; i2 < 5; i2++) {
      // ...
    }
    // compile error: i2 have already defined
    /*
     * for (int i2 = 0; i2 < 10; i2++) { // ... }
     */
  }
}
