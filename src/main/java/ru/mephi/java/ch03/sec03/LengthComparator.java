package ru.mephi.java.ch03.sec03;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
  @Override
  public int compare(String o1, String o2) {
    return o1.length() - o2.length();
  }
}