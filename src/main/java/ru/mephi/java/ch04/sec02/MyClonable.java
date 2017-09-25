package ru.mephi.java.ch04.sec02;

import java.util.ArrayList;
import java.util.List;

public class MyClonable implements Cloneable {
  private final long id;
  private final String message;
  private final List<String> recipients;
  private final String[] properties;

  public MyClonable(long id, String message, List<String> recipients, String[] properties) {
    super();
    this.id = id;
    this.message = message;
    this.recipients = recipients;
    this.properties = properties;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    List<String> recipientsClone = new ArrayList<>(recipients);
    String[] propertiesClone = properties.clone();
    MyClonable cloned = new MyClonable(id, message,
        recipientsClone, propertiesClone);
    return cloned;
  }
}
