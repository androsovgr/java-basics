package ch01.sec03;

public class VariableInitialization {
  public static void notInitialized() {
    int count;
    if (Math.random() > 0.5) {
      count = 0;
    } else {
      // count++; // might be not initialized
    }
  }

  public static void initialized() {
    int count;
    if (Math.random() > 0.5) {
      count = 0;
    } else {
      count = 1;
    }
  }

  public static void earlyInitialization() {
    double count = 0;
    // ...
    count = Math.random();
  }
}
