import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<T> implements CacheInterface<T> {

    private final int SIZE;

    private final LinkedHashMap<T, T> cache;

    public LRUCache(final int size) {
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

    public T get(final T key) {
        if (cache.containsKey(key)) {
            T value = cache.remove(key);
            cache.put(key, value);
            return value;
        }

        return null;
    }

    public void put(final T key, final T value) {
        if(cache.containsKey(key)) {
            cache.remove(key);
        } else if(cache.size() == SIZE) {
            cache.remove(cache.keySet().iterator().next());
        }
        cache.put(key, value);
    }

    public final int getCapacity() {
        return SIZE;
    }

    public final int getSize() {
        return cache.size();
    }
}
