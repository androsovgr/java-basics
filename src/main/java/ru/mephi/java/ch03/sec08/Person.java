package ru.mephi.java.ch03.sec08;

public class Person {

  private final String lastName;
  private final String firstName;
  private final String middleName;

  public Person(String lastName, String firstName) {
    super();
    this.lastName = lastName;
    this.firstName = firstName;
    middleName = null;
  }

  public Person(String lastName, String firstName, String middleName) {
    super();
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

}
