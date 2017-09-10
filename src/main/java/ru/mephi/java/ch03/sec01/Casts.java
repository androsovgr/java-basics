package ru.mephi.java.ch03.sec01;

import static ru.mephi.java.ch03.sec01.CalcAverage.average;

public class Casts {
  public static void main(String[] args) {
    IntSequence sequence = new DigitSequence(Integer.MAX_VALUE);
    double avgd = average(sequence, 100);
    System.out.println(avgd);
    DigitSequence digits = (DigitSequence) sequence;
    System.out.println(digits.rest());
    // String digitString = (String) sequence;
    SquareSequence squares = (SquareSequence) sequence;
    if (sequence instanceof DigitSequence) {
      DigitSequence digits2 = (DigitSequence) sequence;
      System.out.println(digits2.rest());
    }
    
    DigitSequence ds = new DigitSequence(10);
    SquareSequence ss = (SquareSequence)(IntSequence)ds;
  }
}
