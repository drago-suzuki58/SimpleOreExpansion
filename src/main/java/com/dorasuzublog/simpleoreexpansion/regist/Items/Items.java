package com.dorasuzublog.simpleoreexpansion.regist.Items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class Items {
    public static final DeferredItem<Item> EXAMPLE_ITEM = ItemsRegist.ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build()));
}