// TODO: ne ArrayList hanem tömb legyen

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import auto.Auto;
import auto.utils.Color;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        List<Auto> l = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(args[0]))) {
        	while (scanner.hasNext()) {
                String[] ll = scanner.nextLine().split(",");
                l.add(new Auto(ll[0], Color.valueOf(ll[1]), Integer.parseInt(ll[2])));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     }
}
