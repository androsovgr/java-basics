package ru.mephi.java.ch04.sec04;

import java.io.InputStream;
import java.util.Scanner;

public class LoadingResources {
  public static void main(String[] args) {
    InputStream is = LoadingResources.class.getResourceAsStream("my.txt");
    Scanner sc = new Scanner(is);
    System.out.println(sc.nextLine());
    sc.close();
    InputStream is2 = LoadingResources.class.getResourceAsStream("/ru/mephi/java/ch04/sec04/my.txt");
    Scanner sc2 = new Scanner(is2);
    System.out.println(sc2.nextLine());
    sc2.close();
  }
}
