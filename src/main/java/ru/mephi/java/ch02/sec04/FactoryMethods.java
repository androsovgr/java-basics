package ch02.sec04;

import java.text.NumberFormat;

public class FactoryMethods {
  public static void main(String[] args) {
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    NumberFormat percentFormatter = NumberFormat.getPercentInstance();
    double x = 0.1;
    // Prints $0.10
    System.out.println(currencyFormatter.format(x));
    // Prints 10%
    System.out.println(percentFormatter.format(x));
  }
}
