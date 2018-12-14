package ru.stqa.pft.sandbox;

public class Rectangle {
  public double a;
  public double b;
  public double c;
  public Rectangle(double a, double b, double c) {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  public double areas(){
    return this.a*this.b*this.c;
  }

}
