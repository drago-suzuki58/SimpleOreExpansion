package com.dorasuzublog.simpleoreexpansion.regist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

// ブロックの登録
public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("simpleoreexpansion");

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    @SubscribeEvent
    public static void registerItems(IEventBus modEventBus){
        BLOCKS.register(modEventBus);
    }
}
