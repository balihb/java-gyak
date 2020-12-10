
public class Circle {

    private static final double ERROR_THRESHOLD = 0.000_001;

    private final double x;
    private final double y;
    private final double radius;

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

    @Override
    public int hashCode() {
        return (int) (radius * (1 / ERROR_THRESHOLD));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }

        Circle other = (Circle) obj;

        return Math.abs(radius - other.radius) < ERROR_THRESHOLD;
    }
}
