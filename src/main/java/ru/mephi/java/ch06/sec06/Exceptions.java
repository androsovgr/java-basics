package ru.mephi.java.ch06.sec06;

import java.io.IOException;
import java.util.concurrent.Callable;

public class Exceptions {
  // public static class GenericException<T> extends Exception {
  // private static final long serialVersionUID = 1L;
  // }

  public static <T extends Throwable> void doWork(Runnable r, Class<T> cl) {
    // try {
    // r.run();
    // } catch (T ex) { // Error—can’t catch type variable
    // ex.printStackTrace();
    // }
  }

  public static <V, T extends Throwable> V doWork(Callable<V> c, T ex) throws T {
    try {
      return c.call();
    } catch (Throwable realEx) {
      ex.initCause(realEx);
      throw ex;
    }
  }

  @SuppressWarnings("unchecked")
  private static <T extends Throwable> void throwAs(Throwable e) throws T {
    throw (T) e; // The cast is erased to (Throwable) e
  }

  public static <V> V doWork(Callable<V> c) {
    try {
      return c.call();
    } catch (Throwable ex) {
      Exceptions.<RuntimeException>throwAs(ex);
      return null;
    }
  }

  public static void main(String[] args) {
    doWork(() -> {
      throw new IOException();
    });
  }
}
