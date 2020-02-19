/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.resources.APIResource;
import com.pokeapij.models.common.Description;
import com.pokeapij.models.common.FlavorText;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class PokemonSpecies {

    int id;
    String name;
    int order;
    int gender_rate;
    int capture_rate;
    int base_happiness;
    boolean is_baby;
    int hatch_counter;
    boolean has_gender_differences;
    boolean forms_switchable;
    NamedAPIResource growth_rate;
    ArrayList<PokemonSpeciesDexEntry> pokedex_numbers;
    ArrayList<NamedAPIResource> egg_groups;
    NamedAPIResource color;
    NamedAPIResource shape;
    NamedAPIResource evolves_from_species;
    APIResource evolution_chain;
    NamedAPIResource habitat;
    NamedAPIResource generation;
    ArrayList<Name> names;
    ArrayList<PalParkEncounterArea> pal_park_encounters;
    ArrayList<FlavorText> flavor_text_entries;
    ArrayList<Description> form_descriptions;
    ArrayList<Genus> genera;
    ArrayList<PokemonSpeciesVariety> varieties;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public int getGenderRate() {
        return gender_rate;
    }

    public int getCaptureRate() {
        return capture_rate;
    }

    public int getBaseHappiness() {
        return base_happiness;
    }

    public boolean isBaby() {
        return is_baby;
    }

    public int getHatchCounter() {
        return hatch_counter;
    }

    public boolean hasGenderDifferences() {
        return has_gender_differences;
    }

    public boolean isFormsSwitchable() {
        return forms_switchable;
    }

    public NamedAPIResource getGrowthRate() {
        return growth_rate;
    }

    public ArrayList<PokemonSpeciesDexEntry> getPokedexNumbers() {
        return pokedex_numbers;
    }

    public ArrayList<NamedAPIResource> getEggGroups() {
        return egg_groups;
    }

    public NamedAPIResource getColor() {
        return color;
    }

    public NamedAPIResource getShape() {
        return shape;
    }

    public NamedAPIResource getEvolvesFromSpecies() {
        return evolves_from_species;
    }

    public APIResource getEvolutionChain() {
        return evolution_chain;
    }

    public NamedAPIResource getHabitat() {
        return habitat;
    }

    public NamedAPIResource getGeneration() {
        return generation;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PalParkEncounterArea> getPalParkEncounters() {
        return pal_park_encounters;
    }

    public ArrayList<FlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public ArrayList<Description> getFormDescriptions() {
        return form_descriptions;
    }

    public ArrayList<Genus> getGenera() {
        return genera;
    }

    public ArrayList<PokemonSpeciesVariety> getVarieties() {
        return varieties;
    }

    @Override
    public String toString() {
        return "PokemonSpecies{" + "id=" + id + ", name=" + name + ", order=" + order + ", gender_rate=" + gender_rate + ", capture_rate=" + capture_rate + ", base_happiness=" + base_happiness + ", is_baby=" + is_baby + ", hatch_counter=" + hatch_counter + ", has_gender_differences=" + has_gender_differences + ", forms_switchable=" + forms_switchable + ", growth_rate=" + growth_rate + ", pokedex_numbers=" + pokedex_numbers + ", egg_groups=" + egg_groups + ", color=" + color + ", shape=" + shape + ", evolves_from_species=" + evolves_from_species + ", evolution_chain=" + evolution_chain + ", habitat=" + habitat + ", generation=" + generation + ", names=" + names + ", pal_park_encounters=" + pal_park_encounters + ", flavor_text_entries=" + flavor_text_entries + ", form_descriptions=" + form_descriptions + ", genera=" + genera + ", varieties=" + varieties + '}';
    }

    public class PokemonSpeciesDexEntry {

        int entry_number;
        NamedAPIResource language;

        public int getEntryNumber() {
            return entry_number;
        }

        public NamedAPIResource getLanguage() {
            return language;
        }

        @Override
        public String toString() {
            return "PokemonSpeciesDexEntry{" + "entry_number=" + entry_number + ", language=" + language + '}';
        }

    }

    public class PalParkEncounterArea {

        int base_score;
        int rate;
        NamedAPIResource area;

        public int getBaseScore() {
            return base_score;
        }

        public int getRate() {
            return rate;
        }

        public NamedAPIResource getArea() {
            return area;
        }

        @Override
        public String toString() {
            return "PalParkEncounterArea{" + "base_score=" + base_score + ", rate=" + rate + ", area=" + area + '}';
        }

    }

    public class Genus {

        String genus;
        NamedAPIResource language;

        public String getGenus() {
            return genus;
        }

        public NamedAPIResource getLanguage() {
            return language;
        }

        @Override
        public String toString() {
            return "Genus{" + "genus=" + genus + ", language=" + language + '}';
        }

    }

    public class PokemonSpeciesVariety {

        boolean is_default;
        NamedAPIResource pokemon;

        public boolean isDefault() {
            return is_default;
        }

        public NamedAPIResource getPokemon() {
            return pokemon;
        }

        @Override
        public String toString() {
            return "PokemonSpeciesVariety{" + "is_default=" + is_default + ", pokemon=" + pokemon + '}';
        }

    }

}
