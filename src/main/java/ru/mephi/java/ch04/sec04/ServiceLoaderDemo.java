package ru.mephi.java.ch04.sec04;

import java.util.ServiceLoader;

public class ServiceLoaderDemo {
  public static final ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

  public static void main(String[] args) {
    System.out.println(getCipher(1));
  }

  public static Cipher getCipher(int minStrength) {
    for (Cipher cipher : cipherLoader)
      if (cipher.strength() >= minStrength)
        return cipher;
    return null;
  }
}
