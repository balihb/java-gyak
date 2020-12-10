public class PrintableAndReverseablePoint extends ReversablePoint implements Reversable, Printable{
    public PrintableAndReverseablePoint(double x, double y) {
        super(x, y);
    }

    @Override
    public void print() {
        System.out.println("x: " + getX() + ", y: " + getY());
    }
}
