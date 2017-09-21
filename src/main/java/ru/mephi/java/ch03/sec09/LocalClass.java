package ru.mephi.java.ch03.sec09;

import java.util.Random;

public class LocalClass {
  private static Random generator = new Random();

  public static IntSequence randomInts(int low, int high) {
    class RandomSequence implements IntSequence {
      public int next() {
        return low + generator.nextInt(high - low + 1);
      }

      public boolean hasNext() {
        return true;
      }
    }
    return new RandomSequence();
  }
}
