package ru.mephi.java.ch04.sec01;

public class Employee {
  private String name;
  private double salary;
  protected Employee supervisor;

  public Employee() {
  }

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void worksFor(Employee e) {
    this.supervisor = e;
  }

  public Employee getSupervisor() {
    return supervisor;
  }

  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }

  public String getName() {
    return name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }
}
