/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.common;

import com.pokeapij.models.resources.APIResource;
import com.pokeapij.models.resources.NamedAPIResource;

/**
 *
 * @author Adam
 */
public class MachineVersionDetail {

    APIResource machine;
    NamedAPIResource version_group;

    public APIResource getMachine() {
        return machine;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    @Override
    public String toString() {
        return "MachineVersionDetail{" + "machine=" + machine + ", version_group=" + version_group + '}';
    }

}
