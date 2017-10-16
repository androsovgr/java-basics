package ru.mephi.java.ch06.sec04;

import java.util.function.Predicate;

public class SupertypeWildcards {
  public static void printAll(Employee[] staff, Predicate<? super Employee> filter) {
    for (Employee e : staff)
      if (filter.test(e))
        System.out.println(e.getName());
  }

  public static void main(String[] args) {
    Predicate<Employee> ep = e -> e.getSalary() > 10;
    Predicate<Object> op = o -> o.toString().length() > 10;
    Predicate<Manager> mp = m -> m.getBonus() > 10;
    Employee[] emps = { new Employee("Mike", 10), new Manager("Boss", 9, 30) };
    printAll(emps, ep);
    printAll(emps, op);
    // printAll(emps, mp);
  }
}
