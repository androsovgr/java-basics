package ru.mephi.java.ch04.sec01;

public class Casts {
  public static void main(String[] args) {
    Employee empl = new Manager("manager", 1000);
    // empl.setBonus(10000);
    if (empl instanceof Manager) {
      ((Manager) empl).setBonus(200);
    }
  }
}
