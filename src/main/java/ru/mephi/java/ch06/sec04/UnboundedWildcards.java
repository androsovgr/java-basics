package ru.mephi.java.ch06.sec04;

import java.util.ArrayList;

public class UnboundedWildcards {
  public static boolean hasNulls(ArrayList<?> elements) {
    for (Object e : elements) {
      if (e == null)
        return true;
    }
    return false;
  }
}
