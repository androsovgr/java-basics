package ch01.sec07;

public class LabeledBreakContinue {
  public static void main(String[] args) {
    myLabel: while (true) {
      while (true) {
        while (true) {
          break myLabel;
        }
      }
    }
    System.out.println("Finished");
  }
}
