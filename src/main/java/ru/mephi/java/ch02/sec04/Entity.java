package ch02.sec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entity {
  private static int lastId = 0;
  private static final String RACE_HUMAN = "Human";
  private static final List<String> NAMES;

  static {
    List<String> names = new ArrayList<>();
    names.add("Ann");
    names.add("Vasya");
    NAMES = Collections.unmodifiableList(names);
  }

  private final int id;

  public Entity() {
    id = lastId++;
  }
}
