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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class PokeClientTest {

    PokeClient instance = new PokeClient();
    int offset = 0;
    int limit = 2;
    int id = 1;

    /**
     * Test of changeCacheTimeAmount method, of class PokeClient.
     */
    @Test
    public void ChangeCacheTimeTest() {
        long seconds = 60L;
        instance = new PokeClient();
        instance.changeCacheTimeAmount(seconds);
    }

    /**
     * Test of getBerryList method, of class PokeClient.
     */
    @Test
    public void GetBerryListTest() {
        String expResult = "cheri";
        NamedAPIResourceList object = instance.getBerryList(offset, limit);
        assertEquals(expResult, object.getResults().get(0).getName());
    }

    /**
     * Test of getBerryFirmnessList method, of class PokeClient.
     */
    @Test
    public void GetBerryFirmnessListTest() {
        String expResult = "very-soft";
        NamedAPIResourceList object = instance.getBerryFirmnessList(offset, limit);
        assertEquals(expResult, object.getResults().get(0).getName());
    }

    /**
     * Test of getBerryFlavorList method, of class PokeClient.
     */
    @Test
    public void GetBerryFlavorListTest() {
        String expResult = "spicy";
        NamedAPIResourceList object = instance.getBerryFlavorList(offset, limit);
        assertEquals(expResult, object.getResults().get(0).getName());
    }

    /**
     * Test of getContestTypeList method, of class PokeClient.
     */
    @Test
    public void GetContestTypeListTest() {
        String expResult = "cool";
        NamedAPIResourceList object = instance.getContestTypeList(offset, limit);
        assertEquals(expResult, object.getResults().get(0).getName());
    }

    /**
     * Test of getContestEffectList method, of class PokeClient.
     */
    @Test
    public void GetContestEffectListTest() {
        String expResult = "https://pokeapi.co/api/v2/contest-effect/1/";
        APIResourceList object = instance.getContestEffectList(offset, limit);
        assertEquals(expResult, object.getResults().get(0).getURL());
    }

    /**
     * Test of getSuperContestEffectList method, of class PokeClient.
     */
    @Test
    public void GetSuperContestEffectListTest() {
        String expResult = "https://pokeapi.co/api/v2/super-contest-effect/1/";
        APIResourceList result = instance.getSuperContestEffectList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getURL());
    }

    /**
     * Test of getEncounterMethodList method, of class PokeClient.
     */
    @Test
    public void GetEncounterMethodListTest() {
        String expResult = "walk";
        NamedAPIResourceList result = instance.getEncounterMethodList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getEncounterConditionList method, of class PokeClient.
     */
    @Test
    public void GetEncounterConditionListTest() {
        String expResult = "swarm";
        NamedAPIResourceList result = instance.getEncounterConditionList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getEncounterConditionValueList method, of class PokeClient.
     */
    @Test
    public void GetEncounterConditionValueListTest() {
        String expResult = "swarm-yes";
        NamedAPIResourceList result = instance.getEncounterConditionValueList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getEvolutionChainList method, of class PokeClient.
     */
    @Test
    public void GetEvolutionChainListTest() {
        String expResult = "https://pokeapi.co/api/v2/evolution-chain/1/";
        APIResourceList result = instance.getEvolutionChainList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getURL());
    }

    /**
     * Test of getEvolutionTriggerList method, of class PokeClient.
     */
    @Test
    public void GetEvolutionTriggerListTest() {
        String expResult = "level-up";
        NamedAPIResourceList result = instance.getEvolutionTriggerList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getGenerationList method, of class PokeClient.
     */
    @Test
    public void GetGenerationListTest() {
        String expResult = "generation-i";
        NamedAPIResourceList result = instance.getGenerationList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokedexList method, of class PokeClient.
     */
    @Test
    public void GetPokedexListTest() {
        String expResult = "national";
        NamedAPIResourceList result = instance.getPokedexList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getVersionList method, of class PokeClient.
     */
    @Test
    public void GetVersionListTest() {
        String expResult = "red";
        NamedAPIResourceList result = instance.getVersionList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getVersionGroupList method, of class PokeClient.
     */
    @Test
    public void GetVersionGroupListTest() {
        String expResult = "red-blue";
        NamedAPIResourceList result = instance.getVersionGroupList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getItemList method, of class PokeClient.
     */
    @Test
    public void GetItemListTest() {
        String expResult = "master-ball";
        NamedAPIResourceList result = instance.getItemList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getItemAttributeList method, of class PokeClient.
     */
    @Test
    public void GetItemAttributeListTest() {
        String expResult = "countable";
        NamedAPIResourceList result = instance.getItemAttributeList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getItemCategoryList method, of class PokeClient.
     */
    @Test
    public void GetItemCategoryListTest() {
        String expResult = "stat-boosts";
        NamedAPIResourceList result = instance.getItemCategoryList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getItemFlingEffectList method, of class PokeClient.
     */
    @Test
    public void GetItemFlingEffectListTest() {
        String expResult = "badly-poison";
        NamedAPIResourceList result = instance.getItemFlingEffectList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getItemPocketList method, of class PokeClient.
     */
    @Test
    public void GetItemPocketListTest() {
        String expResult = "misc";
        NamedAPIResourceList result = instance.getItemPocketList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getLocationList method, of class PokeClient.
     */
    @Test
    public void GetLocationListTest() {
        String expResult = "canalave-city";
        NamedAPIResourceList result = instance.getLocationList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getLocationAreaList method, of class PokeClient.
     */
    @Test
    public void GetLocationAreaListTest() {
        String expResult = "canalave-city-area";
        NamedAPIResourceList result = instance.getLocationAreaList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPalParkAreaList method, of class PokeClient.
     */
    @Test
    public void GetPalParkAreaListTest() {
        String expResult = "forest";
        NamedAPIResourceList result = instance.getPalParkAreaList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getRegionList method, of class PokeClient.
     */
    @Test
    public void GetRegionListTest() {
        String expResult = "kanto";
        NamedAPIResourceList result = instance.getRegionList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getMachineList method, of class PokeClient.
     */
    @Test
    public void GetMachineListTest() {
        String expResult = "https://pokeapi.co/api/v2/machine/1/";
        APIResourceList result = instance.getMachineList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getURL());
    }

    /**
     * Test of getMoveList method, of class PokeClient.
     */
    @Test
    public void GetMoveListTest() {
        String expResult = "pound";
        NamedAPIResourceList result = instance.getMoveList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getMoveAilmentList method, of class PokeClient.
     */
    @Test
    public void GetMoveAilmentListTest() {
        String expResult = "unknown";
        NamedAPIResourceList result = instance.getMoveAilmentList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getMoveBattleStyleList method, of class PokeClient.
     */
    @Test
    public void GetMoveBattleStyleListTest() {
        String expResult = "attack";
        NamedAPIResourceList result = instance.getMoveBattleStyleList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getMoveCategoryList method, of class PokeClient.
     */
    @Test
    public void GetMoveCategoryListTest() {
        String expResult = "damage";
        NamedAPIResourceList result = instance.getMoveCategoryList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getMoveDamageClassList method, of class PokeClient.
     */
    @Test
    public void GetMoveDamageClassListTest() {
        String expResult = "status";
        NamedAPIResourceList result = instance.getMoveDamageClassList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getMoveLearnMethodList method, of class PokeClient.
     */
    @Test
    public void GetMoveLearnMethodListTest() {
        String expResult = "level-up";
        NamedAPIResourceList result = instance.getMoveLearnMethodList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getMoveTargetList method, of class PokeClient.
     */
    @Test
    public void GetMoveTargetListTest() {
        String expResult = "specific-move";
        NamedAPIResourceList result = instance.getMoveTargetList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getAbilityList method, of class PokeClient.
     */
    @Test
    public void GetAbilityListTest() {
        String expResult = "stench";
        NamedAPIResourceList result = instance.getAbilityList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getCharacteristicList method, of class PokeClient.
     */
    @Test
    public void GetCharacteristicListTest() {
        String expResult = "https://pokeapi.co/api/v2/characteristic/1/";
        APIResourceList result = instance.getCharacteristicList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getURL());
    }

    /**
     * Test of getEggGroupList method, of class PokeClient.
     */
    @Test
    public void GetEggGroupListTest() {
        String expResult = "monster";
        NamedAPIResourceList result = instance.getEggGroupList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getGenderList method, of class PokeClient.
     */
    @Test
    public void GetGenderListTest() {
        String expResult = "female";
        NamedAPIResourceList result = instance.getGenderList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getGrowthRateList method, of class PokeClient.
     */
    @Test
    public void GetGrowthRateListTest() {
        String expResult = "slow";
        NamedAPIResourceList result = instance.getGrowthRateList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getNatureList method, of class PokeClient.
     */
    @Test
    public void GetNatureListTest() {
        String expResult = "hardy";
        NamedAPIResourceList result = instance.getNatureList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokeathlonStatList method, of class PokeClient.
     */
    @Test
    public void GetPokeathlonStatListTest() {
        String expResult = "speed";
        NamedAPIResourceList result = instance.getPokeathlonStatList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokemonList method, of class PokeClient.
     */
    @Test
    public void GetPokemonListTest() {
        String expResult = "bulbasaur";
        NamedAPIResourceList result = instance.getPokemonList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokemonColorList method, of class PokeClient.
     */
    @Test
    public void GetPokemonColorListTest() {
        String expResult = "black";
        NamedAPIResourceList result = instance.getPokemonColorList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokemonFormList method, of class PokeClient.
     */
    @Test
    public void GetPokemonFormListTest() {
        String expResult = "bulbasaur";
        NamedAPIResourceList result = instance.getPokemonFormList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokemonHabitatList method, of class PokeClient.
     */
    @Test
    public void GetPokemonHabitatListTest() {
        String expResult = "cave";
        NamedAPIResourceList result = instance.getPokemonHabitatList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokemonShapeList method, of class PokeClient.
     */
    @Test
    public void GetPokemonShapeListTest() {
        String expResult = "ball";
        NamedAPIResourceList result = instance.getPokemonShapeList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getPokemonSpeciesList method, of class PokeClient.
     */
    @Test
    public void GetPokemonSpeciesListTest() {
        String expResult = "bulbasaur";
        NamedAPIResourceList result = instance.getPokemonSpeciesList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getStatList method, of class PokeClient.
     */
    @Test
    public void GetStatListTest() {
        String expResult = "hp";
        NamedAPIResourceList result = instance.getStatList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getTypeList method, of class PokeClient.
     */
    @Test
    public void GetTypeListTest() {
        String expResult = "normal";
        NamedAPIResourceList result = instance.getTypeList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }

    /**
     * Test of getLanguageList method, of class PokeClient.
     */
    @Test
    public void GetLanguageListTest() {
        String expResult = "ja-Hrkt";
        NamedAPIResourceList result = instance.getLanguageList(offset, limit);
        assertEquals(expResult, result.getResults().get(0).getName());
    }
    /**
     * Test of getBerry method, of class PokeClient.
     */
    @Test
    public void GetBerryTest() {
        String name = "cheri";
        Berry resultInt = instance.getBerry(id);
        Berry resultString = instance.getBerry(name);
        String expResult = "fire";
        assertEquals(expResult, resultInt.getNaturalGiftType().getName());
        assertEquals(expResult, resultString.getNaturalGiftType().getName());
    }

    /**
     * Test of getBerryFirmness method, of class PokeClient.
     */
    @Test
    public void GetBerryFirmnessTest() {
        String name = "very-soft";
        BerryFirmness resultInt = instance.getBerryFirmness(id);
        BerryFirmness resultString = instance.getBerryFirmness(name);
        String expResult = "Very Soft";
        assertEquals(expResult, resultInt.getNames().get(1).getName());
        assertEquals(expResult, resultString.getNames().get(1).getName());
    }

    /**
     * Test of getBerryFlavor method, of class PokeClient.
     */
    @Test
    public void GetBerryFlavorTest() {
        String name = "spicy";
        BerryFlavor resultInt = instance.getBerryFlavor(id);
        BerryFlavor resultString = instance.getBerryFlavor(name);
        String expResult = "cool";
        assertEquals(expResult, resultInt.getContestType().getName());
        assertEquals(expResult, resultString.getContestType().getName());
    }
    /**
     * Test of getContestType method, of class PokeClient.
     */
    @Test
    public void GetContestTypeTest() {
        String name = "cool";
        ContestType resultInt = instance.getContestType(id);
        ContestType resultString = instance.getContestType(name);
        String expResult = "Red";
        assertEquals(expResult, resultInt.getNames().get(0).getColor());
        assertEquals(expResult, resultString.getNames().get(0).getColor());
    }
    /**
     * Test of getContestEffect method, of class PokeClient.
     */
    @Test
    public void GetContestEffectTest() {
        ContestEffect resultInt = instance.getContestEffect(id);
        int expResult = 0;
        assertEquals(expResult, resultInt.getJam());
    }

    /**
     * Test of getSuperContestEffect method, of class PokeClient.
     */
    @Test
    public void GetSuperContestEffectTest() {
        SuperContestEffect resultInt = instance.getSuperContestEffect(id);
        String expResult = "agility";
        assertEquals(expResult, resultInt.getMoves().get(0).getName());
    }

    /**
     * Test of getEncounterMethod method, of class PokeClient.
     */
    @Test
    public void GetEncounterMethodTest() {
        String name = "walk";
        EncounterMethod resultInt = instance.getEncounterMethod(id);
        EncounterMethod resultString = instance.getEncounterMethod(name);
        int expResult = 1;
        assertEquals(expResult, resultInt.getOrder());
        assertEquals(expResult, resultString.getOrder());
    }
    /**
     * Test of getEncounterCondition method, of class PokeClient.
     */
    @Test
    public void GetEncounterConditionTest() {
        String name = "swarm";
        EncounterCondition resultInt = instance.getEncounterCondition(id);
        EncounterCondition resultString = instance.getEncounterCondition(name);
        String expResult = "swarm-yes";
        assertEquals(expResult, resultInt.getValues().get(0).getName());
        assertEquals(expResult, resultString.getValues().get(0).getName());
    }
    /**
     * Test of getEncounterConditionValue method, of class PokeClient.
     */
    @Test
    public void GetEncounterConditionValueTest() {
        String name = "swarm-yes";
        EncounterConditionValue resultInt = instance.getEncounterConditionValue(id);
        EncounterConditionValue resultString = instance.getEncounterConditionValue(name);
        String expResult = "swarm";
        assertEquals(expResult, resultInt.getCondition().getName());
        assertEquals(expResult, resultString.getCondition().getName());
    }

    /**
     * Test of getEvolutionChain method, of class PokeClient.
     */
    @Test
    public void GetEvolutionChainTest() {
        EvolutionChain resultInt = instance.getEvolutionChain(id);
        boolean expResult = false;
        assertEquals(expResult, resultInt.getChain().isBaby());
    }

    /**
     * Test of getEvolutionTrigger method, of class PokeClient.
     */
    @Test
    public void GetEvolutionTriggerTest() {
        String name = "level-up";
        EvolutionTrigger resultInt = instance.getEvolutionTrigger(id);
        EvolutionTrigger resultString = instance.getEvolutionTrigger(name);
        String expResult = "ivysaur";
        assertEquals(expResult, resultInt.getPokemonSpecies().get(0).getName());
        assertEquals(expResult, resultString.getPokemonSpecies().get(0).getName());
    }

    /**
     * Test of getGeneration method, of class PokeClient.
     */
    @Test
    public void GetGenerationTests() {
        String name = "generation-i";
        Generation resultInt = instance.getGeneration(id);
        Generation resultString = instance.getGeneration(name);
        String expResult = "kanto";
        assertEquals(expResult, resultInt.getMainRegion().getName());
        assertEquals(expResult, resultString.getMainRegion().getName());
    }

    /**
     * Test of getPokedex method, of class PokeClient.
     */
    @Test
    public void GetPokedexTest() {
        String name = "national";
        Pokedex resultInt = instance.getPokedex(id);
        Pokedex resultString = instance.getPokedex(name);
        String expResult = "Entire National dex";
        assertEquals(expResult, resultInt.getDescriptions().get(0).getDescription());
        assertEquals(expResult, resultString.getDescriptions().get(0).getDescription());
    }

    /**
     * Test of getVersion method, of class PokeClient.
     */
    @Test
    public void GetVersionTest() {
        String name = "red";
        Version resultInt = instance.getVersion(id);
        Version resultString = instance.getVersion(name);
        String expResult = "red-blue";
        assertEquals(expResult, resultInt.getVersionGroup().getName());
        assertEquals(expResult, resultString.getVersionGroup().getName());
    }

    /**
     * Test of getVersionGroup method, of class PokeClient.
     */
    @Test
    public void GetVersionGroupTest() {
        String name = "red-blue";
        VersionGroup resultInt = instance.getVersionGroup(id);
        VersionGroup resultString = instance.getVersionGroup(name);
        String expResult = "kanto";
        assertEquals(expResult, resultInt.getRegions().get(0).getName());
        assertEquals(expResult, resultString.getRegions().get(0).getName());
    }

    /**
     * Test of getItem method, of class PokeClient.
     */
    @Test
    public void GetItemTest() {
        String name = "master-ball";
        Item resultInt = instance.getItem(id);
        Item resultString = instance.getItem(name);
        int expResult = 0;
        assertEquals(expResult, resultInt.getCost());
        assertEquals(expResult, resultString.getCost());
    }

    /**
     * Test of getItemAttribute method, of class PokeClient.
     */
    @Test
    public void GetItemAttributeTest() {
        String name = "countable";
        ItemAttribute resultInt = instance.getItemAttribute(id);
        ItemAttribute resultString = instance.getItemAttribute(name);
        String expResult = "master-ball";
        assertEquals(expResult, resultInt.getItems().get(0).getName());
        assertEquals(expResult, resultString.getItems().get(0).getName());
    }

    /**
     * Test of getItemCategory method, of class PokeClient.
     */
    @Test
    public void GetItemCategoryTest() {
        String name = "stat-boosts";
        ItemCategory resultInt = instance.getItemCategory(id);
        ItemCategory resultString = instance.getItemCategory(name);
        String expResult = "guard-spec";
        assertEquals(expResult, resultInt.getItems().get(0).getName());
        assertEquals(expResult, resultString.getItems().get(0).getName());
    }

    /**
     * Test of getItemFlingEffect method, of class PokeClient.
     */
    @Test
    public void GetItemFlingEffectTest() {
        String name = "badly-poison";
        ItemFlingEffect resultInt = instance.getItemFlingEffect(id);
        ItemFlingEffect resultString = instance.getItemFlingEffect(name);
        String expResult = "toxic-orb";
        assertEquals(expResult, resultInt.getItems().get(0).getName());
        assertEquals(expResult, resultString.getItems().get(0).getName());
    }

    /**
     * Test of getItemPocket method, of class PokeClient.
     */
    @Test
    public void GetItemPocketTest() {
        String name = "misc";
        ItemPocket resultInt = instance.getItemPocket(id);
        ItemPocket resultString = instance.getItemPocket(name);
        String expResult = "collectibles";
        assertEquals(expResult, resultInt.getCategories().get(0).getName());
        assertEquals(expResult, resultString.getCategories().get(0).getName());
    }

    /**
     * Test of getLocation method, of class PokeClient.
     */
    @Test
    public void GetLocationTest() {
        String name = "canalave-city";
        Location resultInt = instance.getLocation(id);
        Location resultString = instance.getLocation(name);
        String expResult = "sinnoh";
        assertEquals(expResult, resultInt.getRegion().getName());
        assertEquals(expResult, resultString.getRegion().getName());
    }

    /**
     * Test of getLocationArea method, of class PokeClient.
     */
    @Test
    public void GetLocationAreaTest() {
        String name = "canalave-city-area";
        LocationArea resultInt = instance.getLocationArea(id);
        LocationArea resultString = instance.getLocationArea(name);
        int expResult = 1;
        assertEquals(expResult, resultInt.getGameIndex());
        assertEquals(expResult, resultString.getGameIndex());
    }

    /**
     * Test of getPalParkArea method, of class PokeClient.
     */
    @Test
    public void GetPalParkAreaTest() {
        String name = "forest";
        PalParkArea resultInt = instance.getPalParkArea(id);
        PalParkArea resultString = instance.getPalParkArea(name);
        int expResult = 50;
        assertEquals(expResult, resultInt.getPokemonEncounters().get(0).getRate());
        assertEquals(expResult, resultString.getPokemonEncounters().get(0).getRate());
    }

    /**
     * Test of getRegion method, of class PokeClient.
     */
    @Test
    public void GetRegionTest() {
        String name = "kanto";
        Region resultInt = instance.getRegion(id);
        Region resultString = instance.getRegion(name);
        String expResult = "celadon-city";
        assertEquals(expResult, resultInt.getLocations().get(0).getName());
        assertEquals(expResult, resultString.getLocations().get(0).getName());
    }
//

    /**
     * Test of getMachine method, of class PokeClient.
     */
    @Test
    public void GetMachineTest() {
        Machine resultInt = instance.getMachine(id);
        String expResult = "tm01";
        assertEquals(expResult, resultInt.getItem().getName());
    }

    /**
     * Test of getMove method, of class PokeClient.
     */
    @Test
    public void GetMoveTest() {
        String name = "pound";
        Move resultInt = instance.getMove(id);
        Move resultString = instance.getMove(name);
        String expResult = "generation-i";
        assertEquals(expResult, resultInt.getGeneration().getName());
        assertEquals(expResult, resultString.getGeneration().getName());
    }
    /**
     * Test of getMoveAilment method, of class PokeClient.
     */
    @Test
    public void GetMoveAilmentTest() {
        String name = "paralysis";
        MoveAilment resultInt = instance.getMoveAilment(id);
        MoveAilment resultString = instance.getMoveAilment(name);
        String expResult = "thunder-punch";
        assertEquals(expResult, resultInt.getMoves().get(0).getName());
        assertEquals(expResult, resultString.getMoves().get(0).getName());
    }

    /**
     * Test of getMoveBattleStyle method, of class PokeClient.
     */
    @Test
    public void GetMoveBattleStyleTest() {
        String name = "attack";
        MoveBattleStyle resultInt = instance.getMoveBattleStyle(id);
        MoveBattleStyle resultString = instance.getMoveBattleStyle(name);
        String expResult = "Attack";
        assertEquals(expResult, resultInt.getNames().get(1).getName());
        assertEquals(expResult, resultString.getNames().get(1).getName());
    }

    /**
     * Test of getMoveCategory method, of class PokeClient.
     */
    @Test
    public void GetMoveCategoryTest() {
        String name = "ailment";
        MoveCategory resultInt = instance.getMoveCategory(id);
        MoveCategory resultString = instance.getMoveCategory(name);
        String expResult = "sing";
        assertEquals(expResult, resultInt.getMoves().get(0).getName());
        assertEquals(expResult, resultString.getMoves().get(0).getName());
    }

    /**
     * Test of getMoveDamageClass method, of class PokeClient.
     */
    @Test
    public void GetMoveDamageClassTest() {
        String name = "status";
        MoveDamageClass resultInt = instance.getMoveDamageClass(id);
        MoveDamageClass resultString = instance.getMoveDamageClass(name);
        String expResult = "swords-dance";
        assertEquals(expResult, resultInt.getMoves().get(0).getName());
        assertEquals(expResult, resultString.getMoves().get(0).getName());
    }

    /**
     * Test of getMoveLearnMethod method, of class PokeClient.
     */
    @Test
    public void GetMoveLearnMethodTest() {
        String name = "status";
        MoveDamageClass resultInt = instance.getMoveDamageClass(id);
        MoveDamageClass resultString = instance.getMoveDamageClass(name);
        String expResult = "swords-dance";
        assertEquals(expResult, resultInt.getMoves().get(0).getName());
        assertEquals(expResult, resultString.getMoves().get(0).getName());
    }

    /**
     * Test of getMoveTarget method, of class PokeClient.
     */
    @Test
    public void GetMoveTargetTest() {
        String name = "specific-move";
        MoveTarget resultInt = instance.getMoveTarget(id);
        MoveTarget resultString = instance.getMoveTarget(name);
        String expResult = "counter";
        assertEquals(expResult, resultInt.getMoves().get(0).getName());
        assertEquals(expResult, resultString.getMoves().get(0).getName());
    }

    /**
     * Test of getAbility method, of class PokeClient.
     */
    @Test
    public void GetAbilityTest() {
        String name = "stench";
        Ability resultInt = instance.getAbility(id);
        Ability resultString = instance.getAbility(name);
        String expResult = "generation-iii";
        assertEquals(expResult, resultInt.getGeneration().getName());
        assertEquals(expResult, resultString.getGeneration().getName());
    }

    /**
     * Test of getCharacteristic method, of class PokeClient.
     */
    @Test
    public void GetCharacteristicTest() {
        Characteristic resultInt = instance.getCharacteristic(id);
        String expResult = "hp";
        assertEquals(expResult, resultInt.getHighestStat().getName());
    }

    /**
     * Test of getEggGroup method, of class PokeClient.
     */
    @Test
    public void GetEggGroupTest() {
        String name = "monster";
        EggGroup resultInt = instance.getEggGroup(id);
        EggGroup resultString = instance.getEggGroup(name);
        String expResult = "bulbasaur";
        assertEquals(expResult, resultInt.getPokemonSpecies().get(0).getName());
        assertEquals(expResult, resultString.getPokemonSpecies().get(0).getName());
    }

    /**
     * Test of getGender method, of class PokeClient.
     */
    @Test
    public void GetGenderTest() {
        String name = "female";
        Gender resultInt = instance.getGender(id);
        Gender resultString = instance.getGender(name);
        String expResult = "wormadam";
        assertEquals(expResult, resultInt.getRequiredForEvolution().get(0).getName());
        assertEquals(expResult, resultString.getRequiredForEvolution().get(0).getName());
    }

    /**
     * Test of getGrowthRate method, of class PokeClient.
     */
    @Test
    public void GetGrowthRateTest() {
        String name = "slow";
        GrowthRate resultInt = instance.getGrowthRate(id);
        GrowthRate resultString = instance.getGrowthRate(name);
        String expResult = "growlithe";
        assertEquals(expResult, resultInt.getPokemonSpecies().get(0).getName());
        assertEquals(expResult, resultString.getPokemonSpecies().get(0).getName());
    }

    /**
     * Test of getNature method, of class PokeClient.
     */
    @Test
    public void GetNatureTest() {
        String name = "hardy";
        Nature resultInt = instance.getNature(id);
        Nature resultString = instance.getNature(name);
        int expResult = -1;
        assertEquals(expResult, resultInt.getPokeathlonStatChanges().get(0).getMaxChange());
        assertEquals(expResult, resultString.getPokeathlonStatChanges().get(0).getMaxChange());
    }

    /**
     * Test of getPokeathlonStat method, of class PokeClient.
     */
    @Test
    public void GetPokeathlonStatTest() {
        String name = "speed";
        PokeathlonStat resultInt = instance.getPokeathlonStat(id);
        PokeathlonStat resultString = instance.getPokeathlonStat(name);
        String expResult = "Speed";
        assertEquals(expResult, resultInt.getNames().get(1).getName());
        assertEquals(expResult, resultString.getNames().get(1).getName());
    }

    /**
     * Test of getPokemon method, of class PokeClient.
     */
    @Test
    public void GetPokemonTest() {
        String name = "bulbasaur";
        Pokemon resultInt = instance.getPokemon(id);
        Pokemon resultString = instance.getPokemon(name);
        int expResult = 69;
        assertEquals(expResult, resultInt.getWeight());
        assertEquals(expResult, resultString.getWeight());
    }

    /**
     * Test of getPokemonColor method, of class PokeClient.
     */
    @Test
    public void GetPokemonColorTest() {
        String name = "black";
        PokemonColor resultInt = instance.getPokemonColor(id);
        PokemonColor resultString = instance.getPokemonColor(name);
        String expResult = "snorlax";
        assertEquals(expResult, resultInt.getPokemonSpecies().get(0).getName());
        assertEquals(expResult, resultString.getPokemonSpecies().get(0).getName());
    }

    /**
     * Test of getPokemonForm method, of class PokeClient.
     */
    @Test
    public void GetPokemonFormTest() {
        String name = "bulbasaur";
        PokemonForm resultInt = instance.getPokemonForm(id);
        PokemonForm resultString = instance.getPokemonForm(name);
        String expResult = "red-blue";
        assertEquals(expResult, resultInt.getVersionGroup().getName());
        assertEquals(expResult, resultString.getVersionGroup().getName());
    }

    /**
     * Test of getPokemonHabitat method, of class PokeClient.
     */
    @Test
    public void GetPokemonHabitatTest() {
        String name = "cave";
        PokemonHabitat resultInt = instance.getPokemonHabitat(id);
        PokemonHabitat resultString = instance.getPokemonHabitat(name);
        String expResult = "zubat";
        assertEquals(expResult, resultInt.getPokemonSpecies().get(0).getName());
        assertEquals(expResult, resultString.getPokemonSpecies().get(0).getName());
    }

    /**
     * Test of getPokemonShape method, of class PokeClient.
     */
    @Test
    public void GetPokemonShapeTest() {
        String name = "ball";
        PokemonShape resultInt = instance.getPokemonShape(id);
        PokemonShape resultString = instance.getPokemonShape(name);
        String expResult = "shellder";
        assertEquals(expResult, resultInt.getPokemonSpecies().get(0).getName());
        assertEquals(expResult, resultString.getPokemonSpecies().get(0).getName());
    }

    /**
     * Test of getPokemonSpecies method, of class PokeClient.
     */
    @Test
    public void GetPokemonSpeciesTest() {
        String name = "bulbasaur";
        PokemonSpecies resultInt = instance.getPokemonSpecies(id);
        PokemonSpecies resultString = instance.getPokemonSpecies(name);
        String expResult = "green";
        assertEquals(expResult, resultInt.getColor().getName());
        assertEquals(expResult, resultString.getColor().getName());
    }

    /**
     * Test of getStat method, of class PokeClient.
     */
    @Test
    public void GetStatTest() {
        String name = "hp";
        Stat resultInt = instance.getStat(id);
        Stat resultString = instance.getStat(name);
        String expResult = "https://pokeapi.co/api/v2/characteristic/1/";
        assertEquals(expResult, resultInt.getCharacteristics().get(0).getURL());
        assertEquals(expResult, resultString.getCharacteristics().get(0).getURL());
    }

    /**
     * Test of getType method, of class PokeClient.
     */
    @Test
    public void GetTypeTest() {
        String name = "normal";
        Type resultInt = instance.getType(id);
        Type resultString = instance.getType(name);
        String expResult = "pound";
        assertEquals(expResult, resultInt.getMoves().get(0).getName());
        assertEquals(expResult, resultString.getMoves().get(0).getName());
    }

    /**
     * Test of getLanguage method, of class PokeClient.
     */
    @Test
    public void GetLanguageTest() {
        String name = "ja-Hrkt";
        Language resultInt = instance.getLanguage(id);
        Language resultString = instance.getLanguage(name);
        String expResult = "jp";
        assertEquals(expResult, resultInt.getISO3166());
        assertEquals(expResult, resultString.getISO3166());
    }
}
