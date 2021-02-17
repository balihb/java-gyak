public class PointMain {
    public static void main(String[] args) {
        Point myPoint = new Point();
        myPoint.x = 0.2;
        myPoint.y = 0.3;
        myPoint.move(0.1, -0.1);
        System.out.println(myPoint.x);
        System.out.println(myPoint.move(0.1, -0.1).x);
        Point myPoint2 = myPoint;

        PointIm myimp = new PointIm(0.2, 0.5);
        PointIm myMovedImp = myimp.move(1.22, 3);
        System.out.println(myMovedImp.x);
        System.out.println(myMovedImp.y);

        Point myNullPoint = null;

        myimp.move(myMovedImp);

        // myimp.move(myNullPoint);
    }
}
