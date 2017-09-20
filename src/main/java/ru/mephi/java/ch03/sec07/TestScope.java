package ru.mephi.java.ch03.sec07;

import java.util.function.Consumer;

public class TestScope {
  public void test1() {
    int i = 0;
    // Consumer<String> cs = i -> System.out.println(i);
  }

  public void test2(int i) {
    Consumer<String> cs = s -> System.out.println(i);
  }

  private void test3() {
    Consumer<String> cs = i -> System.out.println(i);
    int i = 0;
  }
}
