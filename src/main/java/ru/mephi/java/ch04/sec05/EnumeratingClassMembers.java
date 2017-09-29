package ru.mephi.java.ch04.sec05;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class EnumeratingClassMembers {
  public static void main(String[] args) throws Exception {
    enumerate(String.class.getName());
  }

  private static void enumerate(String className) throws Exception {
    Class<?> cl = Class.forName(className);
    while (cl != null) {
      for (Field f : cl.getDeclaredFields()) {
        System.out.printf("%s %s %s%n", Modifier.toString(f.getModifiers()), f.getType().getCanonicalName(),
            f.getName());
      }
      for (Method m : cl.getDeclaredMethods()) {
        System.out.printf("%s %s %s %s%n", Modifier.toString(m.getModifiers()), m.getReturnType().getCanonicalName(),
            m.getName(), Arrays.toString(m.getParameters()));
      }
      cl = cl.getSuperclass();
    }
  }
}
