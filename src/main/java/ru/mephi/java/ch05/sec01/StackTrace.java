package ru.mephi.java.ch05.sec01;

public class StackTrace {
  public static void main(String[] args) {
    (new Thread(() -> {
      throw new RuntimeException("ops");
    })).start();
    (new Thread(() -> {
      Thread.setDefaultUncaughtExceptionHandler((th, ex) -> {
        ex.printStackTrace(System.out);
      });
      throw new RuntimeException("ops");
    })).start();
    try {
      Thread.sleep(1000);
      Class.forName("Not exists");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
