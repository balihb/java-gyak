package circle.utils;

public class PointImmutable {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public PointImmutable(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointImmutable(double xy) {
        this.x = xy;
        this.y = xy;
    }

    public PointImmutable() {
        this.x = 0;
        this.y = 0;
    }

    public PointImmutable move(double dx, double dy) {
        return new PointImmutable(x + dx, y + dy);
    }

    public PointImmutable move(PointImmutable point) {
        return move(point.getX(), point.getY());
    }

    public PointImmutable mirror(double dx, double dy) {
        return move(2 * dx - x, 2 * dy - y);
    }

    public PointImmutable mirror(PointImmutable point) {
        return mirror(point.x, point.y);
    }

    public double distance(PointImmutable point) {
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
