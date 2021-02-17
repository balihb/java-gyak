public class Point {
    public double x;
    public double y;

    public Point move(double dx, double dy) {
        // this.x = x + dx;
        // x = x + dx;
        x += dx;
        y += dy;
        return this;
    }
}
