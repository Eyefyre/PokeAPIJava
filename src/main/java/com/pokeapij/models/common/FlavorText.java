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
public class FlavorText {

    String flavor_text;
    NamedAPIResource language;
    NamedAPIResource version;

    public String getFlavor_text() {
        return flavor_text;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "FlavorText{" + "flavor_text=" + flavor_text + ", language=" + language + ", version=" + version + '}';
    }

}
