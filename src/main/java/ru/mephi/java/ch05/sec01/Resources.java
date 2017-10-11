package ru.mephi.java.ch05.sec01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Resources {
  public void unsafe() throws IOException {
    List<String> lines = Arrays.asList("s1", "s2", "s3");
    PrintWriter out = new PrintWriter("output.txt");
    for (String line : lines) {
      out.println(line.toLowerCase());
    }
    out.close();
  }

  public void safe() throws IOException {
    List<String> lines = Arrays.asList("s1", "s2", "s3");
    try (PrintWriter out = new PrintWriter("output.txt")) {
      for (String line : lines) {
        out.println(line.toLowerCase());
      }
    }
  }

  public static void main(String[] args) throws IOException {
    multipleResources("C:\\tmp\\1.txt", "C:\\tmp\\2.txt");
  }

  public static void multipleResources(String from, String to) throws IOException {
    try (FileInputStream fis = new FileInputStream(from); FileOutputStream fos = new FileOutputStream(to)) {
      while (fis.available() > 0) {
        byte[] barr = new byte[fis.available()];
        fis.read(barr);
        fos.write(barr);
      }
    }
  }
}
