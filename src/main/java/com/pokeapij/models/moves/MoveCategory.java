/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Moves;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class MoveCategory {

    int id;
    String name;
    ArrayList<NamedAPIResource> moves;
    ArrayList<Description> descriptions;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    @Override
    public String toString() {
        return "MoveCategory{" + "id=" + id + ", name=" + name + ", moves=" + moves + ", descriptions=" + descriptions + '}';
    }

}
