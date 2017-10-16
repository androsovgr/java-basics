package ru.mephi.java.ch06.sec04;

import static java.util.Arrays.asList;

import java.util.ArrayList;

public class SubtypeWildcard {

  private static void printNames(ArrayList<? extends Employee> staff) {
    for (int i = 0; i < staff.size(); i++) {
      Employee e = staff.get(i);
      System.out.println(e.getName());
    }
  }

  public static void main(String[] args) {
    ArrayList<Manager> bosses = new ArrayList<>(asList(new Manager("Boss", 20, 20)));
    printNames(bosses);
    writeToList(bosses);
  }

  private static void writeToList(ArrayList<? extends Employee> emps) {
    Employee e1 = new Employee("Mike", 10);
    Manager m1 = new Manager("Boss", 20, 20);
    // emps.add(e1);
    // emps.add(m1);
  }
}
