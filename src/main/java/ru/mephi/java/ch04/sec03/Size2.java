package ru.mephi.java.ch04.sec03;

public enum Size2 {
  SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
  private final String abbreviation;

  Size2(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }
}