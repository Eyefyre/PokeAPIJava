/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Machines;

import com.pokeapij.models.resources.NamedAPIResource;

/**
 *
 * @author Adam
 */
public class Machine {
    int id;
    NamedAPIResource item;
    NamedAPIResource move;
    NamedAPIResource version_group;

    public Machine(int id, NamedAPIResource item, NamedAPIResource move, NamedAPIResource version_group) {
        this.id = id;
        this.item = item;
        this.move = move;
        this.version_group = version_group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NamedAPIResource getItem() {
        return item;
    }

    public void setItem(NamedAPIResource item) {
        this.item = item;
    }

    public NamedAPIResource getMove() {
        return move;
    }

    public void setMove(NamedAPIResource move) {
        this.move = move;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource version_group) {
        this.version_group = version_group;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", item=" + item + ", move=" + move + ", version_group=" + version_group + '}';
    }
    
    
}
