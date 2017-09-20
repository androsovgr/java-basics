package ru.mephi.java.ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMethods {
  public static void main(String[] args) {
    Person[] people = { new Person("Brathlovsky", "Ann"), new Person("Pan", "Peter"),
        new Person("Dostoevskaya", "Anna", "Dmitrievna") };
    Arrays.sort(people, Comparator.comparing(Person::getLastName));

    Arrays.sort(people, Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));

    Arrays.sort(people, Comparator.comparing(Person::getLastName, (s, t) -> s.length() - t.length()));

    Arrays.sort(people, Comparator.comparingInt(p -> p.getLastName().length()));

    Arrays.sort(people, Comparator.comparing(Person::getMiddleName, Comparator.nullsFirst(Comparator.naturalOrder())));
  }
}
