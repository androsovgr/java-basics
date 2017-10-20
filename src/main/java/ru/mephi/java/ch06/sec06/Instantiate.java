package ru.mephi.java.ch06.sec06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

public class Instantiate {
  public static <T> void genericMethod() {
    // T t = new T();
    // T[] tarr = new T[5];
    ArrayList<T> tList = new ArrayList<>();
  }

  public static <T> T[] repeat(int count, T obj, IntFunction<T[]> constr) {
    T[] result = constr.apply(count);
    for (int i = 0; i < count; i++) {
      result[i] = obj;
    }
    return result;
  }

  public static <T> T[] repeat2(int count, T obj, Class<T> cl) {
    @SuppressWarnings("unchecked")
    T[] result = (T[]) Array.newInstance(cl, count);
    for (int i = 0; i < count; i++) {
      result[i] = obj;
    }
    return result;
  }

  public static void main(String[] args) {
    String[] strs = repeat(10, "str", String[]::new);
    Integer[] ints = repeat2(10, 1, Integer.class);
    System.out.println(Arrays.toString(strs));
    System.out.println(Arrays.toString(ints));
  }
}
