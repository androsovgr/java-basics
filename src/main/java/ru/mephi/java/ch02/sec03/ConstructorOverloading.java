package ch02.sec03;

import ch02.sec02.Employee;

public class ConstructorOverloading {
  public static void main(String[] args) {
    Employee e1 = new Employee("James", 50);
    Employee e2 = new Employee(60);
  }
}
