package ru.mephi.java.ch04.sec01;

public class Anonymus {
  public static void main(String[] args) {
    Person p = new Person("Mike") {
      int id = (int) (Math.random() * Integer.MAX_VALUE);

      @Override
      public int getId() {
        return id;
      }
    };
    System.out.println(p.getId());
  }
}
