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

    private Object getObject(String path, int offset, int limit, String objectName) {
        String fullpath = path + "/?limit=" + limit + "&" + "offset=" + offset;
        return this.useService(fullpath, objectName);
    }

    private Object useService(String path, String objectName) {
        if (pokeService.getCache().contains(path)) {
            return pokeService.getCache().get(path);
        }
        return pokeService.getResource(path, objectName);
    }

    private Object getObject(String path, String name, String objectName) {
        String fullpath = path + "/" + name;
        return this.useService(fullpath, objectName);

    }

    private Object getObject(String path, int id, String objectName) {
        String fullpath = path + "/" + id;
        return this.useService(fullpath, objectName);
    }

    @Override
    public NamedAPIResourceList getBerryList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("berry", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getBerryFirmnessList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("berry-firmness", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getBerryFlavorList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("berry-flavor", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getContestTypeList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("contest-type", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getContestEffectList(int offset, int limit) {
        return (APIResourceList) this.getObject("contest-effect", offset, limit, "APIResourceList");
    }

    @Override
    public APIResourceList getSuperContestEffectList(int offset, int limit) {
        return (APIResourceList) this.getObject("super-contest-effect", offset, limit, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getEncounterMethodList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("encounter-method", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getEncounterConditionList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("encounter-condition", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getEncounterConditionValueList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("encounter-condition-value", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getEvolutionChainList(int offset, int limit) {
        return (APIResourceList) this.getObject("evolution-chain", offset, limit, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getEvolutionTriggerList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("evolution-trigger", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getGenerationList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("generation", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokedexList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokedex", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getVersionList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("version", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getVersionGroupList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("version-group", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("item", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemAttributeList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("item-attribute", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemCategoryList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("item-category", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemFlingEffectList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("item-fling-effect", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getItemPocketList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("item-pocket", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getLocationList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("location", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getLocationAreaList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("location-area", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPalParkAreaList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pal-park-area", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getRegionList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("region", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getMachineList(int offset, int limit) {
        return (APIResourceList) this.getObject("machine", offset, limit, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("move", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveAilmentList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("move-ailment", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveBattleStyleList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("move-battle-style", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveCategoryList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("move-category", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveDamageClassList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("move-damage-class", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveLearnMethodList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("move-learn-method", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getMoveTargetList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("move-target", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getAbilityList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("ability", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public APIResourceList getCharacteristicList(int offset, int limit) {
        return (APIResourceList) this.getObject("characteristic", offset, limit, "APIResourceList");
    }

    @Override
    public NamedAPIResourceList getEggGroupList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("egg-group", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getGenderList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("gender", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getGrowthRateList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("growth-rate", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getNatureList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("nature", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokeathlonStatList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokeathlon-stat", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokemon", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonColorList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokemon-color", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonFormList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokemon-form", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonHabitatList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokemon-habitat", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonShapeList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokemon-shape", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getPokemonSpeciesList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("pokemon-species", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getStatList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("stat", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getTypeList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("type", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public NamedAPIResourceList getLanguageList(int offset, int limit) {
        return (NamedAPIResourceList) this.getObject("language", offset, limit, "NamedAPIResourceList");
    }

    @Override
    public Berry getBerry(int id) {
        return (Berry) this.getObject("berry", id, "Berry");
    }

    @Override
    public Berry getBerry(String name) {
        return (Berry) this.getObject("berry", name, "Berry");
    }

    @Override
    public BerryFirmness getBerryFirmness(int id) {
        return (BerryFirmness) this.getObject("berry-firmness", id, "BerryFirmness");
    }

    @Override
    public BerryFirmness getBerryFirmness(String name) {
        return (BerryFirmness) this.getObject("berry-firmness", name, "BerryFirmness");
    }

    @Override
    public BerryFlavor getBerryFlavor(int id) {
        return (BerryFlavor) this.getObject("berry-flavor", id, "BerryFlavor");
    }

    @Override
    public BerryFlavor getBerryFlavor(String name) {
        return (BerryFlavor) this.getObject("berry-flavor", name, "BerryFlavor");
    }

    @Override
    public ContestType getContestType(int id) {
        return (ContestType) this.getObject("contest-type", id, "ContestType");
    }

    @Override
    public ContestType getContestType(String name) {
        return (ContestType) this.getObject("contest-type", name, "ContestType");
    }

    @Override
    public ContestEffect getContestEffect(int id) {
        return (ContestEffect) this.getObject("contest-effect", id, "ContestEffect");
    }

    @Override
    public SuperContestEffect getSuperContestEffect(int id) {
        return (SuperContestEffect) this.getObject("super-contest-effect", id, "SuperContestEffect");
    }

    @Override
    public EncounterMethod getEncounterMethod(int id) {
        return (EncounterMethod) this.getObject("encounter-method", id, "EncounterMethod");
    }

    @Override
    public EncounterMethod getEncounterMethod(String name) {
        return (EncounterMethod) this.getObject("encounter-method", name, "EncounterMethod");
    }

    @Override
    public EncounterCondition getEncounterCondition(int id) {
        return (EncounterCondition) this.getObject("encounter-condition", id, "EncounterCondition");
    }

    @Override
    public EncounterCondition getEncounterCondition(String name) {
        return (EncounterCondition) this.getObject("encounter-condition", name, "EncounterCondition");
    }

    @Override
    public EncounterConditionValue getEncounterConditionValue(int id) {
        return (EncounterConditionValue) this.getObject("encounter-condition-value", id, "EncounterConditionValue");
    }

    @Override
    public EncounterConditionValue getEncounterConditionValue(String name) {
        return (EncounterConditionValue) this.getObject("encounter-condition-value", name, "EncounterConditionValue");
    }

    @Override
    public EvolutionChain getEvolutionChain(int id) {
        return (EvolutionChain) this.getObject("evolution-chain", id, "EvolutionChain");
    }

    @Override
    public EvolutionTrigger getEvolutionTrigger(int id) {
        return (EvolutionTrigger) this.getObject("evolution-trigger", id, "EvolutionTrigger");
    }

    @Override
    public EvolutionTrigger getEvolutionTrigger(String name) {
        return (EvolutionTrigger) this.getObject("evolution-trigger", name, "EvolutionTrigger");
    }

    @Override
    public Generation getGeneration(int id) {
        return (Generation) this.getObject("generation", id, "Generation");
    }

    @Override
    public Generation getGeneration(String name) {
        return (Generation) this.getObject("generation", name, "Generation");
    }

    @Override
    public Pokedex getPokedex(int id) {
        return (Pokedex) this.getObject("pokedex", id, "Pokedex");
    }

    @Override
    public Pokedex getPokedex(String name) {
        return (Pokedex) this.getObject("pokedex", name, "Pokedex");
    }

    @Override
    public Version getVersion(int id) {
        return (Version) this.getObject("version", id, "Version");
    }

    @Override
    public Version getVersion(String name) {
        return (Version) this.getObject("version", name, "Version");
    }

    @Override
    public VersionGroup getVersionGroup(int id) {
        return (VersionGroup) this.getObject("version-group", id, "VersionGroup");
    }

    @Override
    public VersionGroup getVersionGroup(String name) {
        return (VersionGroup) this.getObject("version-group", name, "VersionGroup");
    }

    @Override
    public Item getItem(int id) {
        return (Item) this.getObject("item", id, "Item");
    }

    @Override
    public Item getItem(String name) {
        return (Item) this.getObject("item", name, "Item");
    }

    @Override
    public ItemAttribute getItemAttribute(int id) {
        return (ItemAttribute) this.getObject("item-attribute", id, "ItemAttribute");
    }

    @Override
    public ItemAttribute getItemAttribute(String name) {
        return (ItemAttribute) this.getObject("item-attribute", name, "ItemAttribute");
    }

    @Override
    public ItemCategory getItemCategory(int id) {
        return (ItemCategory) this.getObject("item-category", id, "ItemCategory");
    }

    @Override
    public ItemCategory getItemCategory(String name) {
        return (ItemCategory) this.getObject("item-category", name, "ItemCategory");
    }

    @Override
    public ItemFlingEffect getItemFlingEffect(int id) {
        return (ItemFlingEffect) this.getObject("item-fling-effect", id, "ItemFlingEffect");
    }

    @Override
    public ItemFlingEffect getItemFlingEffect(String name) {
        return (ItemFlingEffect) this.getObject("item-fling-effect", name, "ItemFlingEffect");
    }

    @Override
    public ItemPocket getItemPocket(int id) {
        return (ItemPocket) this.getObject("item-pocket", id, "ItemPocket");
    }

    @Override
    public ItemPocket getItemPocket(String name) {
        return (ItemPocket) this.getObject("item-pocket", name, "ItemPocket");
    }

    @Override
    public Location getLocation(int id) {
        return (Location) this.getObject("location", id, "Location");
    }

    @Override
    public Location getLocation(String name) {
        return (Location) this.getObject("location", name, "Location");
    }

    @Override
    public LocationArea getLocationArea(int id) {
        return (LocationArea) this.getObject("location-area", id, "LocationArea");
    }

    @Override
    public LocationArea getLocationArea(String name) {
        return (LocationArea) this.getObject("location-area", name, "LocationArea");
    }

    @Override
    public PalParkArea getPalParkArea(int id) {
        return (PalParkArea) this.getObject("pal-park-area", id, "PalParkArea");
    }

    @Override
    public PalParkArea getPalParkArea(String name) {
        return (PalParkArea) this.getObject("pal-park-area", name, "PalParkArea");
    }

    @Override
    public Region getRegion(int id) {
        return (Region) this.getObject("region", id, "Region");
    }

    @Override
    public Region getRegion(String name) {
        return (Region) this.getObject("region", name, "Region");
    }

    @Override
    public Machine getMachine(int id) {
        return (Machine) this.getObject("machine", id, "Machine");
    }

    @Override
    public Move getMove(int id) {
        return (Move) this.getObject("move", id, "Move");
    }

    @Override
    public Move getMove(String name) {
        return (Move) this.getObject("move", name, "Move");
    }

    @Override
    public MoveAilment getMoveAilment(int id) {
        return (MoveAilment) this.getObject("move-ailment", id, "MoveAilment");
    }

    @Override
    public MoveAilment getMoveAilment(String name) {
        return (MoveAilment) this.getObject("move-ailment", name, "MoveAilment");
    }

    @Override
    public MoveBattleStyle getMoveBattleStyle(int id) {
        return (MoveBattleStyle) this.getObject("move-battle-style", id, "MoveBattleStyle");
    }

    @Override
    public MoveBattleStyle getMoveBattleStyle(String name) {
        return (MoveBattleStyle) this.getObject("move-battle-style", name, "MoveBattleStyle");
    }

    @Override
    public MoveCategory getMoveCategory(int id) {
        return (MoveCategory) this.getObject("move-category", id, "MoveCategory");
    }

    @Override
    public MoveCategory getMoveCategory(String name) {
        return (MoveCategory) this.getObject("move-category", name, "MoveCategory");
    }

    @Override
    public MoveDamageClass getMoveDamageClass(int id) {
        return (MoveDamageClass) this.getObject("move-damage-class", id, "MoveDamageClass");
    }

    @Override
    public MoveDamageClass getMoveDamageClass(String name) {
        return (MoveDamageClass) this.getObject("move-damage-class", name, "MoveDamageClass");
    }

    @Override
    public MoveLearnMethod getMoveLearnMethod(int id) {
        return (MoveLearnMethod) this.getObject("move-learn-method", id, "MoveLearnMethod");
    }

    @Override
    public MoveLearnMethod getMoveLearnMethod(String name) {
        return (MoveLearnMethod) this.getObject("move-learn-method", name, "MoveLearnMethod");
    }

    @Override
    public MoveTarget getMoveTarget(int id) {
        return (MoveTarget) this.getObject("move-target", id, "MoveTarget");
    }

    @Override
    public MoveTarget getMoveTarget(String name) {
        return (MoveTarget) this.getObject("move-target", name, "MoveTarget");
    }

    @Override
    public Ability getAbility(int id) {
        return (Ability) this.getObject("ability", id, "Ability");
    }

    @Override
    public Ability getAbility(String name) {
        return (Ability) this.getObject("ability", name, "Ability");
    }

    @Override
    public Characteristic getCharacteristic(int id) {
        return (Characteristic) this.getObject("characteristic", id, "Characteristic");
    }

    @Override
    public EggGroup getEggGroup(int id) {
        return (EggGroup) this.getObject("egg-group", id, "EggGroup");
    }

    @Override
    public EggGroup getEggGroup(String name) {
        return (EggGroup) this.getObject("egg-group", name, "EggGroup");
    }

    @Override
    public Gender getGender(int id) {
        return (Gender) this.getObject("gender", id, "Gender");
    }

    @Override
    public Gender getGender(String name) {
        return (Gender) this.getObject("gender", name, "Gender");
    }

    @Override
    public GrowthRate getGrowthRate(int id) {
        return (GrowthRate) this.getObject("growth-rate", id, "GrowthRate");
    }

    @Override
    public GrowthRate getGrowthRate(String name) {
        return (GrowthRate) this.getObject("growth-rate", name, "GrowthRate");
    }

    @Override
    public Nature getNature(int id) {
        return (Nature) this.getObject("nature", id, "Nature");
    }

    @Override
    public Nature getNature(String name) {
        return (Nature) this.getObject("nature", name, "Nature");
    }

    @Override
    public PokeathlonStat getPokeathlonStat(int id) {
        return (PokeathlonStat) this.getObject("pokeathlon-stat", id, "PokeathlonStat");
    }

    @Override
    public PokeathlonStat getPokeathlonStat(String name) {
        return (PokeathlonStat) this.getObject("pokeathlon-stat", name, "PokeathlonStat");
    }

    @Override
    public Pokemon getPokemon(int id) {
        return (Pokemon) this.getObject("pokemon", id, "Pokemon");
    }

    @Override
    public Pokemon getPokemon(String name) {
        return (Pokemon) this.getObject("pokemon", name, "Pokemon");
    }

    @Override
    public PokemonColor getPokemonColor(int id) {
        return (PokemonColor) this.getObject("pokemon-color", id, "PokemonColor");
    }

    @Override
    public PokemonColor getPokemonColor(String name) {
        return (PokemonColor) this.getObject("pokemon-color", name, "PokemonColor");
    }

    @Override
    public PokemonForm getPokemonForm(int id) {
        return (PokemonForm) this.getObject("pokemon-form", id, "PokemonForm");
    }

    @Override
    public PokemonForm getPokemonForm(String name) {
        return (PokemonForm) this.getObject("pokemon-form", name, "PokemonForm");
    }

    @Override
    public PokemonHabitat getPokemonHabitat(int id) {
        return (PokemonHabitat) this.getObject("pokemon-habitat", id, "PokemonHabitat");
    }

    @Override
    public PokemonHabitat getPokemonHabitat(String name) {
        return (PokemonHabitat) this.getObject("pokemon-habitat", name, "PokemonHabitat");
    }

    @Override
    public PokemonShape getPokemonShape(int id) {
        return (PokemonShape) this.getObject("pokemon-shape", id, "PokemonShape");
    }

    @Override
    public PokemonShape getPokemonShape(String name) {
        return (PokemonShape) this.getObject("pokemon-shape", name, "PokemonShape");
    }

    @Override
    public PokemonSpecies getPokemonSpecies(int id) {
        return (PokemonSpecies) this.getObject("pokemon-species", id, "PokemonSpecies");
    }

    @Override
    public PokemonSpecies getPokemonSpecies(String name) {
        return (PokemonSpecies) this.getObject("pokemon-species", name, "PokemonSpecies");
    }

    @Override
    public Stat getStat(int id) {
        return (Stat) this.getObject("stat", id, "Stat");
    }

    @Override
    public Stat getStat(String name) {
        return (Stat) this.getObject("stat", name, "Stat");
    }

    @Override
    public Type getType(int id) {
        return (Type) this.getObject("type", id, "Type");
    }

    @Override
    public Type getType(String name) {
        return (Type) this.getObject("type", name, "Type");
    }

    @Override
    public Language getLanguage(int id) {
        return (Language) this.getObject("language", id, "Language");
    }

    @Override
    public Language getLanguage(String name) {
        return (Language) this.getObject("language", name, "Language");
    }

}
