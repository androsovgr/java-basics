package ru.mephi.java.ch02.sec06;

import ru.mephi.java.ch02.sec06.Network.Member;

public class NetworkMain {
  public static void main(String[] args) {
    Network n = new Network();
    Member mike = n.enroll("Mike");
    Member ilya = n.new Member("Ilya");
    System.out.printf("%s\n%s", mike, ilya);
  }
}
