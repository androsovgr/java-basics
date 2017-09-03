package ru.mephi.java.ch01.sec05;

import java.util.Arrays;

public class Substrings {
  public static void main(String[] args) {
String s1 = "0123456789";
String substred = s1.substring(1, 3);
System.out.println(substred);//12
String s2 = "Peter, Paul; Mary, Ann";
String[] splitted = s2.split("[,;]\\s");
System.out.println(Arrays.toString(splitted));
//[Peter, Paul, Mary, Ann]
  }
}
