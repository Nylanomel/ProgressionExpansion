package com.nylanomel.progressionexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CopperOreBlock extends Block {
    public CopperOreBlock() {
        super(
                Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f,3.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
