package polyhedra;

public class Cylinder extends Prism {
    double radius;

    public Cylinder(double radius, double height) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double baseArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Cylinder { h = %f, r = %f }", height, radius);
    }
}
