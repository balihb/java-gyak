import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
        center = new Point();
        radius = 0;
    }

    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public Circle enlarge(double f) {
        return new Circle(center, radius * f);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return String.format("(%f,%f), %f", center.getX(), center.getY(), radius);
    }

    public static Circle readFromFile(String inFileName) throws FileNotFoundException {
        return readFromFile(new File(inFileName));
    }

    public static Circle readFromFile(File in) {
        try(Scanner sc = new Scanner(in)) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double radius = sc.nextDouble();
            return new Circle(x, y, radius);
        } catch (FileNotFoundException | InputMismatchException e) {
            return new Circle();
        }
    }

    public void saveToFile(String outFileName) throws FileNotFoundException {
        saveToFile(new File(outFileName));
    }

    public void saveToFile(File outFile) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(outFile)) {
            pw.println(center.getX());
            pw.println(center.getY());
            pw.println(radius);
        }
    }
}
