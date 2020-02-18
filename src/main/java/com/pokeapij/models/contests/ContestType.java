/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.contests;

import com.pokeapij.models.resources.NamedAPIResource;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class ContestType {

    int id;
    String name;
    NamedAPIResource berry_flavor;
    ArrayList<ContestName> names;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public NamedAPIResource getBerry_flavor() {
        return berry_flavor;
    }

    public ArrayList<ContestName> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "ContestType{" + "id=" + id + ", name=" + name + ", berry_flavor=" + berry_flavor + ", names=" + names + '}';
    }

    public class ContestName {

        String name;
        String color;
        NamedAPIResource language;

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public NamedAPIResource getLanguage() {
            return language;
        }

        @Override
        public String toString() {
            return "ContestName{" + "name=" + name + ", color=" + color + ", language=" + language + '}';
        }

    }

}
