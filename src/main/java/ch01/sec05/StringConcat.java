package ch01.sec05;

public class StringConcat {
  public static void main(String[] args) {
String location = "Moscow";
String phase = "I'm in " + location;
System.out.println(phase);// I'm in Moscow
String names[] = { "Anna", "Piter", "Paul" };
// join
String joined = String.join(", ", names);
System.out.println(joined);// Anna, Piter, Paul
// sb
StringBuilder sb = new StringBuilder();
for (String name : names) {
  sb.append(name).append(", ");
}
String builded = sb.toString();
System.out.println(builded);// Anna, Piter, Paul,
  }
}
