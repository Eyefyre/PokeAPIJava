/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Item;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class ItemCategory {

    int id;
    String name;
    ArrayList<NamedAPIResource> items;
    ArrayList<Name> names;
    NamedAPIResource pocket;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getItems() {
        return items;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public NamedAPIResource getPocket() {
        return pocket;
    }

    @Override
    public String toString() {
        return "ItemCategory{" + "id=" + id + ", name=" + name + ", items=" + items + ", names=" + names + ", pocket=" + pocket + '}';
    }

}
