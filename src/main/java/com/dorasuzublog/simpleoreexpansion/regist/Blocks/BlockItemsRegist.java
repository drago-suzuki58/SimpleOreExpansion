package com.dorasuzublog.simpleoreexpansion.regist.Blocks;

import com.dorasuzublog.simpleoreexpansion.regist.Items.ItemsRegist;

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;

public class BlockItemsRegist {
        public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ItemsRegist.ITEMS.registerSimpleBlockItem("example_block", BlocksRegist.EXAMPLE_BLOCK);
}