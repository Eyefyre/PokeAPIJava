/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Games;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Pokedex {

    int id;
    String name;
    boolean is_main_series;
    ArrayList<Description> descriptions;
    ArrayList<Name> names;
    ArrayList<PokemonEntry> pokemon_entries;
    NamedAPIResource region;
    ArrayList<NamedAPIResource> version_groups;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isIs_main_series() {
        return is_main_series;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PokemonEntry> getPokemon_entries() {
        return pokemon_entries;
    }

    public NamedAPIResource getRegion() {
        return region;
    }

    public ArrayList<NamedAPIResource> getVersion_groups() {
        return version_groups;
    }

    @Override
    public String toString() {
        return "Pokedex{" + "id=" + id + ", name=" + name + ", is_main_series=" + is_main_series + ", descriptions=" + descriptions + ", names=" + names + ", pokemon_entries=" + pokemon_entries + ", region=" + region + ", version_groups=" + version_groups + '}';
    }

}

class PokemonEntry {

    int entry_number;
    NamedAPIResource pokemon_species;

    public int getEntry_number() {
        return entry_number;
    }

    public NamedAPIResource getPokemon_species() {
        return pokemon_species;
    }

    public PokemonEntry(int entry_number, NamedAPIResource pokemon_species) {
        this.entry_number = entry_number;
        this.pokemon_species = pokemon_species;
    }

    @Override
    public String toString() {
        return "PokemonEntry{" + "entry_number=" + entry_number + ", pokemon_species=" + pokemon_species + '}';
    }
    
    

}
