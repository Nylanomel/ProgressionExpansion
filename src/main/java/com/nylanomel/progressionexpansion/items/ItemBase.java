package com.nylanomel.progressionexpansion.items;

import com.nylanomel.progressionexpansion.ProgressionExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ProgressionExpansion.TAB));
    }
}
