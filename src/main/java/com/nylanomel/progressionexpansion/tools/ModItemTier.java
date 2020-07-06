package com.nylanomel.progressionexpansion.tools;

import com.nylanomel.progressionexpansion.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    COPPER(2, 225, 6.5F, 0.0F, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_PICKAXE.get());
    }),
    SILVER(2, 200, 7.0F, 0.0F, 16, () -> {
        return Ingredient.fromItems(RegistryHandler.SILVER_PICKAXE.get());
    }),
    STEEL(3, 3021, 7.2F, 0.0F, 8, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL_PICKAXE.get());
    }),
    COBALT(4, 3021, 9.0F, 0.0F, 20, () -> {
        return Ingredient.fromItems(RegistryHandler.COBALT_PICKAXE.get());
    }),
    MYTHRIL(5, 3906, 10.0F, 0.0F, 22, () -> {
        return Ingredient.fromItems(RegistryHandler.MYTHRIL_PICKAXE.get());
    }),
    TRUE_SILVER(6, 4591, 11.0F, 0.0F, 24, () -> {
        return Ingredient.fromItems(RegistryHandler.TRUE_SILVER_PICKAXE.get());
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
