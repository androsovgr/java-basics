package ru.mephi.java.ch05.sec01;

import java.util.Objects;

public class MyClass {
  private String directories;

  public MyClass(String directories) {
    super();
    this.directories = Objects.requireNonNull(directories, "Directories can't be null");
  }

  public static void main(String[] args) {
    MyClass mc = new MyClass(null);
  }
}
