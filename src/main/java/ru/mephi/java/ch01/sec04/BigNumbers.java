package ru.mephi.java.ch01.sec04;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
  public static void main(String[] args) {
    BigInteger i1 = BigInteger.valueOf(1L);
    BigInteger i2 = new BigInteger("2");
    BigInteger i3 = i1.add(i2).multiply(BigInteger.valueOf(3));
    long l = i3.longValue();
    System.out.println(l);
    BigDecimal bd = new BigDecimal("3.14");
    double d = bd.doubleValue();
    System.out.println(d);
  }
}
