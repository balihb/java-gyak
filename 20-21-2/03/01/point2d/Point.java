package point2d;

import point2d.alma.Korte;

public class Point {
  private Double x, y;
  private Double sum;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
    
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y*2;
  }

  public void setX(double x) {
    this.x = x;
    sum();
  }

  public void setY(double y) {
    this.y = y;
    sum();
  }

  private void sum() {
    sum = x + y;
  }

  public double getSum() {
    return sum;
  }
}
