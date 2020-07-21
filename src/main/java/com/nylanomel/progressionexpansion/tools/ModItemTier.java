package com.nylanomel.progressionexpansion.tools;

import com.nylanomel.progressionexpansion.util.RegistryHandler;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    COPPER(2, 225, 6.2F, 1.0F, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_PICKAXE.get());
    }),
    SILVER(2, 200, 6.4F, 1.0F, 16, () -> {
        return Ingredient.fromItems(RegistryHandler.SILVER_PICKAXE.get());
    }),
    STEEL(3, 3021, 6.5F, 2.0F, 8, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL_PICKAXE.get());
    }),
    COBALT(4, 1921, 9.0F, 3.0F, 20, () -> {
        return Ingredient.fromItems(RegistryHandler.COBALT_PICKAXE.get());
    }),
    MYTHRIL(5, 2906, 10.0F, 4.0F, 22, () -> {
        return Ingredient.fromItems(RegistryHandler.MYTHRIL_PICKAXE.get());
    }),
    TRUE_SILVER(6, 3591, 11.0F, 5.0F, 24, () -> {
        return Ingredient.fromItems(RegistryHandler.TRUE_SILVER_PICKAXE.get());
    }),
    DRACONIC_STEEL(7, 4791, 12.0F, 6.0F, 28, () -> {
        return Ingredient.fromItems(RegistryHandler.DRACONIC_STEEL_PICKAXE.get());
    }),
    ENDRIL(8, 5523, 13.0F, 7.0F, 30, () -> {
        return Ingredient.fromItems(RegistryHandler.ENDRIL_PICKAXE.get());
    }),
    CHARGED_END_STONE(9, 6216, 14.0F, 8.0F, 33, () -> {
        return Ingredient.fromItems(RegistryHandler.CHARGED_END_STONE_PICKAXE.get());
    }),
    PURE_PURPUR(10, 7021, 15.0F, 9.0F, 37, () -> {
        return Ingredient.fromItems(RegistryHandler.PURE_PURPUR_PICKAXE.get());
    }),
    ADAMANTITE(11, 8325, 16.0F, 10.0F, 40, () -> {
        return Ingredient.fromItems(RegistryHandler.ADAMANTITE_PICKAXE.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantablility;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantablility, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantablility = enchantablility;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantablility;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
