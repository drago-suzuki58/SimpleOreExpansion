package com.dorasuzublog.simpleoreexpansion.regist;


import com.dorasuzublog.simpleoreexpansion.regist.Items.ItemsRegist;

import java.util.List;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.TierSortingRegistry;

public class Tier {
    public static final SimpleTier ALUMINUM = new SimpleTier(2, 220, 8.0F, 1.5F, 15, Tags.Blocks.NEED_ALUMINUM_TOOL, ()->Ingredient.of(ItemsRegist.ALUMINUM_INGOT.get()));

    static {
        TierSortingRegistry.registerTier(ALUMINUM, new ResourceLocation("simpleoreexpansion", "aluminum_ingot"), List.of(Tiers.STONE), List.of(Tiers.IRON));
    }
}
