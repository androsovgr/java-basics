package ru.mephi.java.ch02.sec02;

public class CallByValue {
  public static void main(String[] args) {
    double d = 20;
    primitiveExample(d);
    System.out.println(d);// not changed
    Employee e = new Employee("Ilya", 20);
    objectReferenceExample(e);// not changed
    System.out.println(e);
    objectMutateExample(e);// changed
  }

  private static void primitiveExample(double d) {
    d -= 20;
  }

  private static void objectReferenceExample(Employee e) {
    e = null;
  }

  private static void objectMutateExample(Employee e) {
    e.raiseSalary(10);
  }
}

// ------
