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
public class Description {

    String description;
    NamedAPIResource language;

    public Description(String description, NamedAPIResource language) {
        this.description = description;
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Description{" + "description=" + description + ", language=" + language + '}';
    }

}
