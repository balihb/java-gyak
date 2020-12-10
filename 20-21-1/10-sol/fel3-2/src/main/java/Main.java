import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();

        File input = new File("input.txt");

        try(Scanner sc = new Scanner(input)) {
            while (sc.hasNextLine()) {
                bag.add(sc.nextLine());
            }

        } catch (FileNotFoundException e) {

        }

        System.out.println(bag);
    }
}
