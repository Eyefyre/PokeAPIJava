/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class GrowthRate {

    int id;
    String name;
    String formula;
    ArrayList<Description> descriptions;
    ArrayList<GrowthRateExperienceLevel> levels;
    ArrayList<NamedAPIResource> pokemon_species;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<GrowthRateExperienceLevel> getLevels() {
        return levels;
    }

    public ArrayList<NamedAPIResource> getPokemon_species() {
        return pokemon_species;
    }

    @Override
    public String toString() {
        return "GrowthRate{" + "id=" + id + ", name=" + name + ", formula=" + formula + ", descriptions=" + descriptions + ", levels=" + levels + ", pokemon_species=" + pokemon_species + '}';
    }

}

class GrowthRateExperienceLevel {

    int level;
    int experience;

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "GrowthRateExperienceLevel{" + "level=" + level + ", experience=" + experience + '}';
    }

}
