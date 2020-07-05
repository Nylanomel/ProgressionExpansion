package com.nylanomel.progressionexpansion.worldgen;

import com.nylanomel.progressionexpansion.blocks.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration{
    public static void setupOreGeneration(){
        if(OreGenConfig.generate_overworld.get()){
            if(OreGenConfig.generate_overworld.get()){
                for (Biome biome : ForgeRegistries.BIOMES){
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new ConfiguredFeature<OreFeatureConfig, Feature>(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.copper_ore_block.getDefaultState(), OreGenConfig.ore_gen_chance.get())));
                }
            }
        }
    }
}