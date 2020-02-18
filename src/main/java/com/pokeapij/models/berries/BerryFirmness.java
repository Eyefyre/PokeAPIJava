/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.berries;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class BerryFirmness {

    int id;
    String name;
    ArrayList<NamedAPIResource> berries;
    ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getBerries() {
        return berries;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "BerryFirmness{" + "id=" + id + ", name=" + name + ", berries=" + berries + ", names=" + names + '}';
    }

}
