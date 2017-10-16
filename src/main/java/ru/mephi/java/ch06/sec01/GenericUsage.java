package ru.mephi.java.ch06.sec01;

public class GenericUsage {
  public static void main(String[] args) {
    Entry<String, Integer> e1 = new Entry<>("Fred", 42);
    String key = e1.getKey();
    int val = e1.getValue();
    System.out.println(key + "=" + val);

    Entry<String, Integer> e2 = new Entry<String, Integer>("Ann", 21);

    // Entry<String, int> e3 = new Entry<>("Mike", 42);

    // Entry<Object, Object> e5 = new Entry<String, Integer>("Ann", 21);
  }
}
