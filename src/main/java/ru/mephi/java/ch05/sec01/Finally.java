package ru.mephi.java.ch05.sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Finally {
  public static void main(String[] args) {
    sout(Paths.get("C:\\tmp\\1.txt"));
  }

  private static void sout(Path path) {
    BufferedReader in = null;
    try {
      in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
      for (String s = in.readLine(); s != null; s = in.readLine()) {
        System.out.println(s);
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}
