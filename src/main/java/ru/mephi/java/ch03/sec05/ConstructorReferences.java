package ru.mephi.java.ch03.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Supplier;

public class ConstructorReferences {
  public static void main(String[] args) {
    LongFunction<Long> longF = Long::new;
    IntFunction<Integer[]> intF = Integer[]::new;
    Supplier<List<String>> sup = ArrayList<String>::new;
  }
}
