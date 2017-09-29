package ru.mephi.java.ch04.sec05;

import java.lang.reflect.Array;

public class WorkingWithArrays {
  public static void main(String[] args) {
    Employee[] employees1 = { new Employee(20, "Name") };
    Employee[] employees2 = (Employee[]) copyOf(employees1, 2);
    System.out.println(employees2.length);
  }

  public static Object copyOf(Object array, int newLength) {
    Class<?> cl = array.getClass();
    if (!cl.isArray())
      return null;
    Class<?> componentType = cl.getComponentType();
    int length = Array.getLength(array);
    Object newArray = Array.newInstance(componentType, newLength);
    for (int i = 0; i < Math.min(length, newLength); i++)
      Array.set(newArray, i, Array.get(array, i));
    return newArray;
  }
}
