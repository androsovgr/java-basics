package ru.mephi.java.ch06.sec05;

import ru.mephi.java.ch06.sec01.Entry;

public class CastInsertion {
  public static void main(String[] args) {
    Entry<String, Integer> e1 = new Entry<String, Integer>("str", 1);
    // Entry<String, Integer> e2 = new Entry<String, Integer>("String",
    // "String");
    Entry<String, Integer> e3 = (Entry<String, Integer>) new Entry("str", "str");
    int i = e3.getValue();
    // compiles into
    // int i = (Object) e3.getValue()
  }
}
