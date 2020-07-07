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
            ConfiguredPlacement copper = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 12, 12, 70));
            ConfiguredPlacement silver = Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 12, 12, 70));
            ConfiguredPlacement cobalt = Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 255));
            ConfiguredPlacement mythril = Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 255));
            ConfiguredPlacement trueSilver = Placement.COUNT_RANGE.configure(new CountRangeConfig(6, 0, 0, 255));
            ConfiguredPlacement draconicSteel = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 255));
            // Copper Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.COPPER_ORE_BLOCK.get().getDefaultState(), 8)).withPlacement(copper));
            // Silver Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.SILVER_ORE_BLOCK.get().getDefaultState(), 8)).withPlacement(silver));
            // Cobalt Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                    RegistryHandler.COBALT_ORE_BLOCK.get().getDefaultState(), 4)).withPlacement(cobalt));
            // Mythril Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                    RegistryHandler.MYTHRIL_ORE_BLOCK.get().getDefaultState(), 4)).withPlacement(mythril));
            // True Silver Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                    RegistryHandler.TRUE_SILVER_ORE_BLOCK.get().getDefaultState(), 4)).withPlacement(trueSilver));
            // Draconic Steel Ore
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.byName("OBSIDIAN"),
                    RegistryHandler.DRACONIC_STEEL_ORE_BLOCK.get().getDefaultState(), 4)).withPlacement(draconicSteel));
        }
    }
}
