public interface CacheInterface<T> {

    /**
     * Get Object by key.
     * @param key - key of item to be returned.
     * @return value associated to key, else null.
     */
    T get(T key);

    /**
     * Put item in map
     * @param key - key of item to be put in cache.
     * @param value - value to be associated to key
     */
    void put(final T key, final T value);

    /**
     * Get capacity of Cache
     * @return - maximum capacity of cache
     */
    int getCapacity();

    /**
     * Get number of items in cache
     * @return - number of items in cache
     */
    int getSize();
}
