# LRUCache

Implementation of an LRUCache using a LinkedHashMap.

# Methods

1. `LRUCache(int size)` - constructor.
2. `T get(T key)` - return value associated to key in cache, returns null if not within cache.
3. `void put(T key, T value)` - adds item to cache, if at capacity removes the least recently used item from cache.
4. `int getCapacity()` - returns the maximum capacity of the cache.
5. `int getSize()` - returns the number of items in the cache.