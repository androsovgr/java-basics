package ru.mephi.java.ch03.sec03;

public class Employee implements Comparable<Employee> {
  private double salary;

  public Employee(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [salary=" + salary + "]";
  }

  @Override
  public int compareTo(Employee o) {
    return Double.compare(salary, o.salary);
  }
}
