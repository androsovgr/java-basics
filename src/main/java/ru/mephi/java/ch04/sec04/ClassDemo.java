package ru.mephi.java.ch04.sec04;

public class ClassDemo {
  public static void main(String[] args) throws ClassNotFoundException {
    Object obj = "string";
    Class<?> cl1 = obj.getClass();
    Class<?> cl2 = Class.forName("java.util.Scanner");
    Class<?> cl3 = String[].class;
    Class<?> cl4 = Runnable.class;
    Class<?> cl5 = int.class;
    Class<?> cl6 = void.class;
    System.out.println(obj.getClass() == String.class);
  }
}
