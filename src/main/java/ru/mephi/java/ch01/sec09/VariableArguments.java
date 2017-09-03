package ru.mephi.java.ch01.sec09;

public class VariableArguments {
  public static void main(String[] args) {
    double x1 = Math.random() * 10;
    double x2 = Math.random() * 20;
    double x3 = Math.random() * 30;
    double average1 = average(x1, x2);
    double average2 = average(x1, x2, x3);
  }

  private static double average(double... values) {
    double sum = 0;
    for (double v : values) {
      sum += v;
    }
    return values.length == 0 ? 0 : sum / values.length;
  }
}
