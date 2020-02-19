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
public class PalParkArea {

    int id;
    String name;
    ArrayList<Name> names;
    ArrayList<PalParkEncounterSpecies> pokemon_encounters;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PalParkEncounterSpecies> getPokemonEncounters() {
        return pokemon_encounters;
    }

    @Override
    public String toString() {
        return "PalParkArea{" + "id=" + id + ", name=" + name + ", names=" + names + ", pokemon_encounters=" + pokemon_encounters + '}';
    }

    public class PalParkEncounterSpecies {

        int base_score;
        int rate;
        NamedAPIResource pokemon_species;

        public int getBaseScore() {
            return base_score;
        }

        public int getRate() {
            return rate;
        }

        public NamedAPIResource getPokemonSpecies() {
            return pokemon_species;
        }

        @Override
        public String toString() {
            return "PalParkEncounterSpecies{" + "base_score=" + base_score + ", rate=" + rate + ", pokemon_species=" + pokemon_species + '}';
        }

    }

}
