package util;
import java.util.Arrays;

public class IntVector {
    private int[] numbers;

    public IntVector(int[] numbers) {
        // 1.
        this.numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            this.numbers[i] = numbers[i];

        // 2.
        this.numbers = Arrays.copyOf(numbers, numbers.length);
    }

    public void add(int n) {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] += n;
    }

    public String toString() {
        // return Arrays.toString(numbers);

        StringBuilder sb = new StringBuilder();
        String delim = "";
        for(int n : numbers){
            sb.append(delim);
            sb.append(n);
            delim = " ";
        }
        return sb.toString();
    }
}
