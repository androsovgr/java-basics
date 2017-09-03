package ch01.sec06;

import java.util.Scanner;

public class ScannerUsage {
  public static void main(String[] args) {
    System.out.print("Your age: ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    System.out.print("Login: ");
    String login = sc.next();
    System.out.print("Password: ");
    String password = sc.next();
    System.out.println("Total: age=" + age + ", login=" + login + ", password=" + password);
  }
}
