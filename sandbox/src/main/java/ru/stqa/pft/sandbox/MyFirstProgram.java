package ru.stqa.pft.sandbox;

class MyFirstProgram {
  public static void main(String args[]) {
    int l = 11;

    l++;
    System.out.println("Hello, java" + l);
    hello("world");
    hello("no   understand");

    Rectangle r = new Rectangle(4, 5, 6);

    Square s = new Square(5);
    System.out.println("Площадь квадрата " + s.i + " * " + s.i + " = " + s.areas());
    System.out.println("Обьем паралелепипеда = " + r.a + " * " + r.b + " * " + r.c + " = " + r.areas());
  }
  public static void hello(String some) {
    System.out.println("Hello, "+some);
  }
}