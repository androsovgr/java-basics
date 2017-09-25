package ru.mephi.java.ch04.sec02;

import java.util.Arrays;

public class EqualsMain {
  public static void main(String[] args) {
    MyClass mc1 = new MyClass();
    MyClass mc2 = new MyClass();
    MyClass mc3 = mc1;
    System.out.println(mc1.equals(mc2));
    // false
    System.out.println(mc1.equals(mc3));
    // true
    Employee e1 = new Employee(1);
    Employee e2 = new Employee(1);
    System.out.println(e1.equals(e2));
    // true
    int[] ints1 = { 1, 2 };
    int[] ints2 = { 1, 2 };
    System.out.println(ints1.equals(ints2));
    // false
    System.out.println(Arrays.equals(ints1, ints2));
    // true
  }
}
