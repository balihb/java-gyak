package circle;

import circle.utils.Point;
import circle.utils.PointImmutable;
import javafx.geometry.Point2D;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        PointImmutable imuPoint = new PointImmutable();

        Point2D jfxPoint = new Point2D(0, 0);

        System.out.println(jfxPoint);
        System.out.println(point);
        System.out.println(imuPoint);

        jfxPoint = jfxPoint.add(3, -2);
        point = point.move(3, -2);
        imuPoint = imuPoint.move(3, -2);

        System.out.println(jfxPoint);
        System.out.println(point);
        System.out.println(imuPoint);

        Circle circle = new Circle(point, 3);
        CircleImmutable imuCircle = new CircleImmutable(imuPoint, 3);

        System.out.println(circle);
        System.out.println(imuCircle);
    }
}
