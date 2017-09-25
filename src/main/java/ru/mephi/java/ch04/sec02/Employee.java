package ru.mephi.java.ch04.sec02;

public class Employee {
  private double salary;

  public Employee(double salary) {
    super();
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [salary=" + salary + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(salary);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
      return false;
    return true;
  }

}
