package com.dorasuzublog.simpleoreexpansion.regist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Tags {
    public static class Blocks {
        //以下にタグを追加
        public static final TagKey<Block> NEED_OBSIDIAN_TOOL = tag("needs_obsidian_TOOL");

        private static TagKey<Block> tag (String name) {
            return BlockTags.create(new ResourceLocation("simpleoreexpansion", name));
        }
    }
    public static class Items {
        //以下にタグを追加


        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation("simpleoreexpansion", name));
        }
    }
}
