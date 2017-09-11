package ru.mephi.java.ch03.sec03;

import java.util.Comparator;

public class WordCountStringComparator implements Comparator<String> {
  public int compare(String o1, String o2) {
    return countWords(o1) - countWords(o2);
  }
  private int countWords(String s) {
    return s.split("\\s+").length;
  }
}
