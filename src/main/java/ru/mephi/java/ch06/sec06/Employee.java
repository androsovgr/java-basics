package ru.mephi.java.ch06.sec06;

public class Employee implements Comparable<Employee> {
  String name;

  public int compareTo(Employee other) {
    return name.compareTo(other.name);
  }
}
