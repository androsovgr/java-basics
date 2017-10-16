package ru.mephi.java.ch06.sec04;

import java.util.ArrayList;

public class WildcardCapture {

  public static void swap1(ArrayList<?> elements, int i, int j) {
    Object temp = elements.get(i);
    // elements.set(i, elements.get(j));
    // elements.set(j, temp);
  }

  public static void swap(ArrayList<?> elements, int i, int j) {
    swapHelper(elements, i, j);
  }

  private static <T> void swapHelper(ArrayList<T> elements, int i, int j) {
    T temp = elements.get(i);
    elements.set(i, elements.get(j));
    elements.set(j, temp);
  }
}
