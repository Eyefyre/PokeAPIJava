/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.resources.APIResource;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Stat {

    int id;
    String name;
    int game_index;
    boolean is_battle_only;
    MoveStatAffectSet affecting_moves;
    NatureStatAffectSet affecting_natures;
    APIResource characteristics;
    NamedAPIResource move_damage_class;
    ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGame_index() {
        return game_index;
    }

    public boolean isIs_battle_only() {
        return is_battle_only;
    }

    public MoveStatAffectSet getAffecting_moves() {
        return affecting_moves;
    }

    public NatureStatAffectSet getAffecting_natures() {
        return affecting_natures;
    }

    public APIResource getCharacteristics() {
        return characteristics;
    }

    public NamedAPIResource getMove_damage_class() {
        return move_damage_class;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "Stat{" + "id=" + id + ", name=" + name + ", game_index=" + game_index + ", is_battle_only=" + is_battle_only + ", affecting_moves=" + affecting_moves + ", affecting_natures=" + affecting_natures + ", characteristics=" + characteristics + ", move_damage_class=" + move_damage_class + ", names=" + names + '}';
    }

}

class MoveStatAffectSet {

    ArrayList<MoveStatAffect> increase;
    ArrayList<MoveStatAffect> decrease;

    public ArrayList<MoveStatAffect> getIncrease() {
        return increase;
    }

    public ArrayList<MoveStatAffect> getDecrease() {
        return decrease;
    }

    @Override
    public String toString() {
        return "MoveStatAffectSet{" + "increase=" + increase + ", decrease=" + decrease + '}';
    }

}

class MoveStatAffect {

    int change;
    NamedAPIResource move;

    public int getChange() {
        return change;
    }

    public NamedAPIResource getMove() {
        return move;
    }

    @Override
    public String toString() {
        return "MoveStatAffect{" + "change=" + change + ", move=" + move + '}';
    }

}

class NatureStatAffectSet {

    ArrayList<NamedAPIResource> increase;
    ArrayList<NamedAPIResource> decrease;

    public ArrayList<NamedAPIResource> getIncrease() {
        return increase;
    }

    public ArrayList<NamedAPIResource> getDecrease() {
        return decrease;
    }

    @Override
    public String toString() {
        return "NatureStatAffectSet{" + "increase=" + increase + ", decrease=" + decrease + '}';
    }

}
