public class Point {
    private final double x;
    private final double y;

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

    public Point move(double dx, double dy) {
        return new Point(x + dx, y + dy);
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

    public String toString() {
        return String.format("x: %s, y: %s", x, y);
    }
}
