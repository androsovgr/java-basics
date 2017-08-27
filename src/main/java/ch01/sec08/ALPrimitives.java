package ch01.sec08;

import java.util.ArrayList;

public class ALPrimitives {
  public static void main(String[] args) {
    // not allowed
    // ArrayList<int> n = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(12);
    int i = numbers.get(0);
  }
}
