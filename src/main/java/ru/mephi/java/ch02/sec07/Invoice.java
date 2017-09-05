package ru.mephi.java.ch02.sec07;

import ru.mephi.java.ch02.sec02.Employee;

/**
 * An <code>Invoice</code> object represents an invoice with line items for each
 * part of the order.
 * 
 * @author Fred Flintstone
 * @author Barney Rubble
 * @version 1.1
 * @since 1.0
 */
public class Invoice {

  /**
   * The number of days per year on Earth (excepting leap years)
   */
  public static final int DAYS_PER_YEAR = 365;

  double salary;

  /**
   * Raises the salary of an employee.
   * 
   * @param byPercent
   *          the percentage by which to raise the salary (e.g., 10 means 10%)
   * @return the amount of the raise
   */
  public double raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
    return raise;
  }

  /**
   * @deprecated deprecated
   * @since 1.1
   */
  @Deprecated
  public void deprecatedSince() {

  }

  /**
   * You can place hyperlinks there {@link Employee#setSalary(double)}
   * 
   * @see Employee
   */
  public void seeLink() {

  }
}
