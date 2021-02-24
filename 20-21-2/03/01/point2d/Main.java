package point2d;

import point2d.Point;

public class Main {
  public static void main(String[] args) {
    Point myPoint = new Point();
    System.out.println(myPoint.getX());
    myPoint.setX(1.1);
    double x = myPoint.getX();
    x += 1;
    System.out.println(myPoint.getX());
  }
}
