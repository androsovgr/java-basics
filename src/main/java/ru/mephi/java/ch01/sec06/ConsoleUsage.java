package ru.mephi.java.ch01.sec06;

import java.io.Console;

public class ConsoleUsage {
  public static void main(String[] args) {
    // not working from IDE
    Console c = System.console();
    int age = Integer.parseInt(c.readLine("Your age: "));
    String login = c.readLine("Login: ");
    String password = new String(c.readPassword("Password: "));
    System.out.println("Total: age=" + age + ", login=" + login + ", password=" + password);
  }
}
