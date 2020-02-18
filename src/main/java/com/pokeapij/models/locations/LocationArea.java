/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Locations;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.common.VersionEncounterDetail;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class LocationArea {

    int id;
    String name;
    int game_index;
    ArrayList<EncounterMethodRate> encounter_method_rates;
    NamedAPIResource location;
    ArrayList<Name> names;
    ArrayList<PokemonEncounter> pokemon_encounters;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGame_index() {
        return game_index;
    }

    public ArrayList<EncounterMethodRate> getEncounter_method_rates() {
        return encounter_method_rates;
    }

    public NamedAPIResource getLocation() {
        return location;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PokemonEncounter> getPokemon_encounters() {
        return pokemon_encounters;
    }

    @Override
    public String toString() {
        return "LocationArea{" + "id=" + id + ", name=" + name + ", game_index=" + game_index + ", encounter_method_rates=" + encounter_method_rates + ", location=" + location + ", names=" + names + ", pokemon_encounters=" + pokemon_encounters + '}';
    }

    public class EncounterMethodRate {

        NamedAPIResource encounter_method;
        ArrayList<EncounterVersionDetails> version_details;

        public NamedAPIResource getEncounter_method() {
            return encounter_method;
        }

        public ArrayList<EncounterVersionDetails> getVersion_details() {
            return version_details;
        }

        @Override
        public String toString() {
            return "EncounterMethodRate{" + "encounter_method=" + encounter_method + ", version_details=" + version_details + '}';
        }

    }

    public class EncounterVersionDetails {

        int rate;
        NamedAPIResource version;

        public int getRate() {
            return rate;
        }

        public NamedAPIResource getVersion() {
            return version;
        }

        @Override
        public String toString() {
            return "EncounterVersionDetails{" + "rate=" + rate + ", version=" + version + '}';
        }

    }

    public class PokemonEncounter {

        NamedAPIResource pokemon;
        ArrayList<VersionEncounterDetail> version_details;

        public NamedAPIResource getPokemon() {
            return pokemon;
        }

        public ArrayList<VersionEncounterDetail> getVersion_details() {
            return version_details;
        }

        @Override
        public String toString() {
            return "PokemonEncounter{" + "pokemon=" + pokemon + ", version_details=" + version_details + '}';
        }

    }

}
