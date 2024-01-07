package com.dorasuzublog.simpleoreexpansion.regist.Items;

import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;

// アイテムの登録
public class ItemsRegist {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("simpleoreexpansion");
    @SubscribeEvent
    public static void registerItems(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }

    public static final DeferredItem<Item> EXAMPLE_ITEM = ItemsRegist.ITEMS.registerSimpleItem("example_item", new Item.Properties());
}
