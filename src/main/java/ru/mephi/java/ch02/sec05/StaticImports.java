package ru.mephi.java.ch02.sec05;

import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
//import static java.lang.Math.*;

public class StaticImports {
  public static void main(String[] args) {
    double result = pow(E, PI);
    // double result = Math.pow(Math.E, Math.PI);
    System.out.println(result);
  }
}
