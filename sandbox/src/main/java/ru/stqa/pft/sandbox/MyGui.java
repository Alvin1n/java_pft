package ru.stqa.pft.sandbox;

//import javax.swing.*;
import java.awt.*;

public class MyGui {
  public static void main(String args[]){
    /* JFrame frame = new JFrame("My first GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    JButton button1 = new JButton("Press1");
    JButton button2 = new JButton("Press2");
    frame.getContentPane().add(button1);
    frame.getContentPane().add(button2);
    frame.setVisible(true); */

    NewWinGUI mainWindow = new NewWinGUI();
    mainWindow.pack();
    mainWindow.setSize(new Dimension(200, 200));
    mainWindow.setVisible(true);
  }
}
