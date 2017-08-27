package ch01.sec08;

import java.util.Arrays;

public class ArraysExample {
  public static void main(String[] args) {
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (i * Math.random());
    }

    String[] names = { "Ann", "Yana" };
    // String name = names[3];// ArrayIndexOutOfBoundsException

    System.out.println(names);
    // [Ljava.lang.String;@6d06d69c
    System.out.println(Arrays.toString(names));
    // [Ann, Yana]
  }
}
