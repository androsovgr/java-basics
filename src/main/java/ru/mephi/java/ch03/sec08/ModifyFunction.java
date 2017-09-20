package ru.mephi.java.ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

public class ModifyFunction {
  public static void main(String[] args) {
    Arrays.sort(args, reverse(String::compareToIgnoreCase));
  }

  public static Comparator<String> reverse(Comparator<String> comp) {
    return (x, y) -> comp.compare(y, x);
  }
}
