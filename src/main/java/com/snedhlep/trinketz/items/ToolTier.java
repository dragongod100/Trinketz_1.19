package com.snedhlep.trinketz.items;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolTier implements Tier {
    @Override
    public int getUses() {
        return 500;
    }

    @Override
    public float getSpeed() {
        return 3;
    }

    @Override
    public float getAttackDamageBonus() {
        return 3;
    }

    @Override
    public int getLevel() {
        return 3;
    }

    @Override
    public int getEnchantmentValue() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
