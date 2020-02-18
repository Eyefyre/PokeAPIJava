/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Locations;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Region {

    int id;
    ArrayList<NamedAPIResource> locations;
    String name;
    ArrayList<Name> names;
    NamedAPIResource main_generation;
    ArrayList<NamedAPIResource> pokedexes;
    ArrayList<NamedAPIResource> version_groups;

    public int getId() {
        return id;
    }

    public ArrayList<NamedAPIResource> getLocations() {
        return locations;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public NamedAPIResource getMain_generation() {
        return main_generation;
    }

    public ArrayList<NamedAPIResource> getPokedexes() {
        return pokedexes;
    }

    public ArrayList<NamedAPIResource> getVersion_groups() {
        return version_groups;
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + id + ", locations=" + locations + ", name=" + name + ", names=" + names + ", main_generation=" + main_generation + ", pokedexes=" + pokedexes + ", version_groups=" + version_groups + '}';
    }

}
