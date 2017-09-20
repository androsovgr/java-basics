package ru.mephi.java.ch03.sec07;

public class AccessingEnclosingScope {

  public static void main(String[] args) {
    repeatMessage("Hello", 10);
  }

  public static void repeatMessage(String text, int count) {
    Runnable r = () -> {
      for (int i = 0; i < count; i++) {
        System.out.println(text);
      }
    };
    new Thread(r).start();
  }

  private void test2(int n) {
    for (int i = 0; i < n; i++) {
      // new Thread(() -> System.out.println(i)).start();
    }
    String[] args = { "arg1", "arg2" };
    for (String arg : args) {
      new Thread(() -> System.out.println(arg)).start();
    }
  }

  public static void repeatMessage(String text, int count, int threads) {
    Runnable r = () -> {
      while (count > 0) {
        // count--;
        System.out.println(text);
      }
    };
    for (int i = 0; i < threads; i++)
      new Thread(r).start();
  }
}
