package ru.mephi.java.ch06.sec03;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class TypeBounds {
  public static <T extends AutoCloseable> void closeAll(List<T> elems) throws Exception {
    for (T elem : elems) {
      elem.close();
    }
  }

  public static void main(String[] args) throws Exception {
    List<PrintWriter> acl = Arrays.asList(new PrintWriter(""));
    closeAll(acl);
    List<String> sl = Arrays.asList("One");
    // closeAll(sl);
  }
}
