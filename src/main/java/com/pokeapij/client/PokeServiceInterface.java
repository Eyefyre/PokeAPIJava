/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.client;

import com.pokeapij.cache.InMemoryCache;

/**
 *
 * @author Adam
 */
public interface PokeServiceInterface {

    Object getResource(String cacheID, String path, String objectName);

    Object queryAPI(String path, String ObjectName);

    Object parseJSONtoObject(String jsonString, String Objectname);

    InMemoryCache getCache();

    void changeCacheTime(long seconds);

    long getCacheTime();
}
