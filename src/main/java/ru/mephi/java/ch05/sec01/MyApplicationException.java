package ru.mephi.java.ch05.sec01;

import java.io.IOException;

public class MyApplicationException extends IOException {
  private static final long serialVersionUID = -4322682019827188617L;

  public MyApplicationException() {
  }

  public MyApplicationException(String message) {
    super(message);
  }

  public MyApplicationException(String message, Throwable cause) {
    super(message, cause);
  }

}
