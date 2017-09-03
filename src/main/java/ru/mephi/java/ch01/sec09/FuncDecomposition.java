package ru.mephi.java.ch01.sec09;

public class FuncDecomposition {
  public static void main(String[] args) {
    double a = Math.random() * 20;
    double b = Math.random() * 50;
    double result = average(a, b);
    System.out.printf("average of %f and %f is %f", a, b, result);
  }

  private static double average(double x, double y) {
    double sum = x + y;
    return sum / 2;
  }
}
