package ru.mephi.java.ch03.sec07;

import java.util.Comparator;

public class Scope {
  public static void main(String[] args) {
    // int first = 0;
    Comparator<String> comp = (first, second) -> first.length() - second.length();
  }
}
