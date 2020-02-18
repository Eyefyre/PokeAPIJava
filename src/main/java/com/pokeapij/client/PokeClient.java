/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.client;

import com.pokeapij.models.Encounters.*;
import com.pokeapij.models.Evolution.*;
import com.pokeapij.models.Games.*;
import com.pokeapij.models.Item.*;
import com.pokeapij.models.Locations.*;
import com.pokeapij.models.Machines.*;
import com.pokeapij.models.Moves.*;
import com.pokeapij.models.Utility.*;
import com.pokeapij.models.berries.*;
import com.pokeapij.models.contests.*;
import com.pokeapij.models.pokemon.*;
import com.pokeapij.models.resources.*;

/**
 *
 * @author Adam
 */
public class PokeClient implements PokeClientInterface {

    private final PokeService pokeService = new PokeService();

    @Override
    public NamedAPIResourceList getBerryList(int offset, int limit) {
        String fullpath = "berry/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getBerryFirmnessList(int offset, int limit) {
        String fullpath = "berry-firmness/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getBerryFlavorList(int offset, int limit) {
        String fullpath = "berry-flavor/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getContestTypeList(int offset, int limit) {
        String fullpath = "contest-type/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getContestEffectList(int offset, int limit) {
        String fullpath = "contest-effect/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (APIResourceList) pokeService.getCache().get(fullpath);
        }
        return (APIResourceList) pokeService.getResource(fullpath, "APIResourceList");
    }

    @Override
    public APIResourceList getSuperContestEffectList(int offset, int limit) {
        String fullpath = "super-contest-effect/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (APIResourceList) pokeService.getCache().get(fullpath);
        }
        return (APIResourceList) pokeService.getResource(fullpath, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getEncounterMethodList(int offset, int limit) {
        String fullpath = "encounter-method/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getEncounterConditionList(int offset, int limit) {
        String fullpath = "encounter-condition/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getEncounterConditionValueList(int offset, int limit) {
        String fullpath = "encounter-condition-value/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getEvolutionChainList(int offset, int limit) {
        String fullpath = "evolution-chain/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (APIResourceList) pokeService.getCache().get(fullpath);
        }
        return (APIResourceList) pokeService.getResource(fullpath, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getEvolutionTriggerList(int offset, int limit) {
        String fullpath = "evolution-trigger/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getGenerationList(int offset, int limit) {
        String fullpath = "generation/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokedexList(int offset, int limit) {
        String fullpath = "pokedex/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getVersionList(int offset, int limit) {
        String fullpath = "version/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getVersionGroupList(int offset, int limit) {
        String fullpath = "version-group/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemList(int offset, int limit) {
        String fullpath = "item/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains("fullpath")) {
            return (NamedAPIResourceList) pokeService.getCache().get("fullpath");
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemAttributeList(int offset, int limit) {
        String fullpath = "item-attribute/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemCategoryList(int offset, int limit) {
        String fullpath = "item-category/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemFlingEffectList(int offset, int limit) {
        String fullpath = "item-fling-effect/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemPocketList(int offset, int limit) {
        String fullpath = "item-pocket/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getLocationList(int offset, int limit) {
        String fullpath = "location/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains("fullpath")) {
            return (NamedAPIResourceList) pokeService.getCache().get("fullpath");
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getLocationAreaList(int offset, int limit) {
        String fullpath = "location-area/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPalParkAreaList(int offset, int limit) {
        String fullpath = "pal-park-area/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getRegionList(int offset, int limit) {
        String fullpath = "region/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getMachineList(int offset, int limit) {
        String fullpath = "machine/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains("fullpath")) {
            return (APIResourceList) pokeService.getCache().get("fullpath");
        }
        return (APIResourceList) pokeService.getResource(fullpath, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveList(int offset, int limit) {
        String fullpath = "move/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains("fullpath")) {
            return (NamedAPIResourceList) pokeService.getCache().get("fullpath");
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveAilmentList(int offset, int limit) {
        String fullpath = "move-ailment/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveBattleStyleList(int offset, int limit) {
        String fullpath = "move-battle-style/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveCategoryList(int offset, int limit) {
        String fullpath = "move-category/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveDamageClassList(int offset, int limit) {
        String fullpath = "move-damage-class/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveLearnMethodList(int offset, int limit) {
        String fullpath = "move-learn-method/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveTargetList(int offset, int limit) {
        String fullpath = "move-target/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getAbilityList(int offset, int limit) {
        String fullpath = "ability/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getCharacteristicList(int offset, int limit) {
        String fullpath = "characteristic/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (APIResourceList) pokeService.getCache().get(fullpath);
        }
        return (APIResourceList) pokeService.getResource(fullpath, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getEggGroupList(int offset, int limit) {
        String fullpath = "egg-group/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getGenderList(int offset, int limit) {
        String fullpath = "gender/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getGrowthRateList(int offset, int limit) {
        String fullpath = "growth-rate/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getNatureList(int offset, int limit) {
        String fullpath = "nature/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokeathlonStatList(int offset, int limit) {
        String fullpath = "pokeathlon-stat/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonList(int offset, int limit) {
        String fullpath = "pokemon/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonColorList(int offset, int limit) {
        String fullpath = "pokemon-color/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonFormList(int offset, int limit) {
        String fullpath = "pokemon-form/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonHabitatList(int offset, int limit) {
        String fullpath = "pokemon-habitat/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonShapeList(int offset, int limit) {
        String fullpath = "pokemon-shape/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonSpeciesList(int offset, int limit) {
        String fullpath = "pokemon-species/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getStatList(int offset, int limit) {
        String fullpath = "stat/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getTypeList(int offset, int limit) {
        String fullpath = "type/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getLanguageList(int offset, int limit) {
        String fullpath = "language/?limit=" + limit + "&" + "offset=" + offset;
        if (pokeService.getCache().contains(fullpath)) {
            return (NamedAPIResourceList) pokeService.getCache().get(fullpath);
        }
        return (NamedAPIResourceList) pokeService.getResource(fullpath, "NamedAPIResourceList");
    }

    @Override
    public Berry getBerry(int id) {
        String fullpath = "berry/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Berry) pokeService.getCache().get(fullpath);
        }
        return (Berry) pokeService.getResource(fullpath, "Berry");
    }

    @Override
    public Berry getBerry(String name) {
        String fullpath = "berry/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Berry) pokeService.getCache().get(fullpath);
        }
        return (Berry) pokeService.getResource(fullpath, "Berry");
    }

    @Override
    public BerryFirmness getBerryFirmness(int id) {
        String fullpath = "berry-firmness/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (BerryFirmness) pokeService.getCache().get(fullpath);
        }
        return (BerryFirmness) pokeService.getResource(fullpath, "BerryFirmness");
    }

    @Override
    public BerryFirmness getBerryFirmness(String name) {
        String fullpath = "berry-firmness/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (BerryFirmness) pokeService.getCache().get(fullpath);
        }
        return (BerryFirmness) pokeService.getResource(fullpath, "BerryFirmness");
    }

    @Override
    public BerryFlavor getBerryFlavor(int id) {
        String fullpath = "berry-flavor/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (BerryFlavor) pokeService.getCache().get(fullpath);
        }
        return (BerryFlavor) pokeService.getResource(fullpath, "BerryFlavor");
    }

    @Override
    public BerryFlavor getBerryFlavor(String name) {
        String fullpath = "berry-flavor/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (BerryFlavor) pokeService.getCache().get(fullpath);
        }
        return (BerryFlavor) pokeService.getResource(fullpath, "BerryFlavor");
    }

    @Override
    public ContestType getContestType(int id) {
        String fullpath = "contest-type/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (ContestType) pokeService.getCache().get(fullpath);
        }
        return (ContestType) pokeService.getResource(fullpath, "ContestType");
    }

    @Override
    public ContestType getContestType(String name) {
        String fullpath = "contest-type/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (ContestType) pokeService.getCache().get(fullpath);
        }
        return (ContestType) pokeService.getResource(fullpath, "ContestType");
    }

    @Override
    public ContestEffect getContestEffect(int id) {
        String fullpath = "contest-effect/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (ContestEffect) pokeService.getCache().get(fullpath);
        }
        return (ContestEffect) pokeService.getResource(fullpath, "ContestEffect");
    }

    @Override
    public SuperContestEffect getSuperContestEffect(int id) {
        String fullpath = "super-contest-effect/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (SuperContestEffect) pokeService.getCache().get(fullpath);
        }
        return (SuperContestEffect) pokeService.getResource(fullpath, "SuperContestEffect");
    }

    @Override
    public EncounterMethod getEncounterMethod(int id) {
        String fullpath = "encounter-method/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (EncounterMethod) pokeService.getCache().get(fullpath);
        }
        return (EncounterMethod) pokeService.getResource(fullpath, "EncounterMethod");
    }

    @Override
    public EncounterMethod getEncounterMethod(String name) {
        String fullpath = "encounter-method/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (EncounterMethod) pokeService.getCache().get(fullpath);
        }
        return (EncounterMethod) pokeService.getResource(fullpath, "EncounterMethod");
    }

    @Override
    public EncounterCondition getEncounterCondition(int id) {
        String fullpath = "encounter-condition/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (EncounterCondition) pokeService.getCache().get(fullpath);
        }
        return (EncounterCondition) pokeService.getResource(fullpath, "EncounterCondition");
    }

    @Override
    public EncounterCondition getEncounterCondition(String name) {
        String fullpath = "encounter-condition/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (EncounterCondition) pokeService.getCache().get(fullpath);
        }
        return (EncounterCondition) pokeService.getResource(fullpath, "EncounterCondition");
    }

    @Override
    public EncounterConditionValue getEncounterConditionValue(int id) {
        String fullpath = "encounter-condition-value/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (EncounterConditionValue) pokeService.getCache().get(fullpath);
        }
        return (EncounterConditionValue) pokeService.getResource(fullpath, "EncounterConditionValue");
    }

    @Override
    public EncounterConditionValue getEncounterConditionValue(String name) {
        String fullpath = "encounter-condition-value/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (EncounterConditionValue) pokeService.getCache().get(fullpath);
        }
        return (EncounterConditionValue) pokeService.getResource(fullpath, "EncounterConditionValue");
    }

    @Override
    public EvolutionChain getEvolutionChain(int id) {
        String fullpath = "evolution-chain/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (EvolutionChain) pokeService.getCache().get(fullpath);
        }
        return (EvolutionChain) pokeService.getResource(fullpath, "EvolutionChain");
    }

    @Override
    public EvolutionTrigger getEvolutionTrigger(int id) {
        String fullpath = "evolution-trigger/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (EvolutionTrigger) pokeService.getCache().get(fullpath);
        }
        return (EvolutionTrigger) pokeService.getResource(fullpath, "EvolutionTrigger");
    }

    @Override
    public EvolutionTrigger getEvolutionTrigger(String name) {
        String fullpath = "evolution-trigger/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (EvolutionTrigger) pokeService.getCache().get(fullpath);
        }
        return (EvolutionTrigger) pokeService.getResource(fullpath, "EvolutionTrigger");
    }

    @Override
    public Generation getGeneration(int id) {
        String fullpath = "generation/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Generation) pokeService.getCache().get(fullpath);
        }
        return (Generation) pokeService.getResource(fullpath, "Generation");
    }

    @Override
    public Generation getGeneration(String name) {
        String fullpath = "generation/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Generation) pokeService.getCache().get(fullpath);
        }
        return (Generation) pokeService.getResource(fullpath, "Generation");
    }

    @Override
    public Pokedex getPokedex(int id) {
        String fullpath = "pokedex/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Pokedex) pokeService.getCache().get(fullpath);
        }
        return (Pokedex) pokeService.getResource(fullpath, "Pokedex");
    }

    @Override
    public Pokedex getPokedex(String name) {
        String fullpath = "pokedex/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Pokedex) pokeService.getCache().get(fullpath);
        }
        return (Pokedex) pokeService.getResource(fullpath, "Pokedex");
    }

    @Override
    public Version getVersion(int id) {
        String fullpath = "version/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Version) pokeService.getCache().get(fullpath);
        }
        return (Version) pokeService.getResource(fullpath, "Version");
    }

    @Override
    public Version getVersion(String name) {
        String fullpath = "version/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Version) pokeService.getCache().get(fullpath);
        }
        return (Version) pokeService.getResource(fullpath, "Version");
    }

    @Override
    public VersionGroup getVersionGroup(int id) {
        String fullpath = "version-group/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (VersionGroup) pokeService.getCache().get(fullpath);
        }
        return (VersionGroup) pokeService.getResource(fullpath, "VersionGroup");
    }

    @Override
    public VersionGroup getVersionGroup(String name) {
        String fullpath = "version-group/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (VersionGroup) pokeService.getCache().get(fullpath);
        }
        return (VersionGroup) pokeService.getResource(fullpath, "VersionGroup");
    }

    @Override
    public Item getItem(int id) {
        String fullpath = "item/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Item) pokeService.getCache().get(fullpath);
        }
        return (Item) pokeService.getResource(fullpath, "Item");
    }

    @Override
    public Item getItem(String name) {
        String fullpath = "item/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Item) pokeService.getCache().get(fullpath);
        }
        return (Item) pokeService.getResource(fullpath, "Item");
    }

    @Override
    public ItemAttribute getItemAttribute(int id) {
        String fullpath = "item-attribute/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemAttribute) pokeService.getCache().get(fullpath);
        }
        return (ItemAttribute) pokeService.getResource(fullpath, "ItemAttribute");
    }

    @Override
    public ItemAttribute getItemAttribute(String name) {
        String fullpath = "item-attribute/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemAttribute) pokeService.getCache().get(fullpath);
        }
        return (ItemAttribute) pokeService.getResource(fullpath, "ItemAttribute");
    }

    @Override
    public ItemCategory getItemCategory(int id) {
        String fullpath = "item-category/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemCategory) pokeService.getCache().get(fullpath);
        }
        return (ItemCategory) pokeService.getResource(fullpath, "ItemCategory");
    }

    @Override
    public ItemCategory getItemCategory(String name) {
        String fullpath = "item-category/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemCategory) pokeService.getCache().get(fullpath);
        }
        return (ItemCategory) pokeService.getResource(fullpath, "ItemCategory");
    }

    @Override
    public ItemFlingEffect getItemFlingEffect(int id) {
        String fullpath = "item-fling-effect/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemFlingEffect) pokeService.getCache().get(fullpath);
        }
        return (ItemFlingEffect) pokeService.getResource(fullpath, "ItemFlingEffect");
    }

    @Override
    public ItemFlingEffect getItemFlingEffect(String name) {
        String fullpath = "item-fling-effect/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemFlingEffect) pokeService.getCache().get(fullpath);
        }
        return (ItemFlingEffect) pokeService.getResource(fullpath, "ItemFlingEffect");
    }

    @Override
    public ItemPocket getItemPocket(int id) {
        String fullpath = "item-pocket/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemPocket) pokeService.getCache().get(fullpath);
        }
        return (ItemPocket) pokeService.getResource(fullpath, "ItemPocket");
    }

    @Override
    public ItemPocket getItemPocket(String name) {
        String fullpath = "item-pocket/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (ItemPocket) pokeService.getCache().get(fullpath);
        }
        return (ItemPocket) pokeService.getResource(fullpath, "ItemPocket");
    }

    @Override
    public Location getLocation(int id) {
        String fullpath = "location/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Location) pokeService.getCache().get(fullpath);
        }
        return (Location) pokeService.getResource(fullpath, "Location");
    }

    @Override
    public Location getLocation(String name) {
        String fullpath = "location/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Location) pokeService.getCache().get(fullpath);
        }
        return (Location) pokeService.getResource(fullpath, "Location");
    }

    @Override
    public LocationArea getLocationArea(int id) {
        String fullpath = "location-area/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (LocationArea) pokeService.getCache().get(fullpath);
        }
        return (LocationArea) pokeService.getResource(fullpath, "LocationArea");
    }

    @Override
    public LocationArea getLocationArea(String name) {
        String fullpath = "location-area/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (LocationArea) pokeService.getCache().get(fullpath);
        }
        return (LocationArea) pokeService.getResource(fullpath, "LocationArea");
    }

    @Override
    public PalParkArea getPalParkArea(int id) {
        String fullpath = "pal-park-area/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (PalParkArea) pokeService.getCache().get(fullpath);
        }
        return (PalParkArea) pokeService.getResource(fullpath, "PalParkArea");
    }

    @Override
    public PalParkArea getPalParkArea(String name) {
        String fullpath = "pal-park-area/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (PalParkArea) pokeService.getCache().get(fullpath);
        }
        return (PalParkArea) pokeService.getResource(fullpath, "PalParkArea");
    }

    @Override
    public Region getRegion(int id) {
        String fullpath = "region/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Region) pokeService.getCache().get(fullpath);
        }
        return (Region) pokeService.getResource(fullpath, "Region");
    }

    @Override
    public Region getRegion(String name) {
        String fullpath = "region/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Region) pokeService.getCache().get(fullpath);
        }
        return (Region) pokeService.getResource(fullpath, "Region");
    }

    @Override
    public Machine getMachine(int id) {
        String fullpath = "machine/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Machine) pokeService.getCache().get(fullpath);
        }
        return (Machine) pokeService.getResource(fullpath, "Machine");
    }

    @Override
    public Move getMove(int id) {
        String fullpath = "move/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Move) pokeService.getCache().get(fullpath);
        }
        return (Move) pokeService.getResource(fullpath, "Move");
    }

    @Override
    public Move getMove(String name) {
        String fullpath = "move/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Move) pokeService.getCache().get(fullpath);
        }
        return (Move) pokeService.getResource(fullpath, "Move");
    }

    @Override
    public MoveAilment getMoveAilment(int id) {
        String fullpath = "move-ailment/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveAilment) pokeService.getCache().get(fullpath);
        }
        return (MoveAilment) pokeService.getResource(fullpath, "MoveAilment");
    }

    @Override
    public MoveAilment getMoveAilment(String name) {
        String fullpath = "move-ailment/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveAilment) pokeService.getCache().get(fullpath);
        }
        return (MoveAilment) pokeService.getResource(fullpath, "MoveAilment");
    }

    @Override
    public MoveBattleStyle getMoveBattleStyle(int id) {
        String fullpath = "move-battle-style/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveBattleStyle) pokeService.getCache().get(fullpath);
        }
        return (MoveBattleStyle) pokeService.getResource(fullpath, "MoveBattleStyle");
    }

    @Override
    public MoveBattleStyle getMoveBattleStyle(String name) {
        String fullpath = "move-battle-style/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveBattleStyle) pokeService.getCache().get(fullpath);
        }
        return (MoveBattleStyle) pokeService.getResource(fullpath, "MoveBattleStyle");
    }

    @Override
    public MoveCategory getMoveCategory(int id) {
        String fullpath = "move-category/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveCategory) pokeService.getCache().get(fullpath);
        }
        return (MoveCategory) pokeService.getResource(fullpath, "MoveCategory");
    }

    @Override
    public MoveCategory getMoveCategory(String name) {
        String fullpath = "move-category/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveCategory) pokeService.getCache().get(fullpath);
        }
        return (MoveCategory) pokeService.getResource(fullpath, "MoveCategory");
    }

    @Override
    public MoveDamageClass getMoveDamageClass(int id) {
        String fullpath = "move-damage-class/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveDamageClass) pokeService.getCache().get(fullpath);
        }
        return (MoveDamageClass) pokeService.getResource(fullpath, "MoveDamageClass");
    }

    @Override
    public MoveDamageClass getMoveDamageClass(String name) {
        String fullpath = "move-damage-class/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveDamageClass) pokeService.getCache().get(fullpath);
        }
        return (MoveDamageClass) pokeService.getResource(fullpath, "MoveDamageClass");
    }

    @Override
    public MoveLearnMethod getMoveLearnMethod(int id) {
        String fullpath = "move-learn-method/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveLearnMethod) pokeService.getCache().get(fullpath);
        }
        return (MoveLearnMethod) pokeService.getResource(fullpath, "MoveLearnMethod");
    }

    @Override
    public MoveLearnMethod getMoveLearnMethod(String name) {
        String fullpath = "move-learn-method/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveLearnMethod) pokeService.getCache().get(fullpath);
        }
        return (MoveLearnMethod) pokeService.getResource(fullpath, "MoveLearnMethod");
    }

    @Override
    public MoveTarget getMoveTarget(int id) {
        String fullpath = "move-target/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveTarget) pokeService.getCache().get(fullpath);
        }
        return (MoveTarget) pokeService.getResource(fullpath, "MoveTarget");
    }

    @Override
    public MoveTarget getMoveTarget(String name) {
        String fullpath = "move-target/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (MoveTarget) pokeService.getCache().get(fullpath);
        }
        return (MoveTarget) pokeService.getResource(fullpath, "MoveTarget");
    }

    @Override
    public Ability getAbility(int id) {
        String fullpath = "ability/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Ability) pokeService.getCache().get(fullpath);
        }
        return (Ability) pokeService.getResource(fullpath, "Ability");
    }

    @Override
    public Ability getAbility(String name) {
        String fullpath = "ability/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Ability) pokeService.getCache().get(fullpath);
        }
        return (Ability) pokeService.getResource(fullpath, "Ability");
    }

    @Override
    public Characteristic getCharacteristic(int id) {
        String fullpath = "characteristic/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Characteristic) pokeService.getCache().get(fullpath);
        }
        return (Characteristic) pokeService.getResource(fullpath, "Characteristic");
    }

    @Override
    public EggGroup getEggGroup(int id) {
        String fullpath = "egg-group/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (EggGroup) pokeService.getCache().get(fullpath);
        }
        return (EggGroup) pokeService.getResource(fullpath, "EggGroup");
    }

    @Override
    public EggGroup getEggGroup(String name) {
        String fullpath = "egg-group/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (EggGroup) pokeService.getCache().get(fullpath);
        }
        return (EggGroup) pokeService.getResource(fullpath, "EggGroup");
    }

    @Override
    public Gender getGender(int id) {
        String fullpath = "gender/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Gender) pokeService.getCache().get(fullpath);
        }
        return (Gender) pokeService.getResource(fullpath, "Gender");
    }

    @Override
    public Gender getGender(String name) {
        String fullpath = "gender/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Gender) pokeService.getCache().get(fullpath);
        }
        return (Gender) pokeService.getResource(fullpath, "Gender");
    }

    @Override
    public GrowthRate getGrowthRate(int id) {
        String fullpath = "growth-rate/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (GrowthRate) pokeService.getCache().get(fullpath);
        }
        return (GrowthRate) pokeService.getResource(fullpath, "GrowthRate");
    }

    @Override
    public GrowthRate getGrowthRate(String name) {
        String fullpath = "growth-rate/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (GrowthRate) pokeService.getCache().get(fullpath);
        }
        return (GrowthRate) pokeService.getResource(fullpath, "GrowthRate");
    }

    @Override
    public Nature getNature(int id) {
        String fullpath = "nature/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Nature) pokeService.getCache().get(fullpath);
        }
        return (Nature) pokeService.getResource(fullpath, "Nature");
    }

    @Override
    public Nature getNature(String name) {
        String fullpath = "nature/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Nature) pokeService.getCache().get(fullpath);
        }
        return (Nature) pokeService.getResource(fullpath, "Nature");
    }

    @Override
    public PokeathlonStat getPokeathlonStat(int id) {
        String fullpath = "pokeathlon-stat/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokeathlonStat) pokeService.getCache().get(fullpath);
        }
        return (PokeathlonStat) pokeService.getResource(fullpath, "PokeathlonStat");
    }

    @Override
    public PokeathlonStat getPokeathlonStat(String name) {
        String fullpath = "pokeathlon-stat/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokeathlonStat) pokeService.getCache().get(fullpath);
        }
        return (PokeathlonStat) pokeService.getResource(fullpath, "PokeathlonStat");
    }

    @Override
    public Pokemon getPokemon(int id) {
        String fullpath = "pokemon/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Pokemon) pokeService.getCache().get(fullpath);
        }
        return (Pokemon) pokeService.getResource(fullpath, "Pokemon");
    }

    @Override
    public Pokemon getPokemon(String name) {
        String fullpath = "pokemon/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Pokemon) pokeService.getCache().get(fullpath);
        }
        return (Pokemon) pokeService.getResource(fullpath, "Pokemon");
    }

    @Override
    public PokemonColor getPokemonColor(int id) {
        String fullpath = "pokemon-color/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonColor) pokeService.getCache().get(fullpath);
        }
        return (PokemonColor) pokeService.getResource(fullpath, "PokemonColor");
    }

    @Override
    public PokemonColor getPokemonColor(String name) {
        String fullpath = "pokemon-color/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonColor) pokeService.getCache().get(fullpath);
        }
        return (PokemonColor) pokeService.getResource(fullpath, "PokemonColor");
    }

    @Override
    public PokemonForm getPokemonForm(int id) {
        String fullpath = "pokemon-form/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonForm) pokeService.getCache().get(fullpath);
        }
        return (PokemonForm) pokeService.getResource(fullpath, "PokemonForm");
    }

    @Override
    public PokemonForm getPokemonForm(String name) {
        String fullpath = "pokemon-form/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonForm) pokeService.getCache().get(fullpath);
        }
        return (PokemonForm) pokeService.getResource(fullpath, "PokemonForm");
    }

    @Override
    public PokemonHabitat getPokemonHabitat(int id) {
        String fullpath = "pokemon-habitat/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonHabitat) pokeService.getCache().get(fullpath);
        }
        return (PokemonHabitat) pokeService.getResource(fullpath, "PokemonHabitat");
    }

    @Override
    public PokemonHabitat getPokemonHabitat(String name) {
        String fullpath = "pokemon-habitat/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonHabitat) pokeService.getCache().get(fullpath);
        }
        return (PokemonHabitat) pokeService.getResource(fullpath, "PokemonHabitat");
    }

    @Override
    public PokemonShape getPokemonShape(int id) {
        String fullpath = "pokemon-shape/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonShape) pokeService.getCache().get(fullpath);
        }
        return (PokemonShape) pokeService.getResource(fullpath, "PokemonShape");
    }

    @Override
    public PokemonShape getPokemonShape(String name) {
        String fullpath = "pokemon-shape/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonShape) pokeService.getCache().get(fullpath);
        }
        return (PokemonShape) pokeService.getResource(fullpath, "PokemonShape");
    }

    @Override
    public PokemonSpecies getPokemonSpecies(int id) {
        String fullpath = "pokemon-species/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonSpecies) pokeService.getCache().get(fullpath);
        }
        return (PokemonSpecies) pokeService.getResource(fullpath, "PokemonSpecies");
    }

    @Override
    public PokemonSpecies getPokemonSpecies(String name) {
        String fullpath = "pokemon-species/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (PokemonSpecies) pokeService.getCache().get(fullpath);
        }
        return (PokemonSpecies) pokeService.getResource(fullpath, "PokemonSpecies");
    }

    @Override
    public Stat getStat(int id) {
        String fullpath = "stat/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Stat) pokeService.getCache().get(fullpath);
        }
        return (Stat) pokeService.getResource(fullpath, "Stat");
    }

    @Override
    public Stat getStat(String name) {
        String fullpath = "stat/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Stat) pokeService.getCache().get(fullpath);
        }
        return (Stat) pokeService.getResource(fullpath, "Stat");
    }

    @Override
    public Type getType(int id) {
        String fullpath = "type/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Type) pokeService.getCache().get(fullpath);
        }
        return (Type) pokeService.getResource(fullpath, "Type");
    }

    @Override
    public Type getType(String name) {
        String fullpath = "type/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Type) pokeService.getCache().get(fullpath);
        }
        return (Type) pokeService.getResource(fullpath, "Type");
    }

    @Override
    public Language getLanguage(int id) {
        String fullpath = "language/" + id;
        if (pokeService.getCache().contains(fullpath)) {
            return (Language) pokeService.getCache().get(fullpath);
        }
        return (Language) pokeService.getResource(fullpath, "Language");
    }

    @Override
    public Language getLanguage(String name) {
        String fullpath = "language/" + name;
        if (pokeService.getCache().contains(fullpath)) {
            return (Language) pokeService.getCache().get(fullpath);
        }
        return (Language) pokeService.getResource(fullpath, "Language");
    }

}
