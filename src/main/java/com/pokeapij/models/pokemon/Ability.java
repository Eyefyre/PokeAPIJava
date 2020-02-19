/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.common.AbilityEffectChange;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import com.pokeapij.models.common.VerboseEffect;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Ability {

    int id;
    String name;
    boolean is_main_series;
    NamedAPIResource generation;
    ArrayList<Name> names;
    ArrayList<VerboseEffect> effect_entries;
    ArrayList<AbilityEffectChange> effect_changes;
    ArrayList<AbilityFlavorText> flavor_text_entries;
    ArrayList<AbilityPokemon> pokemon;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isMainSeries() {
        return is_main_series;
    }

    public NamedAPIResource getGeneration() {
        return generation;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<VerboseEffect> getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<AbilityEffectChange> getEffectChanges() {
        return effect_changes;
    }

    public ArrayList<AbilityFlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public ArrayList<AbilityPokemon> getPokemon() {
        return pokemon;
    }

    @Override
    public String toString() {
        return "Ability{" + "id=" + id + ", name=" + name + ", is_main_series=" + is_main_series + ", generation=" + generation + ", names=" + names + ", effect_entries=" + effect_entries + ", effect_changes=" + effect_changes + ", flavor_text_entries=" + flavor_text_entries + ", pokemon=" + pokemon + '}';
    }

    public class AbilityFlavorText {

        String flavor_text;
        NamedAPIResource language;
        NamedAPIResource version_group;

        public String getFlavorText() {
            return flavor_text;
        }

        public NamedAPIResource getLanguage() {
            return language;
        }

        public NamedAPIResource getVersionGroup() {
            return version_group;
        }

        @Override
        public String toString() {
            return "AbilityFlavorText{" + "flavor_text=" + flavor_text + ", language=" + language + ", version_group=" + version_group + '}';
        }

    }

    public class AbilityPokemon {

        boolean is_hidden;
        int slot;
        NamedAPIResource pokemon;

        public boolean isHidden() {
            return is_hidden;
        }

        public int getSlot() {
            return slot;
        }

        public NamedAPIResource getPokemon() {
            return pokemon;
        }

        @Override
        public String toString() {
            return "AbilityPokemon{" + "is_hidden=" + is_hidden + ", slot=" + slot + ", pokemon=" + pokemon + '}';
        }

    }

}
