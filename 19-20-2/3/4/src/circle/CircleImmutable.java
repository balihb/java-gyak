package circle;

import circle.utils.PointImmutable;

public class CircleImmutable {
    private final PointImmutable center;
    private final double radius;

    public CircleImmutable(double x, double y, double radius) {
        this.center = new PointImmutable(x, y);
        this.radius = radius;
    }

    public CircleImmutable(PointImmutable point, double radius) {
        this.center = point;
        this.radius = radius;
    }

    public PointImmutable getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public CircleImmutable enlarge(double f) {
        return new CircleImmutable(this.center, radius + f);
    }

    public CircleImmutable move(PointImmutable point) {
        return new CircleImmutable(center.move(point), radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "CircleImmutable{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
