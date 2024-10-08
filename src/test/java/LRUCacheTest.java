import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    public void onInstantiatingNewCache_withSizeOF_10_returnsSizeOf_10() {
        LRUCache<Integer> lruCache = new LRUCache(10);
        assertEquals(10, lruCache.getCapacity());
    }

    @Test
    public void onInstantiatingNewCache_withSizeOf_negative_1_throws_IllegalArguementException() {
        assertThrows(IllegalArgumentException.class, ()-> new LRUCache<Integer>(-1));
    }

    @Test
    public void onInstantiatingNewCache_withCacheCapacityOf_10_returnsSizeOf_0() {
        LRUCache<Integer> lruCache = new LRUCache<Integer>(10);
        assertEquals(0, lruCache.getSize());
    }

    @Test
    public void givenACache_withValues_1_2_3_onGet_4_returns_null() {
        LRUCache<Integer> lruCache = new LRUCache<Integer>(10);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);

        assertNull(lruCache.get(4));
    }

    @Test
    public void givenACache_withValues_1_2_3_onGet_3_returns_3() {
        LRUCache<Integer> lruCache = new LRUCache<Integer>(10);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);

        assertEquals(3, lruCache.get(3));
    }

    @Test
    public void givenACache_withValues_1_2_3_onPut_4_4_returnsSizeOf_3() {
        LRUCache<Integer> lruCache = new LRUCache(3);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);

        assertEquals(3, lruCache.getSize());
    }

    @Test
    public void givenACacheOfSize_5_on_addingSizeValues_removesLeastUsedCacheValueOf_1_andReturns_on_get_1_returns_null() {
        LRUCache<Integer> lruCache = new LRUCache(5);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        lruCache.put(5, 5);
        lruCache.put(6, 6);

        assertNull(lruCache.get(1));
    }
}