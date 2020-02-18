/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Locations;

import com.pokeapij.models.common.GenerationGameIndex;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Location {

    int id;
    String name;
    NamedAPIResource region;
    ArrayList<Name> names;
    ArrayList<GenerationGameIndex> game_indices;
    ArrayList<NamedAPIResource> areas;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public NamedAPIResource getRegion() {
        return region;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public ArrayList<NamedAPIResource> getAreas() {
        return areas;
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", name=" + name + ", region=" + region + ", names=" + names + ", game_indices=" + game_indices + ", areas=" + areas + '}';
    }

}
