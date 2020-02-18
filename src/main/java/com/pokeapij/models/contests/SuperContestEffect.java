/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.contests;

import com.pokeapij.models.common.FlavorText;
import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class SuperContestEffect {

    int id;
    int appeal;
    ArrayList<FlavorText> flavor_text_entries;
    ArrayList<NamedAPIResource> moves;

    public int getId() {
        return id;
    }

    public int getAppeal() {
        return appeal;
    }

    public ArrayList<FlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return "SuperContestEffect{" + "id=" + id + ", appeal=" + appeal + ", flavor_text_entries=" + flavor_text_entries + ", moves=" + moves + '}';
    }

}
