package ru.mephi.java.ch06.sec06;

public interface Ordered<T> extends Comparable<T> {
  // public default boolean equals(T value) {
  // // Error—erasure clashes with Object.equals
  // return compareTo(value) == 0;
  // }
}
