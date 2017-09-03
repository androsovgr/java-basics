package ru.mephi.java.ch02.sec01;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ClassUsageExample {
  public static void main(String[] args) {
    final int month = 9;
    LocalDate date = LocalDate.of(2017, month, 1);
    int weekOffset = date.getDayOfWeek().ordinal() - DayOfWeek.MONDAY.ordinal();
    String firstLineOffset = new String(new char[weekOffset]).replace("\0", "    ");
    System.out.print(firstLineOffset);
    while (date.getMonthValue() == month) {
      System.out.printf("%4d", date.getDayOfMonth());
      if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
        System.out.println();
      }
      date = date.plusDays(1);
    }
  }
}
