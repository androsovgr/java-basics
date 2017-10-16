package ru.mephi.java.ch06.sec04;

public class Manager extends Employee {
  private final double bonus;

  public Manager(String name, double salary, double bonus) {
    super(name, salary);
    this.bonus = bonus;
  }

  public double getBonus() {
    return bonus;
  }
}
