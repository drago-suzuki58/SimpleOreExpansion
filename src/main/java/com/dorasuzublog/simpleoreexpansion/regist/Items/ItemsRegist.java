package com.dorasuzublog.simpleoreexpansion.regist.Items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;

// アイテムの登録
public class ItemsRegist {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("simpleoreexpansion");

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build()));

    @SubscribeEvent
    public static void registerItems(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }
}
