package ru.mephi.java.ch04.sec02;

public class Manager extends Employee {
  private double bonus;

  public Manager(double salary, double bonus) {
    super(salary);
    this.bonus = bonus;
  }

  @Override
  public String toString() {
    return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(bonus);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    // ...
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Manager other = (Manager) obj;
    if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
      return false;
    return true;
  }

}
