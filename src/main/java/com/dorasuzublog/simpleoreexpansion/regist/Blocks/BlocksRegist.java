package com.dorasuzublog.simpleoreexpansion.regist.Blocks;

import com.dorasuzublog.simpleoreexpansion.regist.Items.ItemsRegist;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// ブロックの登録
public class BlocksRegist {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("simpleoreexpansion");

    @SubscribeEvent
    public static void registerItems(IEventBus modEventBus){
        BLOCKS.register(modEventBus);
    }

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BlocksRegist.BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ItemsRegist.ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);
}
