package com.dorasuzublog.simpleoreexpansion.regist;

import com.dorasuzublog.simpleoreexpansion.regist.Items.ItemsRegist;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.neoforge.common.util.Lazy;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import java.util.function.Supplier;

public enum Material implements ArmorMaterial {
    ALUMINUM ("simpleoreexpansion:aluminum", 8, new int [] {1,2,3,2}, 8,
            SoundEvents.ARMOR_EQUIP_CHAIN , 0.0F, () -> {
                return Ingredient.of(ItemsRegist.ALUMINUM_INGOT.get());
            });

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Ingredient repairIngredient;

    Material(String nameIn, int maxDamageIn, int[] drAmtArray,
             int enchantabilityIn, SoundEvent soundIn,
             float toughnessIn,
             Supplier<Ingredient> repairMatIn)
    {
        name = nameIn;
        durabilityMultiplier = maxDamageIn;
        protectionAmounts = drAmtArray;
        enchantability = enchantabilityIn;
        equipSound = soundIn;
        toughness = toughnessIn;
        repairIngredient = repairMatIn.get();
    }

//    @Override
//    public int getDurabilityForSlot(EquipmentSlot slot) {
//        return BASE_DURABILITY[slot.getIndex()] * this.durabilityMultiplier;
//    }
//
//    @Override
//    public int getDefenseForSlot(EquipmentSlot slot) {
//        return this.protectionAmounts[slot.getIndex()];
//    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient != null ? this.repairIngredient : Ingredient.EMPTY;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

        @Override
        public int getDefenseForType(Type arg0) {
            return BASE_DURABILITY[arg0.getSlot().getIndex()] * this.durabilityMultiplier;
        }

        @Override
        public int getDurabilityForType(Type arg0) {
            return this.protectionAmounts[arg0.getSlot().getIndex()];
        }

}