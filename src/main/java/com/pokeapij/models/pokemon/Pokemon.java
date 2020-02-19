/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.resources.NamedAPIResource;
import com.pokeapij.models.common.VersionGameIndex;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Pokemon {

    int id;
    String name;
    int base_experience;
    int height;
    boolean is_default;
    int order;
    int weight;
    ArrayList<PokemonAbility> abilities;
    ArrayList<NamedAPIResource> forms;
    ArrayList<VersionGameIndex> game_indices;
    ArrayList<PokemonHeldItem> held_items;
    String location_area_encounters;
    ArrayList<PokemonMove> moves;
    PokemonSprites sprites;
    NamedAPIResource species;
    ArrayList<PokemonStat> stats;
    ArrayList<PokemonType> types;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaseExperience() {
        return base_experience;
    }

    public int getHeight() {
        return height;
    }

    public boolean isDefault() {
        return is_default;
    }

    public int getOrder() {
        return order;
    }

    public int getWeight() {
        return weight;
    }

    public ArrayList<PokemonAbility> getAbilities() {
        return abilities;
    }

    public ArrayList<NamedAPIResource> getForms() {
        return forms;
    }

    public ArrayList<VersionGameIndex> getGameIndices() {
        return game_indices;
    }

    public ArrayList<PokemonHeldItem> getHeldItems() {
        return held_items;
    }

    public String getLocationAreaEncounters() {
        return location_area_encounters;
    }

    public ArrayList<PokemonMove> getMoves() {
        return moves;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public NamedAPIResource getSpecies() {
        return species;
    }

    public ArrayList<PokemonStat> getStats() {
        return stats;
    }

    public ArrayList<PokemonType> getTypes() {
        return types;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", base_experience=" + base_experience + ", height=" + height + ", is_default=" + is_default + ", order=" + order + ", weight=" + weight + ", abilities=" + abilities + ", forms=" + forms + ", game_indices=" + game_indices + ", held_items=" + held_items + ", location_area_encounters=" + location_area_encounters + ", moves=" + moves + ", sprites=" + sprites + ", species=" + species + ", stats=" + stats + ", types=" + types + '}';
    }

    public class PokemonAbility {

        boolean is_hidden;
        int slot;
        NamedAPIResource ability;

        public boolean isHidden() {
            return is_hidden;
        }

        public int getSlot() {
            return slot;
        }

        public NamedAPIResource getAbility() {
            return ability;
        }

        @Override
        public String toString() {
            return "PokemonAbility{" + "is_hidden=" + is_hidden + ", slot=" + slot + ", ability=" + ability + '}';
        }

    }

    public class PokemonHeldItem {

        NamedAPIResource item;
        ArrayList<PokemonHeldItemVersion> version_details;

        public NamedAPIResource getItem() {
            return item;
        }

        public ArrayList<PokemonHeldItemVersion> getVersionDetails() {
            return version_details;
        }

        @Override
        public String toString() {
            return "PokemonHeldItem{" + "item=" + item + ", version_details=" + version_details + '}';
        }

    }

    public class PokemonHeldItemVersion {

        NamedAPIResource version;
        int rarity;

        public NamedAPIResource getVersion() {
            return version;
        }

        public int getRarity() {
            return rarity;
        }

        @Override
        public String toString() {
            return "PokemonHeldItemVersion{" + "version=" + version + ", rarity=" + rarity + '}';
        }

    }

    public class PokemonMove {

        NamedAPIResource move;
        ArrayList<PokemonMoveVersion> version_group_details;

        public NamedAPIResource getMove() {
            return move;
        }

        public ArrayList<PokemonMoveVersion> getVersionGroupDetails() {
            return version_group_details;
        }

        @Override
        public String toString() {
            return "PokemonMove{" + "move=" + move + ", version_group_details=" + version_group_details + '}';
        }

    }

    public class PokemonMoveVersion {

        NamedAPIResource move_learn_method;
        NamedAPIResource version_group;
        int level_learned_at;

        public NamedAPIResource getMoveLearnMethod() {
            return move_learn_method;
        }

        public NamedAPIResource getVersionGroup() {
            return version_group;
        }

        public int getLevelLearnedAt() {
            return level_learned_at;
        }

        @Override
        public String toString() {
            return "PokemonMoveVersion{" + "move_learn_method=" + move_learn_method + ", version_group=" + version_group + ", level_learned_at=" + level_learned_at + '}';
        }

    }

    public class PokemonSprites {

        String front_default;
        String front_shiny;
        String front_female;
        String front_shiny_female;
        String back_default;
        String back_shiny;
        String back_female;
        String back_shiny_female;

        public String getFrontDefault() {
            return front_default;
        }

        public String getFrontShiny() {
            return front_shiny;
        }

        public String getFrontFemale() {
            return front_female;
        }

        public String getFrontShinyFemale() {
            return front_shiny_female;
        }

        public String getBackDefault() {
            return back_default;
        }

        public String getBackShiny() {
            return back_shiny;
        }

        public String getBackFemale() {
            return back_female;
        }

        public String getBackShinyFemale() {
            return back_shiny_female;
        }

        @Override
        public String toString() {
            return "PokemonSprites{" + "front_default=" + front_default + ", front_shiny=" + front_shiny + ", front_female=" + front_female + ", front_shiny_female=" + front_shiny_female + ", back_default=" + back_default + ", back_shiny=" + back_shiny + ", back_female=" + back_female + ", back_shiny_female=" + back_shiny_female + '}';
        }

    }

    public class PokemonStat {

        NamedAPIResource stat;
        int effort;
        int base_stat;

        public NamedAPIResource getStat() {
            return stat;
        }

        public int getEffort() {
            return effort;
        }

        public int getBaseStat() {
            return base_stat;
        }

        @Override
        public String toString() {
            return "PokemonStat{" + "stat=" + stat + ", effort=" + effort + ", base_stat=" + base_stat + '}';
        }

    }

    public class PokemonType {

        int slot;
        NamedAPIResource type;

        public int getSlot() {
            return slot;
        }

        public NamedAPIResource getType() {
            return type;
        }

        @Override
        public String toString() {
            return "PokemonType{" + "slot=" + slot + ", type=" + type + '}';
        }

    }

}
