package com.nylanomel.progressionexpansion.util;

import com.nylanomel.progressionexpansion.ProgressionExpansion;
import com.nylanomel.progressionexpansion.armor.ModArmorMaterial;
import com.nylanomel.progressionexpansion.blocks.*;
import com.nylanomel.progressionexpansion.items.ItemBase;
import com.nylanomel.progressionexpansion.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
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
        // Overworld
        public static final RegistryObject<Item> COPPER_BAR = ITEMS.register("copper_bar", ItemBase::new);
        public static final RegistryObject<Item> SILVER_BAR = ITEMS.register("silver_bar", ItemBase::new);
        public static final RegistryObject<Item> STEEL_BAR = ITEMS.register("steel_bar", ItemBase::new);
        // Nether
        public static final RegistryObject<Item> COBALT_BAR = ITEMS.register("cobalt_bar", ItemBase::new);
        public static final RegistryObject<Item> MYTHRIL_BAR = ITEMS.register("mythril_bar", ItemBase::new);
        public static final RegistryObject<Item> TRUE_SILVER_BAR = ITEMS.register("true_silver_bar", ItemBase::new);
        // End
        public static final RegistryObject<Item> DRACONIC_STEEL_BAR = ITEMS.register("draconic_steel_bar", ItemBase::new);
        public static final RegistryObject<Item> ENDRIL_BAR = ITEMS.register("endril_bar", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_CHUNK = ITEMS.register("charged_end_stone_chunk", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_BAR = ITEMS.register("charged_end_stone_bar", ItemBase::new);
        public static final RegistryObject<Item> FRACTURED_PURPUR_CHUNK = ITEMS.register("fractured_purpur_chunk", ItemBase::new);
        public static final RegistryObject<Item> PURE_PURPUR_BAR = ITEMS.register("pure_purpur_bar", ItemBase::new);
        public static final RegistryObject<Item> ADAMANTITE_BAR = ITEMS.register("adamantite_bar", ItemBase::new);
    // Blocks
        // Overworld
            // Ore
            public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore", CopperOreBlock::new);
            public static final RegistryObject<Block> SILVER_ORE_BLOCK = BLOCKS.register("silver_ore", SilverOreBlock::new);
            // Precious Blocks
            public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
            public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", SilverBlock::new);
            public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
        // Nether
            // Ore
            public static final RegistryObject<Block> COBALT_ORE_BLOCK = BLOCKS.register("cobalt_ore", CobaltOreBlock::new);
            public static final RegistryObject<Block> MYTHRIL_ORE_BLOCK = BLOCKS.register("mythril_ore", MythrilOreBlock::new);
            public static final RegistryObject<Block> TRUE_SILVER_ORE_BLOCK = BLOCKS.register("true_silver_ore", TrueSilverOreBlock::new);
            // Precious Blocks
            public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", CobaltBlock::new);
            public static final RegistryObject<Block> MYTHRIL_BLOCK = BLOCKS.register("mythril_block", MythrilBlock::new);
            public static final RegistryObject<Block> TRUE_SILVER_BLOCK = BLOCKS.register("true_silver_block", TrueSilverBlock::new);
        // End
            // Ore
            public static final RegistryObject<Block> DRACONIC_STEEL_ORE_BLOCK = BLOCKS.register("draconic_steel_ore", DraconicSteelOreBlock::new);
            public static final RegistryObject<Block> ENDRIL_ORE_BLOCK = BLOCKS.register("endril_ore", EndrilOreBlock::new);
            public static final RegistryObject<Block> CHARGED_END_STONE_BLOCK = BLOCKS.register("charged_end_stone", ChargedEndStoneBlock::new);
            public static final RegistryObject<Block> FRACTURED_PURPUR_BLOCK = BLOCKS.register("fractured_purpur_block", FracturedPurpurBlock::new);
            // Precious Blocks
            public static final RegistryObject<Block> DRACONIC_STEEL_BLOCK = BLOCKS.register("draconic_steel_block", DraconicSteelBlock::new);
            public static final RegistryObject<Block> ENDRIL_BLOCK = BLOCKS.register("endril_block", EndrilBlock::new);
            public static final RegistryObject<Block> POLISHED_CHARGED_END_STONE_BLOCK = BLOCKS.register("polished_charged_end_stone", PolishedChargedEndStoneBlock::new);
            public static final RegistryObject<Block> PURE_PURPUR_BLOCK = BLOCKS.register("pure_purpur_block", PurePurpurBlock::new);
            public static final RegistryObject<Block> ADAMANTITE_BLOCK = BLOCKS.register("adamantite_block", AdamantiteBlock::new);
    // Block Items
        // Overworld
            // Ore
            public static final RegistryObject<Item> COPPER_ORE_BLOCK_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE_BLOCK.get()));
            public static final RegistryObject<Item> SILVER_ORE_BLOCK_ITEM = ITEMS.register("silver_ore", () -> new BlockItemBase(SILVER_ORE_BLOCK.get()));
            // Precious Blocks
            public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
            public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItemBase(SILVER_BLOCK.get()));
            public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
        // Nether
            // Ore
            public static final RegistryObject<Item> COBALT_ORE_BLOCK_ITEM = ITEMS.register("cobalt_ore", () -> new BlockItemBase(COBALT_ORE_BLOCK.get()));
            public static final RegistryObject<Item> MYTHRIL_ORE_BLOCK_ITEM = ITEMS.register("mythril_ore", () -> new BlockItemBase(MYTHRIL_ORE_BLOCK.get()));
            public static final RegistryObject<Item> TRUE_SILVER_ORE_BLOCK_ITEM = ITEMS.register("true_silver_ore", () -> new BlockItemBase(TRUE_SILVER_ORE_BLOCK.get()));
            // Precious Blocks
            public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block", () -> new BlockItemBase(COBALT_BLOCK.get()));
            public static final RegistryObject<Item> MYTHRIL_BLOCK_ITEM = ITEMS.register("mythril_block", () -> new BlockItemBase(MYTHRIL_BLOCK.get()));
            public static final RegistryObject<Item> TRUE_SILVER_BLOCK_ITEM = ITEMS.register("true_silver_block", () -> new BlockItemBase(TRUE_SILVER_BLOCK.get()));
        // End
            // Ore
            public static final RegistryObject<Item> DRACONIC_STEEL_ORE_BLOCK_ITEM = ITEMS.register("draconic_steel_ore", () -> new BlockItemBase(DRACONIC_STEEL_ORE_BLOCK.get()));
            public static final RegistryObject<Item> ENDRIL_ORE_BLOCK_ITEM = ITEMS.register("endril_ore", () -> new BlockItemBase(ENDRIL_ORE_BLOCK.get()));
            public static final RegistryObject<Item> CHARGED_END_STONE_BLOCK_ITEM = ITEMS.register("charged_end_stone", () -> new BlockItemBase(CHARGED_END_STONE_BLOCK.get()));
            public static final RegistryObject<Item> FRACTURED_PURPUR_BLOCK_ITEM = ITEMS.register("fractured_purpur_block", () -> new BlockItemBase(FRACTURED_PURPUR_BLOCK.get()));
            // Precious Blocks
            public static final RegistryObject<Item> DRACONIC_STEEL_BLOCK_ITEM = ITEMS.register("draconic_steel_block", () -> new BlockItemBase(DRACONIC_STEEL_BLOCK.get()));
            public static final RegistryObject<Item> ENDRIL_BLOCK_ITEM = ITEMS.register("endril_block", () -> new BlockItemBase(ENDRIL_BLOCK.get()));
            public static final RegistryObject<Item> POLISHED_CHARGED_END_STONE_BLOCK_ITEM = ITEMS.register("polished_charged_end_stone", () -> new BlockItemBase(POLISHED_CHARGED_END_STONE_BLOCK.get()));
            public static final RegistryObject<Item> PURE_PURPUR_BLOCK_ITEM = ITEMS.register("pure_purpur_block", () -> new BlockItemBase(PURE_PURPUR_BLOCK.get()));
            public static final RegistryObject<Item> ADAMANTITE_BLOCK_ITEM = ITEMS.register("adamantite_block", () -> new BlockItemBase(ADAMANTITE_BLOCK.get()));
    // Tools
        // Copper
        public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
                () -> new PickaxeItem(ModItemTier.COPPER, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
                () -> new AxeItem(ModItemTier.COPPER, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
                () -> new ShovelItem(ModItemTier.COPPER, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
                () -> new SwordItem(ModItemTier.COPPER, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
                () -> new HoeItem(ModItemTier.COPPER, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Silver
        public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
                () -> new PickaxeItem(ModItemTier.SILVER, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModItemTier.SILVER, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel",
                () -> new ShovelItem(ModItemTier.SILVER, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword",
                () -> new SwordItem(ModItemTier.SILVER, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe",
                () -> new HoeItem(ModItemTier.SILVER, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Steel
        public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
                () -> new PickaxeItem(ModItemTier.STEEL, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe",
                () -> new AxeItem(ModItemTier.STEEL, 6, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel",
                () -> new ShovelItem(ModItemTier.STEEL, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
                () -> new SwordItem(ModItemTier.STEEL, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe",
                () -> new HoeItem(ModItemTier.STEEL, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Cobalt
        public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
                () -> new PickaxeItem(ModItemTier.COBALT, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe",
                () -> new AxeItem(ModItemTier.COBALT, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
                () -> new ShovelItem(ModItemTier.COBALT, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword",
                () -> new SwordItem(ModItemTier.COBALT, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> COBALT_HOE = ITEMS.register("cobalt_hoe",
                () -> new HoeItem(ModItemTier.COBALT, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Mythril
        public static final RegistryObject<PickaxeItem> MYTHRIL_PICKAXE = ITEMS.register("mythril_pickaxe",
                () -> new PickaxeItem(ModItemTier.MYTHRIL, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> MYTHRIL_AXE = ITEMS.register("mythril_axe",
            () -> new AxeItem(ModItemTier.MYTHRIL, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> MYTHRIL_SHOVEL = ITEMS.register("mythril_shovel",
                () -> new ShovelItem(ModItemTier.MYTHRIL, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> MYTHRIL_SWORD = ITEMS.register("mythril_sword",
                () -> new SwordItem(ModItemTier.MYTHRIL, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> MYTHRIL_HOE = ITEMS.register("mythril_hoe",
                () -> new HoeItem(ModItemTier.MYTHRIL, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // True Silver
        public static final RegistryObject<PickaxeItem> TRUE_SILVER_PICKAXE = ITEMS.register("true_silver_pickaxe",
                () -> new PickaxeItem(ModItemTier.TRUE_SILVER, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> TRUE_SILVER_AXE = ITEMS.register("true_silver_axe",
                () -> new AxeItem(ModItemTier.TRUE_SILVER, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> TRUE_SILVER_SHOVEL = ITEMS.register("true_silver_shovel",
                () -> new ShovelItem(ModItemTier.TRUE_SILVER, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> TRUE_SILVER_SWORD = ITEMS.register("true_silver_sword",
                () -> new SwordItem(ModItemTier.TRUE_SILVER, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> TRUE_SILVER_HOE = ITEMS.register("true_silver_hoe",
                () -> new HoeItem(ModItemTier.TRUE_SILVER, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Draconic Steel
        public static final RegistryObject<PickaxeItem> DRACONIC_STEEL_PICKAXE = ITEMS.register("draconic_steel_pickaxe",
                () -> new PickaxeItem(ModItemTier.DRACONIC_STEEL, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> DRACONIC_STEEL_AXE = ITEMS.register("draconic_steel_axe",
                () -> new AxeItem(ModItemTier.DRACONIC_STEEL, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> DRACONIC_STEEL_SHOVEL = ITEMS.register("draconic_steel_shovel",
                () -> new ShovelItem(ModItemTier.DRACONIC_STEEL, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> DRACONIC_STEEL_SWORD = ITEMS.register("draconic_steel_sword",
                () -> new SwordItem(ModItemTier.DRACONIC_STEEL, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> DRACONIC_STEEL_HOE = ITEMS.register("draconic_steel_hoe",
                () -> new HoeItem(ModItemTier.DRACONIC_STEEL, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Endril
        public static final RegistryObject<PickaxeItem> ENDRIL_PICKAXE = ITEMS.register("endril_pickaxe",
                () -> new PickaxeItem(ModItemTier.ENDRIL, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> ENDRIL_AXE = ITEMS.register("endril_axe",
                () -> new AxeItem(ModItemTier.ENDRIL, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> ENDRIL_SHOVEL = ITEMS.register("endril_shovel",
                () -> new ShovelItem(ModItemTier.ENDRIL, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> ENDRIL_SWORD = ITEMS.register("endril_sword",
                () -> new SwordItem(ModItemTier.ENDRIL, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> ENDRIL_HOE = ITEMS.register("endril_hoe",
                () -> new HoeItem(ModItemTier.ENDRIL, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Charged Endstone
        public static final RegistryObject<PickaxeItem> CHARGED_END_STONE_PICKAXE = ITEMS.register("charged_end_stone_pickaxe",
                () -> new PickaxeItem(ModItemTier.CHARGED_END_STONE, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> CHARGED_END_STONE_AXE = ITEMS.register("charged_end_stone_axe",
                () -> new AxeItem(ModItemTier.CHARGED_END_STONE, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> CHARGED_END_STONE_SHOVEL = ITEMS.register("charged_end_stone_shovel",
                () -> new ShovelItem(ModItemTier.CHARGED_END_STONE, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> CHARGED_END_STONE_SWORD = ITEMS.register("charged_end_stone_sword",
                () -> new SwordItem(ModItemTier.CHARGED_END_STONE, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> CHARGED_END_STONE_HOE = ITEMS.register("charged_end_stone_hoe",
                () -> new HoeItem(ModItemTier.CHARGED_END_STONE, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Pure Purpur
        public static final RegistryObject<PickaxeItem> PURE_PURPUR_PICKAXE = ITEMS.register("pure_purpur_pickaxe",
                () -> new PickaxeItem(ModItemTier.PURE_PURPUR, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> PURE_PURPUR_AXE = ITEMS.register("pure_purpur_axe",
                () -> new AxeItem(ModItemTier.PURE_PURPUR, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> PURE_PURPUR_SHOVEL = ITEMS.register("pure_purpur_shovel",
                () -> new ShovelItem(ModItemTier.PURE_PURPUR, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> PURE_PURPUR_SWORD = ITEMS.register("pure_purpur_sword",
                () -> new SwordItem(ModItemTier.PURE_PURPUR, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> PURE_PURPUR_HOE = ITEMS.register("pure_purpur_hoe",
                () -> new HoeItem(ModItemTier.PURE_PURPUR, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        // Adamantite
        public static final RegistryObject<PickaxeItem> ADAMANTITE_PICKAXE = ITEMS.register("adamantite_pickaxe",
                () -> new PickaxeItem(ModItemTier.ADAMANTITE, 2, -2.8F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<AxeItem> ADAMANTITE_AXE = ITEMS.register("adamantite_axe",
                () -> new AxeItem(ModItemTier.ADAMANTITE, 7, -3.1F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ShovelItem> ADAMANTITE_SHOVEL = ITEMS.register("adamantite_shovel",
                () -> new ShovelItem(ModItemTier.ADAMANTITE, 2.5F, -3.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<SwordItem> ADAMANTITE_SWORD = ITEMS.register("adamantite_sword",
                () -> new SwordItem(ModItemTier.ADAMANTITE, 4, -2.4F, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<HoeItem> ADAMANTITE_HOE = ITEMS.register("adamantite_hoe",
                () -> new HoeItem(ModItemTier.ADAMANTITE, -1.0F, new Item.Properties().group(ProgressionExpansion.TAB)));
    // ARMOR
        // COPPER
        public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () ->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () ->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () ->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(ProgressionExpansion.TAB)));
        public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () ->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(ProgressionExpansion.TAB)));

}
