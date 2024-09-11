# LRUCache

Implementation of an LRUCache using a LinkedHashMap.

# Methods

1. `LRUCache(int size)` - constructor.
2. `int get(int key)` - return value associated to key in cache, returns -1 if not within cache.
3. `void put(int key, int value)` - adds item to cache, if at capacity removes the least recently used item from cache.
4. `int getCapacity()` - returns the maximum capacity of the cache.
5. `int getSize()` - returns the number of items in the cache.