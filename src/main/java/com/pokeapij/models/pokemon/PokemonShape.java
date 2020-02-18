/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class PokemonShape {

    int id;
    String name;
    ArrayList<AwesomeName> awesome_names;
    ArrayList<Name> names;
    ArrayList<PokemonSpecies> pokemon_species;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<AwesomeName> getAwesome_names() {
        return awesome_names;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PokemonSpecies> getPokemon_species() {
        return pokemon_species;
    }

    @Override
    public String toString() {
        return "PokemonShape{" + "id=" + id + ", name=" + name + ", awesome_names=" + awesome_names + ", names=" + names + ", pokemon_species=" + pokemon_species + '}';
    }

    public class AwesomeName {

        String awesome_name;
        NamedAPIResource language;

        public String getAwesome_name() {
            return awesome_name;
        }

        public NamedAPIResource getLanguage() {
            return language;
        }

        @Override
        public String toString() {
            return "AwesomeName{" + "awesome_name=" + awesome_name + ", language=" + language + '}';
        }

    }

}
