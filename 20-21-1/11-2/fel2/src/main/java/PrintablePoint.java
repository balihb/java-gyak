public class PrintablePoint extends Point implements Printable {
    public PrintablePoint(double x, double y) {
        super(x, y);
    }

    @Override
    public void print() {
        System.out.println("x: " + getX() + ", y: " + getY());
    }
}
