package ru.mephi.java.ch04.sec05;

public class Employee {
  private double salary;
  private String name;

  @Override
  public String toString() {
    return "Employee [salary=" + salary + ", name=" + name + "]";
  }

  public Employee() {
  }

  public Employee(double salary, String name) {
    super();
    this.salary = salary;
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
