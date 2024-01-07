package com.dorasuzublog.simpleoreexpansion.regist;

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;

public class BlockItems {
        public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = Items.ITEMS.registerSimpleBlockItem("example_block", Blocks.EXAMPLE_BLOCK);
}