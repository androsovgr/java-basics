package ru.mephi.java.ch06.sec02;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {
  public static <T> void swap(List<T> list, int i, int j) {
    T temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }

  public static void main(String[] args) {
    List<String> list = Arrays.asList("One", "Two");
    swap(list, 0, 1);
    System.out.println(list);
  }
}
