package ru.mephi.java.ch03.sec02;

public interface IntSequence {
  default boolean hasNext() {
    return true;
  }

  default boolean someNewLogic() {
    return false;
  }

  // ...
  int next();

  // ...
  public static IntSequence digitsOf(int n) {
    return new DigitSequence(n);
  }
}
