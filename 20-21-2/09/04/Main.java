import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> initiData = new HashMap<>();

        initiData.put("gsdf", 3);

        MultiSet ms = new MultiSet(initiData);
        Map<String, Integer> data = ms.getData();

        ms.put("asdf");
        ms.put("asdf");
        data.put("asdf", -3);
        initiData.put("asdf", -9);
        System.out.println(ms.getData());
        System.out.println(data);
        System.out.println(initiData);
    }
}
