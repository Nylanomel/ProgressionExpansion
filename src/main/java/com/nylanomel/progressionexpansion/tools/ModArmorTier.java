package com.nylanomel.progressionexpansion.tools;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public enum ModArmorTier implements IArmorMaterial {;

    LEATHER("leather", 5 new int[]{1, 2, 3, 1}, 15, SoundEvent.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, () -> {
        return Ingredient.fromItems(Items.LEATHER);
    });


    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return null;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }
}
