public class Line {
    private double a;
    private double b;
    private double c;

    public Line(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Boolean contains(Point point) {
        //return c == a * point.getX() + b * point.getY(); // ??
        return point.getY() == -(a / b) * point.getX() + c;
    }
}
