/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;

/**
 *
 * @author Adam
 */
public class Name {

    String name;
    NamedAPIResource language;

    public String getName() {
        return name;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Name{" + "name=" + name + ", language=" + language + '}';
    }

}
