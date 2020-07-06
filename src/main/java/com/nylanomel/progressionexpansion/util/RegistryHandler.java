package com.nylanomel.progressionexpansion.util;

import com.nylanomel.progressionexpansion.ProgressionExpansion;
import com.nylanomel.progressionexpansion.blocks.*;
import com.nylanomel.progressionexpansion.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ProgressionExpansion.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ProgressionExpansion.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Items
    public static final RegistryObject<Item> COPPER_BAR = ITEMS.register("copper_bar", ItemBase::new);
    public static final RegistryObject<Item> STEEL_BAR = ITEMS.register("steel_bar", ItemBase::new);
    public static final RegistryObject<Item> COBALT_BAR = ITEMS.register("cobalt_bar", ItemBase::new);
    public static final RegistryObject<Item> MYTHRIL_BAR = ITEMS.register("mythril_bar", ItemBase::new);
    public static final RegistryObject<Item> TRUE_SILVER_BAR = ITEMS.register("true_silver_bar", ItemBase::new);
    // Blocks
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore", CopperOreBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> COBALT_ORE_BLOCK = BLOCKS.register("cobalt_ore", CobaltOreBlock::new);
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", CobaltBlock::new);
    public static final RegistryObject<Block> MYTHRIL_ORE_BLOCK = BLOCKS.register("mythril_ore", MythrilOreBlock::new);
    public static final RegistryObject<Block> MYTHRIL_BLOCK = BLOCKS.register("mythril_block", MythrilBlock::new);
    public static final RegistryObject<Block> TRUE_SILVER_ORE_BLOCK = BLOCKS.register("true_silver_ore", TrueSilverOreBlock::new);
    public static final RegistryObject<Block> TRUE_SILVER_BLOCK = BLOCKS.register("true_silver_block", TrueSilverBlock::new);
    // Block Items
    public static final RegistryObject<Item> COPPER_ORE_BLOCK_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> COBALT_ORE_BLOCK_ITEM = ITEMS.register("cobalt_ore", () -> new BlockItemBase(COBALT_ORE_BLOCK.get()));
    public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block", () -> new BlockItemBase(COBALT_BLOCK.get()));
    public static final RegistryObject<Item> MYTHRIL_ORE_BLOCK_ITEM = ITEMS.register("mythril_ore", () -> new BlockItemBase(MYTHRIL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> MYTHRIL_BLOCK_ITEM = ITEMS.register("mythril_block", () -> new BlockItemBase(MYTHRIL_BLOCK.get()));
    public static final RegistryObject<Item> TRUE_SILVER_ORE_BLOCK_ITEM = ITEMS.register("true_silver_ore", () -> new BlockItemBase(TRUE_SILVER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> TRUE_SILVER_BLOCK_ITEM = ITEMS.register("true_silver_block", () -> new BlockItemBase(TRUE_SILVER_BLOCK.get()));
}
