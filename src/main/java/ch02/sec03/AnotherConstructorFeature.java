package ch02.sec03;

public class AnotherConstructorFeature {
  private static class Employee {
    private String name = "";
    private double salary;
    {
      salary = 20;
    }

    public Employee(double salary) {
      this("", salary);
    }

    public Employee(String name) {
      this.name = name;
    }

    public Employee(String name, double salary) {
      super();
      this.name = name;
      this.salary = salary;
    }

    public Employee() {
      this("", 0);
    }

  }
}
