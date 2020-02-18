/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Encounters;

import com.pokeapij.models.common.Name;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class EncounterMethod {

    int id;
    String name;
    int order;
    ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "EncounterMethod{" + "id=" + id + ", name=" + name + ", order=" + order + ", names=" + names + '}';
    }

}
