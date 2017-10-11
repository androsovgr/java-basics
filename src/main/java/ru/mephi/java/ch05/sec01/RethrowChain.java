package ru.mephi.java.ch05.sec01;

import java.io.FileNotFoundException;

public class RethrowChain {
  public static void main(String[] args) throws MyApplicationException {
    demo();
  }

  private static void demo() throws MyApplicationException {
    try {
      doWithException();
    } catch (MyApplicationException e) {
      System.out.println("Go application exception:" + e.getMessage());
      throw e;
    } catch (FileNotFoundException e) {
      throw new MyApplicationException("Chained", e);
    }

  }

  private static void doWithException() throws MyApplicationException, FileNotFoundException {
    double rnd = Math.random();
    if (rnd > 0.5) {
      throw new MyApplicationException("Got " + rnd);
    } else {
      throw new FileNotFoundException("Got " + rnd);
    }
  }
}
