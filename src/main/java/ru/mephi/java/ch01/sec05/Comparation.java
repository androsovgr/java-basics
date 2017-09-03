package ru.mephi.java.ch01.sec05;

public class Comparation {
  public static void main(String[] args) {
    String location = "Moscow";
    boolean r1 = "Moscow".equals(location);
    System.out.println(r1);// true
    boolean r2 = "MOSCOW".equalsIgnoreCase(location);
    System.out.println(r2);// true
    int r3 = "ab".compareTo("cd");
    System.out.println(r3);// -2
  }
}
