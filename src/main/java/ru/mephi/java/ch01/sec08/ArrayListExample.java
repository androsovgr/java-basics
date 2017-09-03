package ch01.sec08;

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Ann");
    names.add("Peter");
    String deleted = names.remove(1);
    names.add(0, deleted);
    names.set(1, "Mary");
    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      System.out.println(name);
    }
    System.out.println(names);
    // [Peter, Mary]
  }
}
