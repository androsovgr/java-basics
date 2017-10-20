package ru.mephi.java.ch06.sec06;

public class Manager // extends Employee implements Comparable<Manager>
{
  double salary;

  // Error—cannot have two instantiations of Comparable as supertypes
  public int compareTo(Manager other) {
    return Double.compare(salary, other.salary);
  }
}