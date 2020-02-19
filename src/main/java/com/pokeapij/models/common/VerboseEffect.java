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
public class VerboseEffect {

    String effect;
    String short_effect;
    NamedAPIResource language;

    public String getEffect() {
        return effect;
    }

    public String getShortEffect() {
        return short_effect;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "VerboseEffect{" + "effect=" + effect + ", short_effect=" + short_effect + ", language=" + language + '}';
    }

}
