package ru.mephi.java.ch06.sec04;

import java.util.function.Predicate;

public class TypeVariableWildcard {
  private static <T> void printAll(T[] elements, Predicate<? super T> filter) {
    for (T e : elements)
      if (filter.test(e))
        System.out.println(e);
  }

  public static void main(String[] args) {
    Predicate<Object> op = o -> o.toString().length() > 4;
    printAll(new String[] { "str1", "str11" }, op);
  }
}
