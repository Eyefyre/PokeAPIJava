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
public class PokemonForm {

    int id;
    String name;
    int order;
    int form_order;
    boolean is_default;
    boolean is_battle_only;
    boolean is_mega;
    String form_name;
    NamedAPIResource pokemon;
    PokemonFormSprites sprites;
    NamedAPIResource version_group;
    ArrayList<Name> names;
    ArrayList<Name> form_names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public int getFormOrder() {
        return form_order;
    }

    public boolean isDefault() {
        return is_default;
    }

    public boolean isBattleOnly() {
        return is_battle_only;
    }

    public boolean isMega() {
        return is_mega;
    }

    public String getFormName() {
        return form_name;
    }

    public NamedAPIResource getPokemon() {
        return pokemon;
    }

    public PokemonFormSprites getSprites() {
        return sprites;
    }

    public NamedAPIResource getVersionGroup() {
        return version_group;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<Name> getFormNames() {
        return form_names;
    }

    @Override
    public String toString() {
        return "PokemonForm{" + "id=" + id + ", name=" + name + ", order=" + order + ", form_order=" + form_order + ", is_default=" + is_default + ", is_battle_only=" + is_battle_only + ", is_mega=" + is_mega + ", form_name=" + form_name + ", pokemon=" + pokemon + ", sprites=" + sprites + ", version_group=" + version_group + ", names=" + names + ", form_names=" + form_names + '}';
    }

    public class PokemonFormSprites {

        String front_default;
        String front_shiny;
        String back_default;
        String back_shiny;

        public String getFrontDefault() {
            return front_default;
        }

        public String getFrontShiny() {
            return front_shiny;
        }

        public String getBackDefault() {
            return back_default;
        }

        public String getBackShiny() {
            return back_shiny;
        }

        @Override
        public String toString() {
            return "PokemonFormSprites{" + "front_default=" + front_default + ", front_shiny=" + front_shiny + ", back_default=" + back_default + ", back_shiny=" + back_shiny + '}';
        }

    }

}
