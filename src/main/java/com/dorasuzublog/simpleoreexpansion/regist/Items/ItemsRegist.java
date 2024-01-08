package com.dorasuzublog.simpleoreexpansion.regist.Items;

import com.dorasuzublog.simpleoreexpansion.regist.Material;
import com.dorasuzublog.simpleoreexpansion.regist.Tier;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// アイテムの登録
public class ItemsRegist {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("simpleoreexpansion");
    @SubscribeEvent
    public static void registerItems(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }

    // Note: <>の中身はアイテムの種類(ツルハシやシャベルなど)によって変わる
    // Example: public static final DeferredItem<PickaxeItem> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe",() -> new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties()));

    //以下にアイテムを追加

    public static final DeferredItem<AxeItem> ALUMINUM_AXE = ITEMS.register("aluminum_axe", () -> new AxeItem( Tier.ALUMINUM, 6.0F, -3.1f, new Item.Properties()));
//    public static final DeferredItem<ArmorItem> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate",() -> new ArmorItem(Material.ALUMINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
//    public static final DeferredItem<ArmorItem> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet",() -> new ArmorItem(null, ArmorItem.Type.HELMET, null));
    public static final DeferredItem<HoeItem> ALUMINUM_HOE = ITEMS.register("aluminum_hoe",() -> new HoeItem(Tier.ALUMINUM, -3, 0.0F, new Item.Properties()));
//    public static final DeferredItem<HorseArmorItem> ALUMINUM_HORSE_ARMOR = ITEMS.register("aluminum_horse_armor",() -> new HorseArmorItem(0, (String) null, null));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.registerSimpleItem("aluminum_ingot", new Item.Properties());
//    public static final DeferredItem<ArmorItem> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings",() -> new ArmorItem(null, ArmorItem.Type.LEGGINGS, null));
    public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.registerSimpleItem("aluminum_nugget", new Item.Properties());
    public static final DeferredItem<PickaxeItem> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe",() -> new PickaxeItem(Tier.ALUMINUM, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<ShovelItem> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel",() -> new ShovelItem(Tier.ALUMINUM, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<SwordItem> ALUMINUM_SWORD = ITEMS.register("aluminum_sword",() -> new SwordItem(Tier.ALUMINUM, 3, -2.4F, new Item.Properties()));
    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.registerSimpleItem("raw_aluminum", new Item.Properties());
}