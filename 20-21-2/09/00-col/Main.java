import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> divs = divisors(34);

        for(Integer div : divs) {
            System.out.println(div);
        }
     }

    public static List<Integer> divisors(int num) {
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= Math.sqrt(num); ++i)
        {
            if (num % i == 0)
            {
                result.add(i);
                if (num / i != i)
                {
                    result.add(num/i);
                }
            }
        }
        return result;
    }
}
