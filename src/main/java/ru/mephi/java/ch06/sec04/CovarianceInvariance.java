package ru.mephi.java.ch06.sec04;

import java.util.ArrayList;

public class CovarianceInvariance {
  public static void main(String[] args) {
    covariance();
  }

  private static void covariance() {
    Manager[] bosses = { new Manager("Boss", 20, 20), null };
    Employee[] employees = bosses;
    Employee boss = employees[0];
    System.out.println(boss);
    employees[1] = new Employee("Mike", 10);
  }

  private static void invariance() {
    ArrayList<Manager> bosses = new ArrayList<>();
    // ArrayList<Employee> empls = bosses;
    // empls.add(new Employee("Mike", 10));
  }
}
