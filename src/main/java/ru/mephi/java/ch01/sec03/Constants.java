package ch01.sec03;

public class Constants {
  public static final int STATIC_CONSTANT = 1;
  public final int REGULAR_CONSTANT = 1;

  public static void main(String[] args) {
    final double conts1 = 1;
    final int const2;
    if (Math.random() > 0.5) {
      const2 = 1;
    } else {
      const2 = 2;
    }
  }
}
