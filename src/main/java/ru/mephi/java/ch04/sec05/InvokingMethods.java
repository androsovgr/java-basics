package ru.mephi.java.ch04.sec05;

import java.lang.reflect.Method;

public class InvokingMethods {
  public static void main(String[] args) throws Exception {
    Object obj = new Employee(10, "Lana");
    Method m = obj.getClass().getDeclaredMethod("setName", String.class);
    m.invoke(obj, "**");
    System.out.println(obj);
  }
}
