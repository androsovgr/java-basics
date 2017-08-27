package ch01.sec08;

public class ClArguments {
public static void main(String[] args) {
  for (int i = 0; i < args.length; i++) {
    String arg = args[i];
    if (arg.equals("-h")) {
      arg = "Hello";
    } else if (arg.equals("-g")) {
      arg = "Goodbye";
    }
    System.out.println(arg);
  }
}
}
