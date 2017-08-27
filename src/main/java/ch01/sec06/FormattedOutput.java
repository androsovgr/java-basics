package ch01.sec06;

public class FormattedOutput {
  public static void main(String[] args) {
    System.out.println("I have " + 5 + " apples");
    // I have 5 apples
    System.out.printf("I have %d apples\n", 5);
    // I have 5 apples
    System.out.printf("Earth population is about %,d humans", 9000000000L);
    // Earth population is about 9 000 000 000 humans
  }
}
