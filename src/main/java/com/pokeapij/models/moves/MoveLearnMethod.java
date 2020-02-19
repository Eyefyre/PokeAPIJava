/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Moves;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class MoveLearnMethod {

    int id;
    String name;
    ArrayList<Description> descriptions;
    ArrayList<Name> names;
    ArrayList<NamedAPIResource> version_groups;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<NamedAPIResource> getVersionGroups() {
        return version_groups;
    }

    @Override
    public String toString() {
        return "MoveLearnMethod{" + "id=" + id + ", name=" + name + ", descriptions=" + descriptions + ", names=" + names + ", version_groups=" + version_groups + '}';
    }

}
