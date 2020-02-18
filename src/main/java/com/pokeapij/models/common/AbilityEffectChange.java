/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class AbilityEffectChange {

    ArrayList<Effect> effect_entries;
    NamedAPIResource version_group;

    public ArrayList<Effect> getEffect_entries() {
        return effect_entries;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    @Override
    public String toString() {
        return "AbilityEffectChange{" + "effect_entries=" + effect_entries + ", version_group=" + version_group + '}';
    }

}
