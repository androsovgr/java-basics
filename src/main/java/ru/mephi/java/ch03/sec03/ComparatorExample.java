package ru.mephi.java.ch03.sec03;

import java.util.Arrays;

public class ComparatorExample {
  public static void main(String[] args) {
String[] strs = { "a b c d", "suddenly" };
Arrays.sort(strs, new LengthComparator());
System.out.println(Arrays.toString(strs));
Arrays.sort(strs, new WordCountStringComparator());
System.out.println(Arrays.toString(strs));
  }
}
