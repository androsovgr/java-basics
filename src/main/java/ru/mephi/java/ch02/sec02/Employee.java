package ch02.sec02;

public class Employee {
  private String name;
  private double salary;

  public Employee() {
  }

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public Employee(double salary) {
    this.name = "";
    this.salary = salary;
  }

  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }

  public String getName() {
    return name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public static void main(String[] args) {
    Employee fred = new Employee();
    fred.name = "Fred";
    fred.salary = 100;
    fred.raiseSalary(5);
    double byPercent = 5;
    double raise = fred.salary * byPercent / 100;
    fred.salary += raise;
  }
}
