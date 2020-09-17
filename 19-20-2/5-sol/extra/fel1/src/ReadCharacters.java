import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadCharacters {

    public static void main(String[] args) {
        if(args.length != 1) {
            throw new IllegalArgumentException("Please specify the number of characters to be skipped!");
        }
        int charsRead = 0;
        int charsToSkip = 0;
        try {
            charsToSkip = Integer.parseInt(args[0]);
        } catch(NoSuchElementException nsee) {
            System.out.println("Please specify an integer.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("How many characters to be read from the file?");
        try {

            int charsToRead = sc.nextInt();

            try(BufferedReader br = new BufferedReader(new FileReader("in.txt"))) {
                StringBuilder res = new StringBuilder();
                int asciiVal;
                while ((asciiVal = br.read()) != -1 && charsRead < charsToRead) {
                    charsRead++;
                    res.append((char) asciiVal);
                    br.skip(charsToSkip);
                }
                String resultString = res.toString();
                System.out.println(resultString);
            } catch(IOException ioe) {
                System.out.println("Error in I/O handling");
            }

        } catch(InputMismatchException ime) {
            System.out.println("Please specify an integer.");
        }
    }
}