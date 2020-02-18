/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.cache;

import java.lang.ref.SoftReference;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;

/**
 *
 * @author Adam
 */
public class InMemoryCache implements Cache {

    private final ConcurrentHashMap<String, SoftReference<Object>> cache = new ConcurrentHashMap<>();
    private final DelayQueue<CacheObject> cleaningUpQueue = new DelayQueue<>();

    public InMemoryCache() {
        Thread cleanerThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    CacheObject delayedCacheObject = cleaningUpQueue.take();
                    cache.remove(delayedCacheObject.getKey(), delayedCacheObject.getReference());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        cleanerThread.setDaemon(true);
        cleanerThread.start();
    }

    @Override
    public void add(String key, Object value, long periodInMillis) {
        if (key == null) {
            return;
        }
        if (value == null) {
            cache.remove(key);
        } else {
            long expiryTime = System.currentTimeMillis() + periodInMillis;
            SoftReference<Object> reference = new SoftReference<>(value);
            cache.put(key, reference);
            cleaningUpQueue.put(new CacheObject(key, reference, expiryTime));
        }
    }

    @Override
    public void remove(String key) {
        cache.remove(key);
    }

    @Override
    public Object get(String key) {
        return Optional.ofNullable(cache.get(key)).map(SoftReference::get).orElse(null);
    }

    @Override
    public void clear() {
        cache.clear();
    }

    @Override
    public long size() {
        return cache.size();
    }
    
    @Override
    public boolean contains(String key) {
        return (cache.get(key) != null);
    }

}
