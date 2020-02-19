/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Encounters;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class EncounterCondition {

    int id;
    String name;
    ArrayList<Name> names;
    ArrayList<NamedAPIResource> values;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<NamedAPIResource> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "EncounterConditions{" + "id=" + id + ", name=" + name + ", names=" + names + ", values=" + values + '}';
    }

}
