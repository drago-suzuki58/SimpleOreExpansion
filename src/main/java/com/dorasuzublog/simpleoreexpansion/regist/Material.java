//package com.dorasuzublog.simpleoreexpansion.regist;
//
//import com.dorasuzublog.simpleoreexpansion.regist.Items.ItemsRegist;
//
//import net.minecraft.sounds.SoundEvent;
//import net.minecraft.world.item.ArmorItem.Type;
//import net.minecraft.world.item.ArmorMaterial;
//import net.minecraft.world.item.crafting.Ingredient;
//
//public enum Material implements ArmorMaterial{
//    ALUMINUM("aluminum", 13, new int[]{2, 5, 6, 2}, 15, SoundEvent., 0.0F, 0.0F, () -> {
//        return Ingredient.of(ItemsRegist.ALUMINUM_INGOT.get());
//    });
//
//    @Override
//    public int getDefenseForType(Type arg0) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getDefenseForType'");
//    }
//
//    @Override
//    public int getDurabilityForType(Type arg0) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getDurabilityForType'");
//    }
//
//    @Override
//    public int getEnchantmentValue() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getEnchantmentValue'");
//    }
//
//    @Override
//    public SoundEvent getEquipSound() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getEquipSound'");
//    }
//
//    @Override
//    public float getKnockbackResistance() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getKnockbackResistance'");
//    }
//
//    @Override
//    public String getName() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getName'");
//    }
//
//    @Override
//    public Ingredient getRepairIngredient() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getRepairIngredient'");
//    }
//
//    @Override
//    public float getToughness() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getToughness'");
//    }
//
//
//}