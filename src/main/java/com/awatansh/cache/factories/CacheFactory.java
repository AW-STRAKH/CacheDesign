package com.awatansh.cache.factories;

import com.awatansh.cache.Cache;
import com.awatansh.cache.policies.LRUEvictionPolicy;
import com.awatansh.cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}
