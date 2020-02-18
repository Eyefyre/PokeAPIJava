/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;

/**
 *
 * @author Adam
 */
public class VersionGameIndex {

    int game_index;
    NamedAPIResource version;

    public int getGame_index() {
        return game_index;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "VersionGameIndex{" + "game_index=" + game_index + ", version=" + version + '}';
    }

}
