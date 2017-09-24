package ru.mephi.java.ch04.sec01;

public class ManagerMain {
  public static void main(String[] args) {
    Manager boss = new Manager("Boss", 1000);
    boss.setBonus(500);
    boss.raiseSalary(10);

    Manager manager = new Manager("Manager", 1000);
    Employee e = manager;
    double salary = e.getSalary();
  }
}
