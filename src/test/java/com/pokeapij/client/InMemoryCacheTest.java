/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.client;

import com.pokeapij.cache.InMemoryCache;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class InMemoryCacheTest {
    
    /**
     * Test of add method, of class InMemoryCache.
     */
    @Test
    public void AddObjectToCacheTest() {
        String key = "testKey";
        Object value = new TestObject(1,"David", 24);
        long periodInMillis = 600000L;
        InMemoryCache instance = new InMemoryCache();
        instance.add(key, value, periodInMillis);
        assertEquals(value, instance.get(key));
    }

    /**
     * Test of remove method, of class InMemoryCache.
     */
    @Test
    public void RemoveObjectFromCacheTest() {
        String key = "testKey";
        long periodInMillis = 600000L;
        Object value = new TestObject(1,"David", 24);
        InMemoryCache instance = new InMemoryCache();
        instance.add(key, value, periodInMillis);
        instance.remove(key);
        assertEquals(null, instance.get(key));
    }

    /**
     * Test of get method, of class InMemoryCache.
     */
    @Test
    public void GetObjectFromCacheTest() {
        String key = "testKey";
        Object value = new TestObject(1,"David",24);
        InMemoryCache instance = new InMemoryCache();
        instance.add(key, value, 600000);
        Object expResult = value;
        Object result = instance.get(key);
        assertEquals(expResult, result);
    }

    /**
     * Test of clear method, of class InMemoryCache.
     */
    @Test
    public void ClearCacheTest() {
        String key = "testKey";
        Object value = new TestObject(1,"David",24);
        InMemoryCache instance = new InMemoryCache();
        instance.add(key, value, 600000);
        instance.clear();
        assertEquals(instance.size(), 0);
    }

    /**
     * Test of size method, of class InMemoryCache.
     */
    @Test
    public void GetCacheSizeTestEmpty() {
        InMemoryCache instance = new InMemoryCache();
        long expResult = 0L;
        long result = instance.size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of size method, of class InMemoryCache.
     */
    @Test
    public void GetCacheSizeTestOneEntry() {
        String key = "testKey";
        Object value = new TestObject(1,"David",24);
        InMemoryCache instance = new InMemoryCache();
        instance.add(key, value, 600000);
        long expResult = 1L;
        long result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class InMemoryCache.
     */
    @Test
    public void CacheContainsObjectTestTrue() {
        String key = "testKey";
        Object value = new TestObject(1,"David",24);
        InMemoryCache instance = new InMemoryCache();
        instance.add(key, value, 600000);
        boolean expResult = true;
        boolean result = instance.contains(key);
        assertEquals(expResult, result);
    }
    @Test
    public void CacheContainsObjectTestFalse() {
        String key = "testKey";
        InMemoryCache instance = new InMemoryCache();
        boolean expResult = false;
        boolean result = instance.contains(key);
        assertEquals(expResult, result);
    }
    
}
