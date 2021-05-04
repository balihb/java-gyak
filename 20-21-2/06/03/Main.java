import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File(args[0]);
        System.out.println("pattern: ");
        String pattern = "hello"; //System.console().readLine();

        try(Scanner sc = new Scanner(inputFile)) {
            int counter = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //System.out.println(line);
                if(line.contains(pattern)) {
                    ++counter;
                }
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
