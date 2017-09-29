package ru.mephi.java.ch04.sec05;

import java.lang.reflect.Field;

public class InspectingObjects {
  public static void main(String[] args) throws Exception {
    Object obj = new Employee(20, "Mike");
    for (Field f : obj.getClass().getDeclaredFields()) {
      f.setAccessible(true);
      Object value = f.get(obj);
      System.out.println(f.getName() + ":" + value);
    }
    // salary:20.0
    // name:Mike
    Field f = obj.getClass().getDeclaredField("salary");
    f.setAccessible(true);
    double value = f.getDouble(obj);
    f.setDouble(obj, value * 1.1);
    System.out.println(obj);
    // Employee [salary=22.0, name=Mike]
  }
}
