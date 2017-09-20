package ru.mephi.java.ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

public class ReturnFunction {

  public static void main(String[] args) {
    String[] friends = { "Ann", "Aly", "Mary" };
    Arrays.sort(friends, compareInDirecton(-1));
  }

  public static Comparator<String> compareInDirecton(int direction) {
    return (x, y) -> direction * x.compareTo(y);
  }
}
