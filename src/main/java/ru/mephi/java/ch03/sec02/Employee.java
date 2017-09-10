package ru.mephi.java.ch03.sec02;

public class Employee implements Person, Identified {

  private String name;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getId() {
    return Identified.super.getId();
  }
}
