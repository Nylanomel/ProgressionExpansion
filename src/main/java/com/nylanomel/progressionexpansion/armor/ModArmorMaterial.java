package com.nylanomel.progressionexpansion.armor;

import com.nylanomel.progressionexpansion.ProgressionExpansion;
import com.nylanomel.progressionexpansion.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    COPPER(ProgressionExpansion.MOD_ID + ":copper", 14,  new int[]{1, 4, 5, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_HELMET.get());
    }, 0.0F),
    SILVER(ProgressionExpansion.MOD_ID + ":silver", 13,  new int[]{1, 4, 4, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.SILVER_HELMET.get());
    }, 0.0F),
    STEEL(ProgressionExpansion.MOD_ID + ":steel", 50,  new int[]{3, 6, 8, 3}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL_HELMET.get());
    }, 0.0F),
    COBALT(ProgressionExpansion.MOD_ID + ":cobalt", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.COBALT_HELMET.get());
    }, 0.0F),
    MYTHRIL(ProgressionExpansion.MOD_ID + ":mythril", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.MYTHRIL_HELMET.get());
    }, 0.0F),
    TRUE_SILVER(ProgressionExpansion.MOD_ID + ":true_silver", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.TRUE_SILVER_HELMET.get());
    }, 0.0F),
    DRACONIC_STEEL(ProgressionExpansion.MOD_ID + ":draconic_steel", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.DRACONIC_STEEL_HELMET.get());
    }, 0.0F),
    ENDRIL(ProgressionExpansion.MOD_ID + ":endril", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.ENDRIL_HELMET.get());
    }, 0.0F),
    CHARGED_END_STONE(ProgressionExpansion.MOD_ID + ":charged_end_stone", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.CHARGED_END_STONE_HELMET.get());
    }, 0.0F),
    PURE_PURPUR(ProgressionExpansion.MOD_ID + ":pure_purpur", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.PURE_PURPUR_HELMET.get());
    }, 0.0F),
    ADAMANTITE(ProgressionExpansion.MOD_ID + ":adamantite", 15,  new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 40.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.ADAMANTITE_HELMET.get());
    }, 0.0F);


    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    public final float knockbackResistance;

    private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float toughnessIn, Supplier<Ingredient> repairMaterialSupplier, float knockbackResistance) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = equipSoundIn;
        this.toughness = toughnessIn;
        this.repairMaterial = repairMaterialSupplier;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return knockbackResistance;
    }
}
