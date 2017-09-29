package ru.mephi.java.ch04.sec05;

import java.lang.reflect.Constructor;

public class ConstructingObjects {
  public static void main(String[] args) throws Exception {
    Class<Employee> cl = Employee.class;
    Employee e1 = cl.newInstance();
    System.out.println(e1);
    Constructor<Employee> ec = cl.getConstructor(double.class, String.class);
    Employee e2 = ec.newInstance(20, "Name");
    System.out.println(e2);
  }
}
