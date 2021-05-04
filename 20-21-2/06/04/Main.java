import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Circle myc = new Circle(0.2, 0.3, 0.5);
        System.out.println(myc);
        try {
            myc.saveToFile("myc.txt");
            Circle myc2 = Circle.readFromFile("myc.txt");
            System.out.println(myc2);
            Circle myc3 = Circle.readFromFile("myc3.txt");
            System.out.println(myc3);
            Circle myc4 = Circle.readFromFile("myc4.txt");
            System.out.println(myc4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
