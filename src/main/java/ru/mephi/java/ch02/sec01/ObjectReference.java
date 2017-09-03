package ch02.sec01;

import java.time.LocalDate;
import java.util.ArrayList;

public class ObjectReference {
  public static void main(String[] args) {
    ArrayList<String> friends = new ArrayList<>();
    friends.add("Peter");
    ArrayList<String> people = friends;
    people.add("Paul");
    System.out.println(friends);// [Peter, Paul]
    LocalDate date = LocalDate.of(2017, 9, 1);
    date = date.plusDays(1);
    date = null;
  }
}
