/*
https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 */

public class Point {
    private  double x;
    private  double y;

    public Point(double xp, double yp) {
        x = xp;
        y = yp;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point move(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }

    public void move2(double dx, double dy) {
        x = x + dx;
        y = y + dy;
        //return this;
    }

        public Point mirror(double dx, double dy) {
        return new Point(2 * dx - x, 2 * dy - y);
    }

    public String toString() {
        return String.format("x: %s, y: %s", x, y);
    }
}
