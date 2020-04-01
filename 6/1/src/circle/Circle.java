package circle;

import circle.utils.Point;

public class Circle {
    private Point center;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Circle(Point point, double radius) {
        this.center = point;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    @Deprecated
    public double getRadius() {
        return radius;
    }

    public Circle enlarge(double f) {
        radius += f;
        return this;
    }

    public Circle move(Point point) {
        point.move(point);
        return this;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
