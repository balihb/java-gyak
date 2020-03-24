import java.io.*;
import java.util.StringTokenizer;

class Het {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(""))) {
            String line = null;
            while ((line = br.readLine()) != null) {

                String[] elements = line.split(",");
                StringTokenizer
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Exception ex = new Exception("ezt nem dobjuk");
        System.out.println(ex.getMessage());
        //ex.printStackTrace();


        Point myPoint;
        try {
            myPoint = new Point(null);
        } catch (NullPointerException ex2) {
            //throw new RuntimeException("nem tudtuk inicializalni a Point-ot, mert null-t kapott", ex);
            myPoint = new Point(0.);
        }
        //try {
        System.out.println(args[10]);
        //} catch (ArrayIndexOutOfBoundsException e) {
        //e.printStackTrace();
        //}
        if (args.length != 2) {
            // IllegalArgumentException iae = new IllegalArgumentException("nem elég paraméter");
            // throw iae;
            throw new IllegalArgumentException();
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html

            System.out.println("a + b = " + a + b);
            System.out.println("a + b = " + (a + b));


            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            if (b != 0) {
                System.out.println("a / b = " + ((double) a / b));
                System.out.println("a % b = " + (a % b));
            }
        }
    }

    public static void egyeb() throws IOException {
        throw new IOException();
    }
}
