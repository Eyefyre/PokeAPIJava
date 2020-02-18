/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Moves;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class MoveAilment {

    int id;
    String name;
    ArrayList<NamedAPIResource> moves;
    ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "MoveAilment{" + "id=" + id + ", name=" + name + ", moves=" + moves + ", names=" + names + '}';
    }

}
