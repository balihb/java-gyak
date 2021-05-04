import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MultiSet {
    private final Map<String, Integer> data;

    public MultiSet(Map<String, Integer> data) {
        this.data = new HashMap<>(data);
    }

    public MultiSet() {
        this.data = new HashMap<>();
    }

    public Map<String, Integer> getData() {
        return new HashMap<>(data);
    }

    public void put(String item) {
        Integer num = data.getOrDefault(item, 0);
        data.put(item, num + 1);
    }

    public MultiSet intersect(MultiSet other) {
        MultiSet ms = new MultiSet();
        for (String el : data.keySet()) {
            if (other.data.containsKey(el)) {
                ms.data.put(
                        el,
                        Math.min(
                                data.get(el),
                                other.data.get(el)
                        )
                );
            }
        }
        return ms;
    }
}
