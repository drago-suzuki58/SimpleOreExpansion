package com.dorasuzublog.simpleoreexpansion;

import com.dorasuzublog.simpleoreexpansion.regist.CreativeTab;
import com.dorasuzublog.simpleoreexpansion.regist.Blocks.Blocks;
import com.dorasuzublog.simpleoreexpansion.regist.Items.Items;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("simpleoreexpansion")
public class SimpleOreExpansion {
    public static final String MODID = "simpleoreexpansion";

    public SimpleOreExpansion() {
        // アイテム類の登録
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeTab.CREATIVE_MODE_TABS.register(bus);
        Items.ITEMS.register(bus);
        Blocks.BLOCKS.register(bus);
    }
}