/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.Moves;

import com.pokeapij.models.common.AbilityEffectChange;
import com.pokeapij.models.resources.APIResource;
import com.pokeapij.models.common.MachineVersionDetail;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;
import com.pokeapij.models.common.VerboseEffect;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Move {

    int id;
    String name;
    int accuracy;
    int effect_chance;
    int pp;
    int priority;
    int power;
    ContestComboSets contest_combos;
    NamedAPIResource contest_type;
    APIResource contest_effect;
    NamedAPIResource damage_class;
    ArrayList<VerboseEffect> effect_entries;
    ArrayList<AbilityEffectChange> effect_changes;
    ArrayList<MoveFlavorText> flavor_text_entries;
    NamedAPIResource generation;
    ArrayList<MachineVersionDetail> machines;
    MoveMetaData meta;
    ArrayList<Name> names;
    ArrayList<PastMoveStatValue> past_values;
    ArrayList<MoveStatChange> stat_changes;
    APIResource super_contest_effect;
    NamedAPIResource target;
    NamedAPIResource type;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getEffect_chance() {
        return effect_chance;
    }

    public int getPp() {
        return pp;
    }

    public int getPriority() {
        return priority;
    }

    public int getPower() {
        return power;
    }

    public ContestComboSets getContest_combos() {
        return contest_combos;
    }

    public NamedAPIResource getContest_type() {
        return contest_type;
    }

    public APIResource getContest_effect() {
        return contest_effect;
    }

    public NamedAPIResource getDamage_class() {
        return damage_class;
    }

    public ArrayList<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public ArrayList<AbilityEffectChange> getEffect_changes() {
        return effect_changes;
    }

    public ArrayList<MoveFlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public NamedAPIResource getGeneration() {
        return generation;
    }

    public ArrayList<MachineVersionDetail> getMachines() {
        return machines;
    }

    public MoveMetaData getMeta() {
        return meta;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PastMoveStatValue> getPast_values() {
        return past_values;
    }

    public ArrayList<MoveStatChange> getStat_changes() {
        return stat_changes;
    }

    public APIResource getSuper_contest_effect() {
        return super_contest_effect;
    }

    public NamedAPIResource getTarget() {
        return target;
    }

    public NamedAPIResource getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Move{" + "id=" + id + ", name=" + name + ", accuracy=" + accuracy + ", effect_chance=" + effect_chance + ", pp=" + pp + ", priority=" + priority + ", power=" + power + ", contest_combos=" + contest_combos + ", contest_type=" + contest_type + ", contest_effect=" + contest_effect + ", damage_class=" + damage_class + ", effect_entries=" + effect_entries + ", effect_changes=" + effect_changes + ", flavor_text_entries=" + flavor_text_entries + ", generation=" + generation + ", machines=" + machines + ", meta=" + meta + ", names=" + names + ", past_values=" + past_values + ", stat_changes=" + stat_changes + ", super_contest_effect=" + super_contest_effect + ", target=" + target + ", type=" + type + '}';
    }

}

class ContestComboSets {

    ContestComboDetail normal;
    ContestComboDetail Super;

    public ContestComboDetail getNormal() {
        return normal;
    }

    public ContestComboDetail getSuper() {
        return Super;
    }

    @Override
    public String toString() {
        return "ContestComboSets{" + "normal=" + normal + ", Super=" + Super + '}';
    }

}

class ContestComboDetail {

    ArrayList<NamedAPIResource> use_before;
    ArrayList<NamedAPIResource> use_after;

    public ContestComboDetail(ArrayList<NamedAPIResource> use_before, ArrayList<NamedAPIResource> use_after) {
        this.use_before = use_before;
        this.use_after = use_after;
    }

    public ArrayList<NamedAPIResource> getUse_before() {
        return use_before;
    }

    public ArrayList<NamedAPIResource> getUse_after() {
        return use_after;
    }

    @Override
    public String toString() {
        return "ContestComboDetail{" + "use_before=" + use_before + ", use_after=" + use_after + '}';
    }

}

class MoveFlavorText {

    String flavor_text;
    NamedAPIResource language;
    NamedAPIResource version_group;

    public String getFlavor_text() {
        return flavor_text;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    @Override
    public String toString() {
        return "MoveFlavorText{" + "flavor_text=" + flavor_text + ", language=" + language + ", version_group=" + version_group + '}';
    }

}

class PastMoveStatValue {

    int accuracy;
    int effect_chance;
    int power;
    int pp;
    ArrayList<VerboseEffect> effect_entries;
    NamedAPIResource type;
    NamedAPIResource version_group;

    public int getAccuracy() {
        return accuracy;
    }

    public int getEffect_chance() {
        return effect_chance;
    }

    public int getPower() {
        return power;
    }

    public int getPp() {
        return pp;
    }

    public ArrayList<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public NamedAPIResource getType() {
        return type;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    @Override
    public String toString() {
        return "PastMoveStatValue{" + "accuracy=" + accuracy + ", effect_chance=" + effect_chance + ", power=" + power + ", pp=" + pp + ", effect_entries=" + effect_entries + ", type=" + type + ", version_group=" + version_group + '}';
    }

}

class MoveStatChange {

    int change;
    NamedAPIResource stat;

    public int getChange() {
        return change;
    }

    public NamedAPIResource getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return "MoveStatChange{" + "change=" + change + ", stat=" + stat + '}';
    }

}

class MoveMetaData {

    NamedAPIResource ailment;
    NamedAPIResource category;
    int min_hits;
    int max_hits;
    int min_turns;
    int max_turns;
    int drain;
    int healing;
    int crit_rate;
    int ailment_chance;
    int flinch_chance;
    int stat_chance;

    public NamedAPIResource getAilment() {
        return ailment;
    }

    public NamedAPIResource getCategory() {
        return category;
    }

    public int getMin_hits() {
        return min_hits;
    }

    public int getMax_hits() {
        return max_hits;
    }

    public int getMin_turns() {
        return min_turns;
    }

    public int getMax_turns() {
        return max_turns;
    }

    public int getDrain() {
        return drain;
    }

    public int getHealing() {
        return healing;
    }

    public int getCrit_rate() {
        return crit_rate;
    }

    public int getAilment_chance() {
        return ailment_chance;
    }

    public int getFlinch_chance() {
        return flinch_chance;
    }

    public int getStat_chance() {
        return stat_chance;
    }

    @Override
    public String toString() {
        return "MoveMetaData{" + "ailment=" + ailment + ", category=" + category + ", min_hits=" + min_hits + ", max_hits=" + max_hits + ", min_turns=" + min_turns + ", max_turns=" + max_turns + ", drain=" + drain + ", healing=" + healing + ", crit_rate=" + crit_rate + ", ailment_chance=" + ailment_chance + ", flinch_chance=" + flinch_chance + ", stat_chance=" + stat_chance + '}';
    }

}
