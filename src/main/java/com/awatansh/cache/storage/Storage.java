package com.awatansh.cache.storage;

import com.awatansh.cache.exceptions.NotFoundException;
import com.awatansh.cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void add(Key key, Value value) throws StorageFullException;

    void remove(Key key) throws NotFoundException;

    Value get(Key key) throws NotFoundException;
}
