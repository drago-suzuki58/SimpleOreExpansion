package com.dorasuzublog.simpleoreexpansion.regist.Blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

public class Blocks {
        public static final DeferredBlock<Block> EXAMPLE_BLOCK = BlocksRegist.BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
