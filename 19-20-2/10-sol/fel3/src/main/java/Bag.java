import java.util.HashMap;
import java.util.Map;

public class Bag<T> {

    private final Map<T, Integer> map = new HashMap<>();

    public void add(T element) {
        Integer count = map.getOrDefault(element, 0);
        map.put(element, count + 1);
    }

    public int countOf(T element) {
        return map.getOrDefault(element, 0);
    }

    public void remove(T element) throws NotInBagException {
        Integer currentCount = map.get(element);
        if (currentCount == null) {
            throw new NotInBagException("Element: " + element + " doesn't present in Bag.");
        } else if (currentCount == 1) {
            map.remove(element);
        } else {
            map.put(element, currentCount - 1);
        }
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
