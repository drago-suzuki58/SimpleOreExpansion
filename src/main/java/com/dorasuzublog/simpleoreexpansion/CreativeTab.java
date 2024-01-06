package com.dorasuzublog.simpleoreexpansion;

import com.dorasuzublog.simpleoreexpansion.regist.Blocks;
import com.dorasuzublog.simpleoreexpansion.regist.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

// クリエイティブタブの登録
public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "simpleoreexpansion");

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ORE_TAB = CREATIVE_MODE_TABS.register("example_tab",()->CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.ExpansionOres"))
        .icon(() -> new ItemStack(Items.EXAMPLE_ITEM.get()))

        // アイテム一覧
        .displayItems((params, output) -> {
            output.accept(Items.EXAMPLE_ITEM.get());
            output.accept(Blocks.EXAMPLE_BLOCK.get());
            
        })
        .build()
    );
}
