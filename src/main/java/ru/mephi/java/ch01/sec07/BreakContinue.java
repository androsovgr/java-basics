package ch01.sec07;

public class BreakContinue {
  public static void main(String[] args) {
while (true) {
  double val = Math.random() * 10 - 5;
  if (val < 0) {
    System.out.println("Negative value. Skip it");
    continue;
  } else if (val > 4.5) {
    System.out.printf("Value is %f. break\n", val);
    break;
  }
  System.out.printf("Positive value: %f\n", val);
}
  }
}
