package com.nylanomel.progressionexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MythrilOreBlock extends Block{
    public MythrilOreBlock() {
        super(
                Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f,3.0f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
