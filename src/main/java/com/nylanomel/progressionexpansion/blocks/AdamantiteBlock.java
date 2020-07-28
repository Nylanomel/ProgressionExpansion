package com.nylanomel.progressionexpansion.blocks;

import com.nylanomel.progressionexpansion.ProgressionExpansion;
import com.nylanomel.progressionexpansion.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class AdamantiteBlock extends Block {
    public AdamantiteBlock() {
        super(
                Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(10)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}