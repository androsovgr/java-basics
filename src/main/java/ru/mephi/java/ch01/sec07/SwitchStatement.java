package ru.mephi.java.ch01.sec07;

public class SwitchStatement {
  public static void main(String[] args) {
    int count = (int) (Math.random() * 10);
    String output;
    switch (count) {
    case 0:
      output = "None";
      break;
    case 1:
      output = "One";
      break;
      case 2:
    default:
      output = "Many";
      break;
    }
    System.out.println(output);
  }
}
