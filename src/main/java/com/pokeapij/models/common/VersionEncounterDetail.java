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
public class VersionEncounterDetail {

    NamedAPIResource version;
    int max_chance;
    ArrayList<Encounter> encounter_details;

    public NamedAPIResource getVersion() {
        return version;
    }

    public int getMaxChance() {
        return max_chance;
    }

    public ArrayList<Encounter> getEncounterDetails() {
        return encounter_details;
    }

    @Override
    public String toString() {
        return "VersionEncounterDetail{" + "version=" + version + ", max_chance=" + max_chance + ", encounter_details=" + encounter_details + '}';
    }

}
