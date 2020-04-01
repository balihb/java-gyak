import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Arrays;

public class SumChecker {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("in.txt"));
                PrintWriter pw = new PrintWriter(new File("out.txt"));) {
            String line;
            boolean found;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                int value = Integer.parseInt(temp[0]);
                String[] sequence = temp[1].split(",");
                int[] numbers = new int[sequence.length];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = Integer.parseInt(sequence[i]);
                }
                pw.write(value + " ");

                Arrays.sort(numbers);
                found = false;
                int k = 0;
                while (k < numbers.length - 1 && !found) {
                    int j = k + 1;
                    while (j < numbers.length && (value - numbers[k] != numbers[j])) {
                        j++;
                    }
                    if (j < numbers.length) {
                        found = true;
                        pw.write(numbers[k] + " " + numbers[j] + "\n");
                    }
                    k++;
                }
                if (!found) {
                    pw.write("none\n");
                }
            }
        } catch (IOException ioe) {
            System.out.println("File not found");
        }
    }
}