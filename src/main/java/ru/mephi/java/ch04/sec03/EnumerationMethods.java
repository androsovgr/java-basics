package ru.mephi.java.ch04.sec03;

public class EnumerationMethods {
  public static void main(String[] args) {
Size s1 = Size.SMALL;
Size s2 = Size.SMALL;
System.out.println(s1 == s2);
System.out.println(Size.SMALL);
Size notMySize = Size.valueOf("SMALL");
for (Size s : Size.values()) {
  System.out.println(s);
}
System.out.println(Size.MEDIUM.ordinal() - Size.SMALL.ordinal());
System.out.println(Size.MEDIUM instanceof Comparable);
  }
}
