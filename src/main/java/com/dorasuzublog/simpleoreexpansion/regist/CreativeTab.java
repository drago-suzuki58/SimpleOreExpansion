package com.dorasuzublog.simpleoreexpansion.regist;

import com.dorasuzublog.simpleoreexpansion.regist.Blocks.BlocksRegist;

import com.dorasuzublog.simpleoreexpansion.regist.Items.ItemsRegist;

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
        .icon(() -> new ItemStack(ItemsRegist.ALUMINUM_INGOT.get()))

        // アイテム一覧
        .displayItems((params, output) -> {
            output.accept(ItemsRegist.ALUMINUM_INGOT.get());
            output.accept(ItemsRegist.ALUMINUM_NUGGET.get());
            output.accept(BlocksRegist.ALUMINUM_BLOCK.get());
        })
        .build()
    );
}
