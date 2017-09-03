package ru.mephi.java.ch01.sec08;

import java.util.ArrayList;
import java.util.Arrays;

public class Copy {
  public static void main(String[] args) {
    int[] primes = { 2, 3, 5, 7, 11, 42 };
    int[] numbers = primes;
    numbers[0] = 1;
    System.out.println(primes[0]);// 1
    numbers = Arrays.copyOf(primes, primes.length);
    primes[0] = 2;
    System.out.println(numbers[0]);// 1

    ArrayList<String> al1 = new ArrayList<>();
    al1.add("str");
    ArrayList<String> al2 = new ArrayList<>(al1);

    String[] sarr = { "str1", "str2" };
    ArrayList<String> al3 = new ArrayList<>(Arrays.asList(sarr));

    String[] sarr2 = al3.toArray(new String[] {});
  }
}
