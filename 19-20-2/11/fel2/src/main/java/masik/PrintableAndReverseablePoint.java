package masik;

import pkg.Point;
import pkg.Printable;
import pkg.Reversable;

public class PrintableAndReverseablePoint extends Point implements Printable, Reversable {

    @Override
    public void print() {
        this.print();
    }

    @Override
    public void reverse() {

    }
}
