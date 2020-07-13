package com.nylanomel.progressionexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EndrilOreBlock extends Block {
    public EndrilOreBlock() {
        super(
                Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f,9.0f)
                .sound(SoundType.STONE)
                .harvestLevel(7)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}

