package com.slightlyuseful.dankestmod.tools;

import com.slightlyuseful.dankestmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ItemTier implements IItemTier {

    CUM(5, 2000, 11.0F, 4.0F, 30, ()->{
        return Ingredient.fromItems(RegistryHandler.CUM.get());
    });
    /*
    GRAPHITE(3, 1000, 7.0F, 2.0F, 15, ()->{
        return Ingredient.fromItems(RegistryHandler.CUM.get());
    });
    */

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;


    ItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return (Ingredient) repairMaterial;
    }
}
