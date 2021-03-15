import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {

    public static final Path THE_PATH = Paths.get("nums.txt");
    public static final Path THE_PATH2 = Paths.get("out.txt");

    public static void main(String[] args) {

        try (BufferedWriter bw = Files.newBufferedWriter(THE_PATH2);
                BufferedReader br = Files.newBufferedReader(THE_PATH)) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                bw.write(num % 2 == 0 ? num + " is an even number" : num + " is an odd number");
                bw.newLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}