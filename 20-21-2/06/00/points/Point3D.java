package points;

public class Point3D extends Point2D {
    protected int z;
    public final static String P3 = "p3";

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int[] getAllPoints() {
        return new int[] {x, y, z};
    }

    public int getZ() {
        return z;
    }
}
