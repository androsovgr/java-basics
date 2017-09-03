package ru.mephi.java.ch01.sec07;

public class IfStatement {
  public static void main(String[] args) {
    int count = (int) (Math.random() * 10);
    double sum = Math.random() * 20;
    double average;
    if (count > 0) {
      average = sum / count;
    } else if (count == 0) {
      average = 0;
    } else {
      throw new IllegalArgumentException("Value " + count + " is invalid");
    }
    System.out.println(average);
  }
}
