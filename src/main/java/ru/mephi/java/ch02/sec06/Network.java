package ru.mephi.java.ch02.sec06;

import java.util.ArrayList;

public class Network {
  private ArrayList<Member> members = new ArrayList<>();

  public Member enroll(String name) {
    Member newMember = new Member(name);
    members.add(newMember);
    return newMember;
  }

  public class Member {
    private String name;

    public Member(String name) {
      this.name = name;
    }

    public void leave() {
      members.remove(this);
    }

    public boolean belongsTo(Network n) {
      return Network.this == n;
    }
  }
}
