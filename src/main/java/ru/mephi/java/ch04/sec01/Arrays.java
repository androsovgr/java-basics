package ru.mephi.java.ch04.sec01;

public class Arrays {
  public static void main(String[] args) {
    Employee[] staff = { new Employee("emp", 100), new Manager("mgr", 150) };
    double sumSalary = 0;
    for (Employee employee : staff) {
      sumSalary += employee.getSalary();
    }
    System.out.println(sumSalary);

    Manager[] mgrs = { new Manager("mgr2", 160), null };
    Employee[] emps = mgrs;
    emps[1] = new Employee("emp2", 100);
  }
}
