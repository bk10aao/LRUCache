public interface CacheInterface<Integer> {

    /**
     * Get Object by key.
     * @param key - key of item to be returned.
     * @return value associated to key, else -1.
     */
    int get(int key);

    /**
     * Put item in map
     * @param key - key of item to be put in cache.
     * @param value - value to be associated to key
     */
    void put(final int key, final int value);

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
