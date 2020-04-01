package circle.utils;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double xy) {
        this.x = xy;
        this.y = xy;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point move(double dx, double dy) {
        x += dx;
        // vagy
        // x = x +dx

        y += dy;

        return this;
    }

    public Point move(Point point) {
        return move(point.x, point.y);
    }

    public Point mirror(double dx, double dy) {
        return move(2 * dx - x, 2 * dy - y);
    }

    public Point mirror(Point point) {
        return mirror(point.x, point.y);
    }

    public double distance(Point point) {
        double px = x - point.x;
        double py = y - point.y;
        return Math.sqrt(px * px + py * py);
    }

    @Override
    public String toString() {
        // return "x: " + x + ", y:" + y;
        return String.format("x: %s, y: %s", x, y);
    }
}
