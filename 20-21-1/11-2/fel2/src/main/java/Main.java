public class Main {
    public static void main(String[] args) {
        PrintableAndReverseablePoint p1 = new PrintableAndReverseablePoint(2, 3);

        foo(p1);

        p1.setY(10);

        foo(p1);

        p1.reverse();

        foo(p1);
    }

    public static void foo(Printable printable) {
        printable.print();
    }
}
