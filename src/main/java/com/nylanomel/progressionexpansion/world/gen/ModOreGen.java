package com.nylanomel.progressionexpansion.world.gen;

import com.nylanomel.progressionexpansion.ProgressionExpansion;
import com.nylanomel.progressionexpansion.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ProgressionExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {

    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE",
            "end_stone", new BlockMatcher(Blocks.END_STONE));

    public static OreFeatureConfig.FillerBlockType OBSIDIAN = OreFeatureConfig.FillerBlockType.create("OBSIDIAN",
            "obsidian", new BlockMatcher(Blocks.OBSIDIAN));

    public static OreFeatureConfig.FillerBlockType PURPUR = OreFeatureConfig.FillerBlockType.create("PURPUR_BLOCK",
            "purpur_block", new BlockMatcher(Blocks.PURPUR_BLOCK));

    public static OreFeatureConfig.FillerBlockType NETHERRACK = OreFeatureConfig.FillerBlockType.create("NETHERRACK",
            "nettherrack", new BlockMatcher(Blocks.NETHERRACK));

    public static OreFeatureConfig.FillerBlockType STONE = OreFeatureConfig.FillerBlockType.create("STONE",
            "stone", new BlockMatcher(Blocks.STONE));

    ConfiguredPlacement copper = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 12, 12, 70));
    ConfiguredPlacement silver = Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 12, 12, 70));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent e){
        for (Biome biome : ForgeRegistries.BIOMES){
            if(biome.getCategory() == Biome.Category.NETHER){ // NETHER ORE GENERATION
                genOre(biome, 4, 0, 0, 255, NETHERRACK, RegistryHandler.COBALT_ORE_BLOCK.get().getDefaultState(), 6);
                genOre(biome, 3, 0, 0, 255, NETHERRACK, RegistryHandler.MYTHRIL_ORE_BLOCK.get().getDefaultState(), 4);
                genOre(biome, 2, 0, 0, 255, NETHERRACK, RegistryHandler.TRUE_SILVER_ORE_BLOCK.get().getDefaultState(), 6);
            } else if(biome.getCategory() == Biome.Category.THEEND){ // END ORE GENERATION
                genOre(biome, 1000, 0, 0, 255, OBSIDIAN, RegistryHandler.DRACONIC_STEEL_ORE_BLOCK.get().getDefaultState(), 30);
                genOre(biome, 4, 0, 0, 255, END_STONE, RegistryHandler.ENDRIL_ORE_BLOCK.get().getDefaultState(), 4);
                genOre(biome, 3, 0, 0, 255, END_STONE, RegistryHandler.CHARGED_END_STONE_BLOCK.get().getDefaultState(), 4);
                genOre(biome, 1, 0, 0, 255, END_STONE, RegistryHandler.FRACTURED_PURPUR_BLOCK.get().getDefaultState(), 20);
            } else { // OVERWORLD ORE GENERATION
                genOre(biome, 10, 12, 12, 70, STONE, RegistryHandler.COPPER_ORE_BLOCK.get().getDefaultState(), 6);
                genOre(biome, 9, 12, 12, 70, STONE, RegistryHandler.SILVER_ORE_BLOCK.get().getDefaultState(), 6);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size){
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }

}
