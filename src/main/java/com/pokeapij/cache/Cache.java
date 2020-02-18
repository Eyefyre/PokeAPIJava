/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.cache;

/**
 *
 * @author Adam
 */
public interface Cache {

    void add(String key, Object value, long periodInMillis);

    void remove(String key);

    Object get(String key);

    void clear();

    long size();
    
    boolean contains(String key);
}
