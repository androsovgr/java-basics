package ru.mephi.java.ch04.sec04;

public class MyClassLoader extends ClassLoader {
  @Override
  public Class<?> findClass(String name) throws ClassNotFoundException {
    byte[] bytes = loadFromDatabase(name);
    return defineClass(name, bytes, 0, bytes.length);
  }

  private byte[] loadFromDatabase(String name) {
    // some logic
    return null;
  }
}
