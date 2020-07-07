package com.nylanomel.progressionexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EndrilBlock extends Block {
    public EndrilBlock() {
        super(
                Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(7)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}