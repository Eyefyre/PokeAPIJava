# PokeAPIJava
 Java Wrapper for https://pokeapi.co/
 
 Maintained by [Eyefyre](https://github.com/Eyefyre)
 
## Example
 An example of how to info on a type
 ```
        PokeClient client = new PokeClient();
        Type fire = client.getType("fire");
 ```
A cache is used to speed up calls. Users are able to set the amount of time an object is stored in the cache
 ```
        PokeClient client = new PokeClient();
        client.changeCacheTimeAmount(60); //60 seconds
 ```
## Usable Methods
 Here are all the usable methods in this wrapper.
 ```
    void clearCache();
    long getCacheTime();
    void changeCacheTimeAmount(long seconds);
    NamedAPIResourceList getBerryList(int offset, int limit);
    NamedAPIResourceList getBerryFirmnessList(int offset, int limit);
    NamedAPIResourceList getBerryFlavorList(int offset, int limit);
    NamedAPIResourceList getContestTypeList(int offset, int limit);
    APIResourceList getContestEffectList(int offset, int limit);
    APIResourceList getSuperContestEffectList(int offset, int limit);
    NamedAPIResourceList getEncounterMethodList(int offset, int limit);
    NamedAPIResourceList getEncounterConditionList(int offset, int limit);
    NamedAPIResourceList getEncounterConditionValueList(int offset, int limit);
    APIResourceList getEvolutionChainList(int offset, int limit);
    NamedAPIResourceList getEvolutionTriggerList(int offset, int limit);
    NamedAPIResourceList getGenerationList(int offset, int limit);
    NamedAPIResourceList getPokedexList(int offset, int limit);
    NamedAPIResourceList getVersionList(int offset, int limit);
    NamedAPIResourceList getVersionGroupList(int offset, int limit);
    NamedAPIResourceList getItemList(int offset, int limit);
    NamedAPIResourceList getItemAttributeList(int offset, int limit);
    NamedAPIResourceList getItemCategoryList(int offset, int limit);
    NamedAPIResourceList getItemFlingEffectList(int offset, int limit);
    NamedAPIResourceList getItemPocketList(int offset, int limit);
    NamedAPIResourceList getLocationList(int offset, int limit);
    NamedAPIResourceList getLocationAreaList(int offset, int limit);
    NamedAPIResourceList getPalParkAreaList(int offset, int limit);
    NamedAPIResourceList getRegionList(int offset, int limit);
    APIResourceList getMachineList(int offset, int limit);
    NamedAPIResourceList getMoveList(int offset, int limit);
    NamedAPIResourceList getMoveAilmentList(int offset, int limit);
    NamedAPIResourceList getMoveBattleStyleList(int offset, int limit);
    NamedAPIResourceList getMoveCategoryList(int offset, int limit);
    NamedAPIResourceList getMoveDamageClassList(int offset, int limit);
    NamedAPIResourceList getMoveLearnMethodList(int offset, int limit);
    NamedAPIResourceList getMoveTargetList(int offset, int limit);
    NamedAPIResourceList getAbilityList(int offset, int limit);
    APIResourceList getCharacteristicList(int offset, int limit);
    NamedAPIResourceList getEggGroupList(int offset, int limit);
    NamedAPIResourceList getGenderList(int offset, int limit);
    NamedAPIResourceList getGrowthRateList(int offset, int limit);
    NamedAPIResourceList getNatureList(int offset, int limit);
    NamedAPIResourceList getPokeathlonStatList(int offset, int limit);
    NamedAPIResourceList getPokemonList(int offset, int limit);
    NamedAPIResourceList getPokemonColorList(int offset, int limit);
    NamedAPIResourceList getPokemonFormList(int offset, int limit);
    NamedAPIResourceList getPokemonHabitatList(int offset, int limit);
    NamedAPIResourceList getPokemonShapeList(int offset, int limit);
    NamedAPIResourceList getPokemonSpeciesList(int offset, int limit);
    NamedAPIResourceList getStatList(int offset, int limit);
    NamedAPIResourceList getTypeList(int offset, int limit);
    NamedAPIResourceList getLanguageList(int offset, int limit);
    Berry getBerry(int id);
    Berry getBerry(String name);
    BerryFirmness getBerryFirmness(int id);
    BerryFirmness getBerryFirmness(String name);
    BerryFlavor getBerryFlavor(int id);
    BerryFlavor getBerryFlavor(String name);
    ContestType getContestType(int id);
    ContestType getContestType(String name);
    ContestEffect getContestEffect(int id);
    SuperContestEffect getSuperContestEffect(int id);
    EncounterMethod getEncounterMethod(int id);
    EncounterMethod getEncounterMethod(String name);
    EncounterCondition getEncounterCondition(int id);
    EncounterCondition getEncounterCondition(String name);
    EncounterConditionValue getEncounterConditionValue(int id);
    EncounterConditionValue getEncounterConditionValue(String name);
    EvolutionChain getEvolutionChain(int id);
    EvolutionTrigger getEvolutionTrigger(int id);
    EvolutionTrigger getEvolutionTrigger(String name);
    Generation getGeneration(int id);
    Generation getGeneration(String name);
    Pokedex getPokedex(int id);
    Pokedex getPokedex(String name);
    Version getVersion(int id);
    Version getVersion(String name);
    VersionGroup getVersionGroup(int id);
    VersionGroup getVersionGroup(String name);
    Item getItem(int id);
    Item getItem(String name);
    ItemAttribute getItemAttribute(int id);
    ItemAttribute getItemAttribute(String name);
    ItemCategory getItemCategory(int id);
    ItemCategory getItemCategory(String name);
    ItemFlingEffect getItemFlingEffect(int id);
    ItemFlingEffect getItemFlingEffect(String name);
    ItemPocket getItemPocket(int id);
    ItemPocket getItemPocket(String name);
    Location getLocation(int id);
    Location getLocation(String name);
    LocationArea getLocationArea(int id);
    LocationArea getLocationArea(String name);
    PalParkArea getPalParkArea(int id);
    PalParkArea getPalParkArea(String name);
    Region getRegion(int id);
    Region getRegion(String name);
    Machine getMachine(int id);
    Move getMove(int id);
    Move getMove(String name);
    MoveAilment getMoveAilment(int id);
    MoveAilment getMoveAilment(String name);
    MoveBattleStyle getMoveBattleStyle(int id);
    MoveBattleStyle getMoveBattleStyle(String name);
    MoveCategory getMoveCategory(int id);
    MoveCategory getMoveCategory(String name);
    MoveDamageClass getMoveDamageClass(int id);
    MoveDamageClass getMoveDamageClass(String name);
    MoveLearnMethod getMoveLearnMethod(int id);
    MoveLearnMethod getMoveLearnMethod(String name);
    MoveTarget getMoveTarget(int id);
    MoveTarget getMoveTarget(String name);
    Ability getAbility(int id);
    Ability getAbility(String name);
    Characteristic getCharacteristic(int id);
    EggGroup getEggGroup(int id);
    EggGroup getEggGroup(String name);
    Gender getGender(int id);
    Gender getGender(String name);
    GrowthRate getGrowthRate(int id);
    GrowthRate getGrowthRate(String name);
    Nature getNature(int id);
    Nature getNature(String name);
    PokeathlonStat getPokeathlonStat(int id);
    PokeathlonStat getPokeathlonStat(String name);
    Pokemon getPokemon(int id);
    Pokemon getPokemon(String name);
    PokemonColor getPokemonColor(int id);
    PokemonColor getPokemonColor(String name); 
    PokemonForm getPokemonForm(int id);
    PokemonForm getPokemonForm(String name);
    PokemonHabitat getPokemonHabitat(int id);
    PokemonHabitat getPokemonHabitat(String name);
    PokemonShape getPokemonShape(int id);
    PokemonShape getPokemonShape(String name);
    PokemonSpecies getPokemonSpecies(int id);
    PokemonSpecies getPokemonSpecies(String name);
    Stat getStat(int id);
    Stat getStat(String name);
    Type getType(int id);
    Type getType(String name);
    Language getLanguage(int id);
    Language getLanguage(String name);

 ```
