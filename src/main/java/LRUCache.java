import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<T>  {

    private final int SIZE;

    private final LinkedHashMap<T, T> cache;

    public LRUCache(int capacity) {
        if(capacity < 1) {
            throw new IllegalArgumentException();
        }
        SIZE = capacity;
        cache = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<T, T> eldest) {
                return size() > SIZE;
            }
        };
    }

    public T get(T key) {
        if(!cache.containsKey(key))
            return null;
        T value = cache.remove(key);
        cache.put(key, value);
        return value;
    }

    public void put(T key, T value) {
        cache.remove(key);
        cache.put(key, value);
    }

    public int getCapacity() {
        return SIZE;
    }

    public int getSize() {
        return cache.size();
    }
}
