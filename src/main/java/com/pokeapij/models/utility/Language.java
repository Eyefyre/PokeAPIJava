/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Utility;

import com.pokeapij.models.common.Name;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Language {

    int id;
    String name;
    boolean official;
    String iso639;
    String iso3166;
    ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOfficial() {
        return official;
    }

    public String getIso639() {
        return iso639;
    }

    public String getIso3166() {
        return iso3166;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "Language{" + "id=" + id + ", name=" + name + ", official=" + official + ", iso639=" + iso639 + ", iso3166=" + iso3166 + ", names=" + names + '}';
    }

}
