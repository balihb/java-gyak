public class ReversablePoint extends Point implements Reversable {
    double prevX, prevY;

    public ReversablePoint(double x, double y) {
        super(x, y);
    }

    @Override
    void setX(double x) {
        prevX = getX();
        prevY = getY();
        super.setX(x);
    }

    @Override
    void setY(double y) {
        prevX = getX();
        prevY = getY();
        super.setY(y);
    }

    @Override
    public void reverse() {
        super.setX(prevX);
        super.setY(prevY);
    }
}
