/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Evolution;

import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class EvolutionChain {

    int id;
    NamedAPIResource baby_trigger_item;
    ChainLink chain;

    public int getId() {
        return id;
    }

    public NamedAPIResource getBabyTriggerItem() {
        return baby_trigger_item;
    }

    public ChainLink getChain() {
        return chain;
    }

    @Override
    public String toString() {
        return "EvolutionChain{" + "id=" + id + ", baby_trigger_item=" + baby_trigger_item + ", chain=" + chain + '}';
    }

    public class ChainLink {

        boolean is_baby;
        NamedAPIResource species;
        ArrayList<EvolutionDetail> evolution_details;
        ArrayList<ChainLink> evolves_to;

        public boolean isBaby() {
            return is_baby;
        }

        public NamedAPIResource getSpecies() {
            return species;
        }

        public ArrayList<EvolutionDetail> getEvolutionDetails() {
            return evolution_details;
        }

        public ArrayList<ChainLink> getEvolvesTo() {
            return evolves_to;
        }

        @Override
        public String toString() {
            return "ChainLink{" + "is_baby=" + is_baby + ", species=" + species + ", evolution_details=" + evolution_details + ", evolves_to=" + evolves_to + '}';
        }

    }

    public class EvolutionDetail {

        NamedAPIResource item;
        NamedAPIResource trigger;
        int gender;
        NamedAPIResource held_item;
        NamedAPIResource known_move;
        NamedAPIResource known_move_type;
        NamedAPIResource location;
        int min_level;
        int min_happiness;
        int min_beauty;
        int min_affection;
        boolean needs_overworld_rain;
        NamedAPIResource party_species;
        NamedAPIResource party_type;
        int relative_physical_stats;
        String time_of_day;
        NamedAPIResource trade_species;
        boolean turn_upside_down;

        public NamedAPIResource getItem() {
            return item;
        }

        public NamedAPIResource getTrigger() {
            return trigger;
        }

        public int getGender() {
            return gender;
        }

        public NamedAPIResource getHeldItem() {
            return held_item;
        }

        public NamedAPIResource getKnownMove() {
            return known_move;
        }

        public NamedAPIResource getKnownMoveType() {
            return known_move_type;
        }

        public NamedAPIResource getLocation() {
            return location;
        }

        public int getMinLevel() {
            return min_level;
        }

        public int getMinHappiness() {
            return min_happiness;
        }

        public int getMinBeauty() {
            return min_beauty;
        }

        public int getMinAffection() {
            return min_affection;
        }

        public boolean needsOverworldRain() {
            return needs_overworld_rain;
        }

        public NamedAPIResource getPartySpecies() {
            return party_species;
        }

        public NamedAPIResource getPartyType() {
            return party_type;
        }

        public int getRelativePhysicalStats() {
            return relative_physical_stats;
        }

        public String getTimeOfDay() {
            return time_of_day;
        }

        public NamedAPIResource getTradeSpecies() {
            return trade_species;
        }

        public boolean isTurnUpsideDown() {
            return turn_upside_down;
        }

        @Override
        public String toString() {
            return "EvolutionDetail{" + "item=" + item + ", trigger=" + trigger + ", gender=" + gender + ", held_item=" + held_item + ", known_move=" + known_move + ", known_move_type=" + known_move_type + ", location=" + location + ", min_level=" + min_level + ", min_happiness=" + min_happiness + ", min_beauty=" + min_beauty + ", min_affection=" + min_affection + ", needs_overworld_rain=" + needs_overworld_rain + ", party_species=" + party_species + ", party_type=" + party_type + ", relative_physical_stats=" + relative_physical_stats + ", time_of_day=" + time_of_day + ", trade_species=" + trade_species + ", turn_upside_down=" + turn_upside_down + '}';
        }

    }

}
