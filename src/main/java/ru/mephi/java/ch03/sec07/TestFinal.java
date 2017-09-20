package ru.mephi.java.ch03.sec07;

import java.util.function.IntConsumer;

public class TestFinal {
  public void test1() {
    int i = 0;
    // Runnable r = () -> System.out.println(i);
    i--;
  }

  public void test2() {
    String s = "o";
    // Runnable r = () -> System.out.println(s += "lolo");
  }

  public void test3() {
    int[] a = { 1 };
    Runnable r = () -> System.out.println(a[0]++);
    a[0]--;
  }

  public void test4() {
    int i = 0;
    IntConsumer ic = arg -> arg++;
    ic.accept(i);
  }
}
