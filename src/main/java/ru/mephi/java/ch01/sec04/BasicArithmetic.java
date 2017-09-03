package ru.mephi.java.ch01.sec04;

public class BasicArithmetic {
  public static void main(String[] args) {
    System.out.println(15 / 2);// 7
    System.out.println(15.0 / 2);// 7.5
    System.out.println(Integer.MAX_VALUE * 2 / Integer.MAX_VALUE);// 0
    System.out.println((long) Integer.MAX_VALUE * 2 / Integer.MAX_VALUE);// 2
    int i1 = 1 + 2 * 3;// 1 + (2 * 3) = 7
    i1++;// 8
    i1--;// 7
  }
}
