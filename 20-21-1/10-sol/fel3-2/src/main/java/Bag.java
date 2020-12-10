import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    private final Map<T, Integer> map;

    Bag() {
        map = new HashMap<>();
    }

    public void add(T elem) {
        Integer count = map.getOrDefault(elem, 0);
        map.put(elem, count + 1);
    }

    public Integer countOf(T elem) {
        return map.getOrDefault(elem, 0);
    }

    public void remove(T elem) throws NotInBagException {
        Integer currentCount = map.get(elem);
        if(currentCount == null) {
            throw new NotInBagException(elem + " not found");
        } else if(currentCount.equals(1)) {
            map.remove(elem);
        } else {
            map.put(elem, currentCount - 1);
        }
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
