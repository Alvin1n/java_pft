package ru.stqa.pft.sandbox;

class MyFirstProgram {
  public static void main(String args[]) {
    int l = 11;

    l++;
    System.out.println("Hello, java" + l);
    hello("world");
    hello("no   understand");
    double len=55, q=66, d=44;
    System.out.println("Площадь квадрата = " + areas(len));
    System.out.println("Обьем паралелепипеда = " + areas(len, q, d));
  }
  public static void hello(String some) {
    System.out.println("Hello, "+some);
  }
  public static double areas(double a) {
    return a*a;
  }
  public static double areas(double a, double b, double c){
    return a*b*c;
  }
}