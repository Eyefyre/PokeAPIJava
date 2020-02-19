/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Item;

import com.pokeapij.models.common.Effect;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class ItemFlingEffect {

    int id;
    String name;
    ArrayList<Effect> effect_entries;
    NamedAPIResource items;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Effect> getEffectEntries() {
        return effect_entries;
    }

    public NamedAPIResource getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ItemFlingEffect{" + "id=" + id + ", name=" + name + ", effect_entries=" + effect_entries + ", items=" + items + '}';
    }

}
