import points.*;

public class Main {
    public static void main(String[] args) {
        Point3D p3d = new Point3D(1,4,5);

        for(int i : p3d.getAllPoints()) {
            System.out.println(i);
        }

        Point3D p1 = new Point3D(1, 2,3);
        Point3D p2 = new Point3D(0, 3, 5);
        Point3D p3 = null;

        try {
            System.out.println(xAdder(p1, p2));
        } catch (NumberWasZeroException e) {
            System.out.println("nem sikerult osszeadni, mert legalabb az egyik szam 0 volt");
            e.printStackTrace();
        } catch (NumberWasNegativeException e) {
            System.out.println("nem sikerult osszeadni, mert legalabb az egyik szam negativ volt");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("valami egyeb exception volt");
            e.printStackTrace();
        }
    }

    public static int positiveAdder(Integer a, Integer b) throws NumberWasNegativeException, NumberWasZeroException {
        if(a.equals(0) || b.equals(0)) throw new NumberWasZeroException("egyik parameter sem lehet 0");
        if(a < 0 || b < 0) throw new NumberWasNegativeException("egyik parameter sem lehet negativ");
        return a + b;
    }

    public static int xAdder(Point3D p1, Point3D p2) throws NumberWasNegativeException, NumberWasZeroException {
        try {
            return positiveAdder(p1.getX(), p2.getX());
        } catch (NumberWasZeroException e) {
            System.out.println("az xAdderben csinaltunk valamit");
            throw e;
        }
    }
}
