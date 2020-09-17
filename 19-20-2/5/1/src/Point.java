public class Point {
    Double x;
    Double y;
    final static NullPointerException np = new NullPointerException();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(Double x, Double y) {
        if(x == null) throw np;
        this.x = x;
        this.y = y;
    }

    public Point(Double xy) {
        if(xy == null) throw new NullPointerException("xy null volt");
        this.x = xy;
        this.y = xy;
    }

    public Point() {
        this.x = 0.;
        this.y = 0.;
    }

    public Point move(double dx, double dy) {
        x += dx;
        // vagy
        // x = x +dx

        y += dy;

        return this;
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
