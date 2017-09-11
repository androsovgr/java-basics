package ru.mephi.java.ch03.sec03;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelAction implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Clicked no");
  }

  public static void main(String[] args) {
    Button cancelButton = new Button("Cancel");
    cancelButton.addActionListener(new CancelAction());
  }
}
