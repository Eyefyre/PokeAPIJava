/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.client;

import com.pokeapij.cache.InMemoryCache;
import com.pokeapij.models.berries.Berry;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class PokeServiceTest {
        PokeService instance = new PokeService();
    /**
     * Test of getResource method, of class PokeService.
     */
    @Test
    public void GetResourceTest() {
        String path = "berry/1";
        String objectName = "Berry";
        String expResult = "cheri";
        Berry object = (Berry) instance.getResource(path, objectName);
        String result = object.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of queryAPI method, of class PokeService.
     */
    @Test
    public void QueryAPITest() {
        String path = "berry/2";
        String ObjectName = "Berry";
        Object expResult = "chesto";
        Berry object = (Berry) instance.queryAPI(path, ObjectName);
        String result = object.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of parseJSONtoObject method, of class PokeService.
     */
    @Test
    public void ParseJSONtoObjectTest() {
        String jsonString = "{\"firmness\":{\"name\":\"super-hard\",\"url\":\"https://pokeapi.co/api/v2/berry-firmness/5/\"},\"flavors\":[{\"flavor\":{\"name\":\"spicy\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/1/\"},\"potency\":0},{\"flavor\":{\"name\":\"dry\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/2/\"},\"potency\":10},{\"flavor\":{\"name\":\"sweet\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/3/\"},\"potency\":0},{\"flavor\":{\"name\":\"bitter\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/4/\"},\"potency\":0},{\"flavor\":{\"name\":\"sour\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/5/\"},\"potency\":0}],\"growth_time\":3,\"id\":2,\"item\":{\"name\":\"chesto-berry\",\"url\":\"https://pokeapi.co/api/v2/item/127/\"},\"max_harvest\":5,\"name\":\"chesto\",\"natural_gift_power\":60,\"natural_gift_type\":{\"name\":\"water\",\"url\":\"https://pokeapi.co/api/v2/type/11/\"},\"size\":80,\"smoothness\":25,\"soil_dryness\":15}";
        String Objectname = "Berry";
        Object expResult = "water";
        Berry object = (Berry) instance.parseJSONtoObject(jsonString, Objectname);
        String result = object.getNaturalGiftType().getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCache method, of class PokeService.
     */
    @Test
    public void GetCacheTest() {
        InMemoryCache expResult = instance.getCache();
        InMemoryCache result = instance.getCache();
        assertEquals(expResult, result);
    }

    /**
     * Test of changeCacheTime method, of class PokeService.
     */
    @Test
    public void ChangeCacheTimeTest() {
        long seconds = 600L;
        instance.changeCacheTime(seconds);
        assertEquals(instance.getCacheTime(), seconds);
    }
    
}
