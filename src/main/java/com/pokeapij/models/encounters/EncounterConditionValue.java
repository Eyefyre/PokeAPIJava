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
public class EncounterConditionValue {

    int id;
    String name;
    ArrayList<NamedAPIResource> condition;
    ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getCondition() {
        return condition;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "EncounterConditionValue{" + "id=" + id + ", name=" + name + ", condition=" + condition + ", names=" + names + '}';
    }

}
