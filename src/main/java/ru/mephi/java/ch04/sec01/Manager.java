package ru.mephi.java.ch04.sec01;

public class Manager extends Employee {
  private double bonus;

  // ...
  public Manager(String name, double salary) {
    super(name, salary);
  }

  public Manager() {
  }

  // @Override
  // public void worksFor(Manager e) {
  // this.supervisor = e;
  // }
  //
  // @Override
  // Manager getSupervisor() {
  // return (Manager) supervisor;
  // }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public double getSalary() {
    return super.getSalary() + bonus;
  }
}
