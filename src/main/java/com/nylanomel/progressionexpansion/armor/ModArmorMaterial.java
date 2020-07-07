package com.nylanomel.progressionexpansion.armor;

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
    COPPER("copper", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_HELMET.get());
    });
    /*SILVER("silver", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.SILVER_HELMET.get());
    }),
    STEEL("steel", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL_HELMET.get());
    }),
    COBALT("cobalt", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.COBALT_HELMET.get());
    }),
    MYTHRIL("mythril", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.MYTHRIL_HELMET.get());
    }),
    TRUE_SILVER("true_silver", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.TRUE_SILVER_HELMET.get());
    }),
    DRACONIC_STEEL("draconic_steel", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.DRACONIC_STEEL_HELMET.get());
    }),
    ENDRIL("endril", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.ENDRIL_HELMET.get());
    }),
    CHARGED_END_STONE("charged_end_stone", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.CHARGED_END_STONE_HELMET.get());
    }),
    PURE_PURPUR("pure_purpur", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.PURE_PURPUR_HELMET.get());
    }),
    ADAMANTITE("adamantite", 15,  new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.ADAMANTITE_HELMET.get());
    });*/


    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;

    private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float toughnessIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = equipSoundIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
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
        return this.repairMaterial.getValue();
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
}