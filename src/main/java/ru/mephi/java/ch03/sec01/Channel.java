package ru.mephi.java.ch03.sec01;

import java.io.Closeable;

public interface Channel extends Closeable {
  boolean isOpen();
}
