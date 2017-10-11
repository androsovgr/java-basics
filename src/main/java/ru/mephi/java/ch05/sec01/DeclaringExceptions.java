package ru.mephi.java.ch05.sec01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Arrays;
import java.util.List;

public class DeclaringExceptions {
  public void testList() {
    List<String> l = Arrays.asList("str1", "str2");
    // l.forEach(obj -> write(obj, "out.dat"));
  }

  public void catchDemo() {
    String obj = "str";
    String filename = "out.dat";
    try {
      write(obj, filename);
    } catch (Exception e) {
      /* ... */ }
    try {
      write(obj, filename);
    } catch (FileNotFoundException e) {
      /* ... */ } catch (IOException e) {
      /* ... */ } catch (ReflectiveOperationException e) {
      /* ... */ }
    try {
      write(obj, filename);
    } catch (ReflectiveOperationException | FileNotFoundException e) {
      /* ... */
    } catch (IOException e) {
      /* ... */ }
  }

  /**
   * 
   * @param obj
   * @param filename
   * @throws NullPointerException
   *           if filename is null
   * @throws FileNotFoundException
   *           if there is no file with name filename
   */
  public void write(Object obj, String filename) throws IOException, ReflectiveOperationException {

  }

  public void write2(Object obj, String filename)
      throws FileNotFoundException, FileSystemException, ReflectiveOperationException {

  }

  public void write3(Object obj, String filename) throws Exception {

  }

}
