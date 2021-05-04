import java.io.*;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("bemenet.txt");
        File outputFile = new File("kimenet.txt");

        try (
                BufferedReader br = Files.newBufferedReader(inputFile.toPath());
                PrintWriter pw = new PrintWriter(outputFile);
        ) {
            readLines(br, pw);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readLines(BufferedReader br, PrintWriter pw) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");

            int sum = 0;
            for (String num : parts) {
                sum += Integer.parseInt(num);
            }
            pw.println(sum);
        }
    }
}
