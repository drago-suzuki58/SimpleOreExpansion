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

    public static final DeferredBlock<Block> ALUMINUM_BLOCK = BlocksRegist.BLOCKS.registerSimpleBlock("aluminum_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> ALUMINUM_ORE = BlocksRegist.BLOCKS.registerSimpleBlock("aluminum_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINUM_ORE = BlocksRegist.BLOCKS.registerSimpleBlock("deepslate_aluminum_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = BlocksRegist.BLOCKS.registerSimpleBlock("raw_aluminum_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    public static final DeferredItem<BlockItem> ALUMINUM_BLOCK_ITEM = ItemsRegist.ITEMS.registerSimpleBlockItem("aluminum_block", BlocksRegist.ALUMINUM_BLOCK);
    public static final DeferredItem<BlockItem> ALUMINUM_ORE_ITEM = ItemsRegist.ITEMS.registerSimpleBlockItem("aluminum_ore", BlocksRegist.ALUMINUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_ALUMINUM_ORE_ITEM = ItemsRegist.ITEMS.registerSimpleBlockItem("deepslate_aluminum_ore", BlocksRegist.DEEPSLATE_ALUMINUM_ORE);
    public static final DeferredItem<BlockItem> RAW_ALUMINUM_BLOCK_ITEM = ItemsRegist.ITEMS.registerSimpleBlockItem("raw_aluminum_block", BlocksRegist.RAW_ALUMINUM_BLOCK);
}
