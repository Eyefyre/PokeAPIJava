/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.contests;

import com.pokeapij.models.common.Effect;
import com.pokeapij.models.common.FlavorText;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class ContestEffect {

    int id;
    int appeal;
    int jam;
    ArrayList<Effect> effect_entries;
    ArrayList<FlavorText> flavor_text_entries;

    public int getID() {
        return id;
    }

    public int getAppeal() {
        return appeal;
    }

    public int getJam() {
        return jam;
    }

    public ArrayList<Effect> getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<FlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    @Override
    public String toString() {
        return "ContestEffects{" + "id=" + id + ", appeal=" + appeal + ", jam=" + jam + ", effect_entries=" + effect_entries + ", flavor_text_entries=" + flavor_text_entries + '}';
    }

}
