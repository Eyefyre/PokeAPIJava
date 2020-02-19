/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Games;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Generation {

    int id;
    String name;
    ArrayList<NamedAPIResource> abilities;
    ArrayList<Name> names;
    NamedAPIResource main_region;
    ArrayList<NamedAPIResource> moves;
    ArrayList<NamedAPIResource> pokemon_species;
    ArrayList<NamedAPIResource> types;
    ArrayList<NamedAPIResource> version_groups;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getAbilities() {
        return abilities;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public NamedAPIResource getMainRegion() {
        return main_region;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    public ArrayList<NamedAPIResource> getPokemonSpecies() {
        return pokemon_species;
    }

    public ArrayList<NamedAPIResource> getTypes() {
        return types;
    }

    public ArrayList<NamedAPIResource> getVersionGroups() {
        return version_groups;
    }

    @Override
    public String toString() {
        return "Generation{" + "id=" + id + ", name=" + name + ", abilities=" + abilities + ", names=" + names + ", main_region=" + main_region + ", moves=" + moves + ", pokemon_species=" + pokemon_species + ", types=" + types + ", version_groups=" + version_groups + '}';
    }

}
