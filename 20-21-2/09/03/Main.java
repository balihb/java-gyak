import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Integer> minToFront(List<Integer> par) {
        if(par == null || par.isEmpty()) {
            throw new IllegalArgumentException("Nem lehet üres a paraméter");
        }
        Integer min = Collections.min(par);
        par.remove(min);
        par.add(0, min);
        return par;
    }

    public static void main(String[] args) {
        try {
            List<Integer> nums = new ArrayList<Integer>();
            nums.addAll(Arrays.asList(4, 65, 45, 44, 76, 2, 98, 72));
            System.out.println(minToFront(nums));
            System.out.println(minToFront(null));
        } catch (Exception ex) {
            System.out.println("Valami elromlott");
        }
    }
}
