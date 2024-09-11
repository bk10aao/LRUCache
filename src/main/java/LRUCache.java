import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache implements CacheInterface<Integer> {

    private final int SIZE;

    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int size) {
        if(size < 1) {
            throw new IllegalArgumentException();
        }
        this.SIZE = size;
        cache = new LinkedHashMap<>(SIZE, 0.75f, true) {
            protected boolean removeEldestEntry (Map.Entry eldest) {
                return size() > SIZE;
            }
        };
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            int value = cache.remove(key);
            cache.put(key, value);
            return value;
        }

        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            cache.remove(key);
        } else if(cache.size() == SIZE) {
            cache.remove(cache.keySet().iterator().next());
        }
        cache.put(key, value);
    }

    public int getCapacity() {
        return SIZE;
    }

    public int getSize() {
        return cache.size();
    }
}
