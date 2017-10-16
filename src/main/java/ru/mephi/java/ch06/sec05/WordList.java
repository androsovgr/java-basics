package ru.mephi.java.ch06.sec05;

import java.util.ArrayList;

public class WordList extends ArrayList<String> {

  private static final long serialVersionUID = -5207836209876694544L;

  @Override
  public boolean add(String e) {
    return isBadWord(e) ? false : super.add(e);
  }

  public String get(int i) {
    return super.get(i).toLowerCase();
  }

  public static void main(String[] args) {
    WordList words = new WordList();
    ArrayList<String> strings = words;
    strings.add("C++");
    String s1 = strings.get(0);
  }

  private boolean isBadWord(String e) {
    return e == null;
  }
}
