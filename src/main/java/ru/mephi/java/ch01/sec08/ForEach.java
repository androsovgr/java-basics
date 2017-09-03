package ru.mephi.java.ch01.sec08;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {
  public static void main(String[] args) {
int[] numbers = { 1, 2, 123, 41, 3412, 3213, 123 };
for (int i = 0; i < numbers.length; i++) {
  int j = numbers[i];
  System.out.println(j);
}
for (int i : numbers) {
  System.out.println(i);
}
ArrayList<String> names = new ArrayList<>(Arrays.asList("Ann", "Vanya"));
for (int i = 0; i < names.size(); i++) {
  String name = names.get(i);
  System.out.println(name);
}
for (String name : names) {
  System.out.println(name);
}
  }
}
