package com.nylanomel.progressionexpansion.util;

import com.nylanomel.progressionexpansion.ProgressionExpansion;
import com.nylanomel.progressionexpansion.blocks.*;
import com.nylanomel.progressionexpansion.items.ItemBase;
import com.nylanomel.progressionexpansion.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
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
    public static final RegistryObject<Item> SILVER_BAR = ITEMS.register("silver_bar", ItemBase::new);
    public static final RegistryObject<Item> STEEL_BAR = ITEMS.register("steel_bar", ItemBase::new);
    public static final RegistryObject<Item> COBALT_BAR = ITEMS.register("cobalt_bar", ItemBase::new);
    public static final RegistryObject<Item> MYTHRIL_BAR = ITEMS.register("mythril_bar", ItemBase::new);
    public static final RegistryObject<Item> TRUE_SILVER_BAR = ITEMS.register("true_silver_bar", ItemBase::new);
    // Blocks
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore", CopperOreBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
    public static final RegistryObject<Block> SILVER_ORE_BLOCK = BLOCKS.register("silver_ore", SilverOreBlock::new);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", SilverBlock::new);
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
    public static final RegistryObject<Item> SILVER_ORE_BLOCK_ITEM = ITEMS.register("silver_ore", () -> new BlockItemBase(SILVER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItemBase(SILVER_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> COBALT_ORE_BLOCK_ITEM = ITEMS.register("cobalt_ore", () -> new BlockItemBase(COBALT_ORE_BLOCK.get()));
    public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block", () -> new BlockItemBase(COBALT_BLOCK.get()));
    public static final RegistryObject<Item> MYTHRIL_ORE_BLOCK_ITEM = ITEMS.register("mythril_ore", () -> new BlockItemBase(MYTHRIL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> MYTHRIL_BLOCK_ITEM = ITEMS.register("mythril_block", () -> new BlockItemBase(MYTHRIL_BLOCK.get()));
    public static final RegistryObject<Item> TRUE_SILVER_ORE_BLOCK_ITEM = ITEMS.register("true_silver_ore", () -> new BlockItemBase(TRUE_SILVER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> TRUE_SILVER_BLOCK_ITEM = ITEMS.register("true_silver_block", () -> new BlockItemBase(TRUE_SILVER_BLOCK.get()));
    // Tools
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModItemTier.COPPER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModItemTier.COPPER, 2, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModItemTier.SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ModItemTier.SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ModItemTier.SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ModItemTier.SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ModItemTier.SILVER, 2, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel.json", () -> new ShovelItem(ModItemTier.STEEL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, 2, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new PickaxeItem(ModItemTier.COBALT, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new AxeItem(ModItemTier.COBALT, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ShovelItem(ModItemTier.COBALT, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(ModItemTier.COBALT, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<HoeItem> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new HoeItem(ModItemTier.COBALT, 2, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<PickaxeItem> MYTHRIL_PICKAXE = ITEMS.register("mythril_pickaxe", () -> new PickaxeItem(ModItemTier.MYTHRIL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<AxeItem> MYTHRIL_AXE = ITEMS.register("mythril_axe", () -> new AxeItem(ModItemTier.MYTHRIL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<ShovelItem> MYTHRIL_SHOVEL = ITEMS.register("mythril_shovel", () -> new ShovelItem(ModItemTier.MYTHRIL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<SwordItem> MYTHRIL_SWORD = ITEMS.register("mythril_sword", () -> new SwordItem(ModItemTier.MYTHRIL, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<HoeItem> MYTHRIL_HOE = ITEMS.register("mythril_hoe", () -> new HoeItem(ModItemTier.MYTHRIL, 2, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<PickaxeItem> TRUE_SILVER_PICKAXE = ITEMS.register("true_silver_pickaxe", () -> new PickaxeItem(ModItemTier.TRUE_SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<AxeItem> TRUE_SILVER_AXE = ITEMS.register("true_silver_axe", () -> new AxeItem(ModItemTier.TRUE_SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<ShovelItem> TRUE_SILVER_SHOVEL = ITEMS.register("true_silver_shovel", () -> new ShovelItem(ModItemTier.TRUE_SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<SwordItem> TRUE_SILVER_SWORD = ITEMS.register("true_silver_sword", () -> new SwordItem(ModItemTier.TRUE_SILVER, 2, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
    public static final RegistryObject<HoeItem> TRUE_SILVER_HOE = ITEMS.register("true_silver_hoe", () -> new HoeItem(ModItemTier.TRUE_SILVER, 2, new Item.Properties().group(ProgressionExpansion.TAB)));
}
