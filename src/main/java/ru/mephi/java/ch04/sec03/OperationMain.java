package ru.mephi.java.ch04.sec03;

public class OperationMain {
  public static void main(String[] args) {
    demo(5, 6);
    System.out.println(calc(Operation.MULTIPLY, 2, 2));
  }

  public static void demo(int first, int second) {
    for (Operation op : Operation.values()) {
      System.out.printf("%d %s %d is %d%n", first, op, second, op.eval(first, second));
    }
  }

  private static int calc(Operation op, int arg1, int arg2) {
int result = 0;
switch (op) {
case ADD:
  result = arg1 + arg2;
  break;
case SUBTRACT:
  result = arg1 - arg2;
  break;
case MULTIPLY:
  result = arg1 * arg2;
  break;
case DIVIDE:
  result = arg1 / arg2;
  break;
}
    return result;
  }
}
