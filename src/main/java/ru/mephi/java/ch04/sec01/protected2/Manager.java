package ru.mephi.java.ch04.sec01.protected2;

import ru.mephi.java.ch04.sec01.protected1.Employee;

public class Manager extends Employee {
  private double bonus;

  public double getSalary() {
    return bonus + salary;
  }
}
