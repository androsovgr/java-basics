package ru.mephi.java.ch06.sec06;

import ru.mephi.java.ch06.sec01.Entry;

public class ConstructArray {
  public static void main(String[] args) {
    // Entry<String, Integer>[] es = new Entry<String, Integer>[5];
    @SuppressWarnings("unchecked")
    Entry<String, Integer>[] es2 = new Entry[5];
  }
}
