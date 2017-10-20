package ru.mephi.java.ch06.sec06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RawAtRuntime {
  public static void main(String[] args) {
    Object a = new ArrayList<>();
    // if (a instanceof ArrayList<String>) {
    // }
    if (a instanceof ArrayList) {
      @SuppressWarnings("unchecked")
      ArrayList<String> slist = (ArrayList<String>) a;
    }
    List<String> slist = Collections.checkedList(new ArrayList<>(), String.class);
    List<Object> olist = (List) slist;
    olist.add("str");
    olist.add(1);
    Class<? extends List> cl = slist.getClass();
  }

  public static <T> void genericMethod() {
    // Class<T> c= T.class;
    // Class<T[]>c2=T[].class;
    // Class<ArrayList<T>>c3=ArrayList<T>.class;
  }
}
