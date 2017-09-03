package ch02.sec03;

import java.util.ArrayList;

import ch02.sec02.Employee;

public class ImplementingConstructors {
  public static void main(String[] args) {
    Employee e = new Employee("James", 20);
    ArrayList<Employee> eList = new ArrayList<>();
    eList.add(new Employee("Mike", 25));
  }
}
