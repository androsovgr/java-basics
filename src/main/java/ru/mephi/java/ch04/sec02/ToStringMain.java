package ru.mephi.java.ch04.sec02;

import java.util.Arrays;

public class ToStringMain {
  public static void main(String[] args) {
    System.out.println(new Employee(10));
    // Employee [salary=10.0]
    String toString = new Manager(10, 10) + "";
    System.out.println(toString);
    // Manager [bonus=10.0, toString()=Employee [salary=10.0]]
    System.out.println(new MyClass());
    // ru.mephi.java.ch04.sec02.MyClass@2a139a55
    int[] ints = { 1, 2 };
    System.out.println(ints);
    // [I@15db9742
    System.out.println(Arrays.toString(ints));
    // [1, 2]
    int[][] ints2 = { { 1, 2 }, { 3, 4 } };
    System.out.println(Arrays.deepToString(ints2));
    // [[1, 2], [3, 4]]
  }
}
