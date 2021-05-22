package polyhedra;

public abstract class Prism {
    double height;

    public Prism(double height) {
        this.height = height;
    }

    public abstract double baseArea();

    public double volume() {
        return height * baseArea();
    }
}
