package ru.mephi.java.ch03.sec05;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class MethodReferences {
  public static void main(String[] args) {
    String[] strings = { "str", "str1", "str22" };

    Arrays.sort(strings, (x, y) -> x.compareToIgnoreCase(y));
    Arrays.sort(strings, String::compareToIgnoreCase);

    List<String> list = new ArrayList<>(asList(strings));
    list.add(null);
    System.out.println(list);

    list.removeIf(s -> Objects.isNull(s));
    list.removeIf(Objects::isNull);

    list.forEach(s -> System.out.println(s));
    list.forEach(System.out::println);
  }

  public static void q1() {
    Supplier<Double> sd1 = Math::random;
    Supplier<Double> sd2 = sd1::get;
    Comparator<Integer> comp = Integer::compareTo;
  }
}
