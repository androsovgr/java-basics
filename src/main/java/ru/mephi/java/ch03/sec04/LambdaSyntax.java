package ru.mephi.java.ch03.sec04;

import java.awt.event.ActionListener;
import java.util.Comparator;

public class LambdaSyntax {
  public static void main(String[] args) {
    Comparator<String> c = (String first, String second) -> first.length() - second.length();
    Comparator<String> c2 = //
        (String first, String second) -> {
          int difference = first.length() - second.length();
          if (difference < 0)
            return -1;
          else if (difference > 0)
            return 1;
          else
            return 0;
        };

    Runnable task = () -> {
      for (int i = 0; i < 1000; i++)
        System.out.println(i);
    };

    Comparator<String> comp = (first, second) -> first.length() - second.length();

    ActionListener listener = event -> System.out.println("Oh noes!");
  }
}
