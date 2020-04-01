package circle;

import circle.utils.PointImmutable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CircleImmutable {
    private final PointImmutable center;
    private final double radius;
    private String label = "defaultLabel";

    public CircleImmutable(double x, double y, double radius) {
        this(new PointImmutable(x, y), radius);
    }

    public CircleImmutable(PointImmutable point, double radius) {
        this.center = point;
        this.radius = radius;
    }

    public CircleImmutable(PointImmutable point, double radius, String label) {
        this(point, radius);
        this.label = label;
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

    public static Circle readFromFile(File file) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(""));
        } catch (IOException e) {
            throw e;
        } finally {
            if (br != null) {
                br.close();
            }
        }

        // ==

        try (BufferedReader br2 = new BufferedReader(new FileReader(""))) {

        } catch (IOException e) {
            throw e;
        }


        return new Circle(0.,0.,0.);
    }
}
