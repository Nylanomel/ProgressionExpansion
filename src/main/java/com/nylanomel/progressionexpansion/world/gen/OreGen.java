package com.nylanomel.progressionexpansion.world.gen;

import com.nylanomel.progressionexpansion.util.RegistryHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
    public static void generateOre() {
        for(Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 12, 12, 70));
            // Copper Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.COPPER_ORE_BLOCK.get().getDefaultState(), 8)).withPlacement(customConfig));
            // Silver Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.SILVER_ORE_BLOCK.get().getDefaultState(), 8)).withPlacement(customConfig));
        }
    }
}
