package com.nylanomel.progressionexpansion.worldgen;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig{
    public static ForgeConfigSpec.IntValue ore_gen_chance;
    public static ForgeConfigSpec.BooleanValue generate_overworld;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client){
        server.comment("Oregen Config");

        ore_gen_chance = server.comment("Maximum number of ore veins of the ore that can spawn in one chunk.").defineInRange("oregen.ore_gen_chance", 20, 1, 100000);

        generate_overworld = server.comment("Decide if you want Progression Expansion ores to spawn in the overworld").define("oregen.generate_overworld", true);
    }
}