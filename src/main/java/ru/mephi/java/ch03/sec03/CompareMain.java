package ru.mephi.java.ch03.sec03;

import java.util.Arrays;

public class CompareMain {
  public static void main(String[] args) {
    Employee[] e = { new Employee(10), new Employee(5) };
    Arrays.sort(e);
    System.out.println(Arrays.toString(e));
    String[] names = { "Brook", "Ann" };
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
  }
}
