package ch01.sec05;

public class NumberConvertion {
  public static void main(String[] args) {
    int i = 42;
    String s1 = i + "";
    System.out.println(s1);// 42
    String s2 = Integer.toString(i);
    System.out.println(s2);// 42
    String s3 = Integer.toString(i, 2);
    System.out.println(s3);// 101010
    int i2 = Integer.parseInt(s3);
    System.out.println(i2);// 101010
    int i3 = Integer.parseInt(s3, 2);
    System.out.println(i3);// 42
  }
}
