package points;

public class Point2D extends Point1D {
    protected int y;
    public final static String P2 = "p2";

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
