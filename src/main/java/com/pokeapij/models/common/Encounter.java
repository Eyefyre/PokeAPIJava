/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Encounter {

    int min_level;
    int max_level;
    ArrayList<NamedAPIResource> condition_values;
    int chance;
    NamedAPIResource method;

    public int getMin_level() {
        return min_level;
    }

    public int getMax_level() {
        return max_level;
    }

    public ArrayList<NamedAPIResource> getCondition_values() {
        return condition_values;
    }

    public int getChance() {
        return chance;
    }

    public NamedAPIResource getMethod() {
        return method;
    }

    @Override
    public String toString() {
        return "Encounter{" + "min_level=" + min_level + ", max_level=" + max_level + ", condition_values=" + condition_values + ", chance=" + chance + ", method=" + method + '}';
    }

}
