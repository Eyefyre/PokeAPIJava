/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import com.pokeapij.models.common.GenerationGameIndex;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Type {

    int id;
    String name;
    TypeRelations damage_relations;
    ArrayList<GenerationGameIndex> game_indices;
    NamedAPIResource move_damage_class;
    ArrayList<Name> names;
    ArrayList<TypePokemon> pokemon;
    ArrayList<NamedAPIResource> moves;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeRelations getDamage_relations() {
        return damage_relations;
    }

    public ArrayList<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public NamedAPIResource getMove_damage_class() {
        return move_damage_class;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<TypePokemon> getPokemon() {
        return pokemon;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return "Type{" + "id=" + id + ", name=" + name + ", damage_relations=" + damage_relations + ", game_indices=" + game_indices + ", move_damage_class=" + move_damage_class + ", names=" + names + ", pokemon=" + pokemon + ", moves=" + moves + '}';
    }

    public class TypePokemon {

        int slot;
        NamedAPIResource pokemon;

        public int getSlot() {
            return slot;
        }

        public NamedAPIResource getPokemon() {
            return pokemon;
        }

        @Override
        public String toString() {
            return "TypePokemon{" + "slot=" + slot + ", pokemon=" + pokemon + '}';
        }

    }

    public class TypeRelations {

        ArrayList<NamedAPIResource> no_damage_to;
        ArrayList<NamedAPIResource> half_damage_to;
        ArrayList<NamedAPIResource> double_damage_to;
        ArrayList<NamedAPIResource> no_damage_from;
        ArrayList<NamedAPIResource> half_damage_from;
        ArrayList<NamedAPIResource> double_damage_from;

        public ArrayList<NamedAPIResource> getNo_damage_to() {
            return no_damage_to;
        }

        public ArrayList<NamedAPIResource> getHalf_damage_to() {
            return half_damage_to;
        }

        public ArrayList<NamedAPIResource> getDouble_damage_to() {
            return double_damage_to;
        }

        public ArrayList<NamedAPIResource> getNo_damage_from() {
            return no_damage_from;
        }

        public ArrayList<NamedAPIResource> getHalf_damage_from() {
            return half_damage_from;
        }

        public ArrayList<NamedAPIResource> getDouble_damage_from() {
            return double_damage_from;
        }

        @Override
        public String toString() {
            return "TypeRelations{" + "no_damage_to=" + no_damage_to + ", half_damage_to=" + half_damage_to + ", double_damage_to=" + double_damage_to + ", no_damage_from=" + no_damage_from + ", half_damage_from=" + half_damage_from + ", double_damage_from=" + double_damage_from + '}';
        }

    }

}
