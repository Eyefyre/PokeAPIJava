/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Moves;

import com.pokeapij.models.common.Name;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class MoveBattleStyle {

    int id;
    String name;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "MoveBattleStyle{" + "id=" + id + ", name=" + name + ", names=" + names + '}';
    }

}
