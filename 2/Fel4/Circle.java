public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public Circle enlarge(double f) {
        return new Circle(x, y, radius + f);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
