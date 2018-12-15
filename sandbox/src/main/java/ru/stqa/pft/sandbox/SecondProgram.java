package ru.stqa.pft.sandbox;

public class SecondProgram {
  public static void main(String[] args){
    Point a = new Point(2,2);
    Point b = new Point(12,12);
    double len = a.distance(a, b);
    System.out.println("Растояние между точками ("+a.x+";"+a.y+") и "+"("+b.x+";"+b.y+") = "+len);

  }
}
