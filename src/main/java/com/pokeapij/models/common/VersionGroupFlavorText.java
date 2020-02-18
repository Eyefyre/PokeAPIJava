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
public class VersionGroupFlavorText {

    String text;
    NamedAPIResource language;
    NamedAPIResource version_group;

    public String getText() {
        return text;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    @Override
    public String toString() {
        return "VersionGroupFlavorText{" + "text=" + text + ", language=" + language + ", version_group=" + version_group + '}';
    }

}
