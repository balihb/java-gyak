public class PointIm {
    public final double x;
    public final double y;

    public PointIm(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointIm move(double dx, double dy) {
        System.out.println("double");
        return new PointIm(x + dx, y + dy);
    }

    public PointIm move(PointIm p) {
        System.out.println("pointIm");
        return move(p.x, p.y);
    }

    public PointIm move(Point p) {
        System.out.println("point");
        return move(p.x, p.y);
    }
}
