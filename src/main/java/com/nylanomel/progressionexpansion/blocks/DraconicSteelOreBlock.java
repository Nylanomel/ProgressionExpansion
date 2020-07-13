package com.nylanomel.progressionexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DraconicSteelOreBlock extends Block {
    public DraconicSteelOreBlock() {
        super(
                Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(50.0f,1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(6)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
