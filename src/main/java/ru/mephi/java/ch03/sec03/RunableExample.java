package ru.mephi.java.ch03.sec03;

public class RunableExample {
  public static void main(String[] args) {
    Runnable helloTask = new SayMessageTask("Hello, world!", 20);
    Thread t1 = new Thread(helloTask);
    SayMessageTask goodbyeTask = new SayMessageTask("Good bye!", 20);
    Thread t2 = new Thread(goodbyeTask);
    t1.start();
    t2.start();
  }
}
