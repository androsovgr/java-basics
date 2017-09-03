package ru.mephi.java.ch02.sec03;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private final String name = "Peter";
  private final int age;
  private final List<String> hobbies;

  public Person() {
    age = 11;
  }

  {
    hobbies = new ArrayList<>();
  }
/*
  public Person(String name, int age, List<String> hobbies) {
    super();
    this.name = name;
    this.age = age;
    this.hobbies = hobbies;
  }
*/
}
