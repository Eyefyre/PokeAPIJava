/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Evolution;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class EvolutionTrigger {

    int id;
    String name;
    ArrayList<Name> names;
    ArrayList<NamedAPIResource> pokemon_species;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<NamedAPIResource> getPokemon_species() {
        return pokemon_species;
    }

    @Override
    public String toString() {
        return "EvolutionTrigger{" + "id=" + id + ", name=" + name + ", names=" + names + ", pokemon_species=" + pokemon_species + '}';
    }

}
