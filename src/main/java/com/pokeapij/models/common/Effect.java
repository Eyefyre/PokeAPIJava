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
public class Effect {

    String effect;
    NamedAPIResource language;

    public String getEffect() {
        return effect;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Effect{" + "effect=" + effect + ", language=" + language + '}';
    }

}
