/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class PokeathlonStat {

    int id;
    String name;
    ArrayList<Name> names;
    NaturePokeathlonStatAffectSet affecting_natures;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public NaturePokeathlonStatAffectSet getAffecting_natures() {
        return affecting_natures;
    }

    @Override
    public String toString() {
        return "PokeathlonStat{" + "id=" + id + ", name=" + name + ", names=" + names + ", affecting_natures=" + affecting_natures + '}';
    }

}

class NaturePokeathlonStatAffectSet {

    ArrayList<NaturePokeathlonStatAffect> increase;
    ArrayList<NaturePokeathlonStatAffect> decrease;

    public ArrayList<NaturePokeathlonStatAffect> getIncrease() {
        return increase;
    }

    public ArrayList<NaturePokeathlonStatAffect> getDecrease() {
        return decrease;
    }

    @Override
    public String toString() {
        return "NaturePokeathlonStatAffectSet{" + "increase=" + increase + ", decrease=" + decrease + '}';
    }

}

class NaturePokeathlonStatAffect {

    int max_change;
    NamedAPIResource nature;

    public int getMax_change() {
        return max_change;
    }

    public NamedAPIResource getNature() {
        return nature;
    }

    @Override
    public String toString() {
        return "NaturePokeathlonStatAffect{" + "max_change=" + max_change + ", nature=" + nature + '}';
    }

}
