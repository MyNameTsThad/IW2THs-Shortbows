package com.thaddev.iw2thshortbows.content.enchantments;

import com.thaddev.iw2thshortbows.content.items.weapons.DiamondShortBowItem;
import com.thaddev.iw2thshortbows.content.items.weapons.IronShortBowItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class InheritEnchantment extends Enchantment {
    public InheritEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] slots) {
        super(rarity, category, slots);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinCost(int p_45083_) {
        return 5 + 20 * (p_45083_ - 1);
    }

    @Override
    public int getMaxCost(int p_45085_) {
        return super.getMinCost(p_45085_) + 50;
    }

    @Override
    protected boolean checkCompatibility(@NotNull Enchantment enchantment) {
        return !(enchantment instanceof InheritEnchantment);
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        return stack.getItem() instanceof IronShortBowItem || stack.getItem() instanceof DiamondShortBowItem;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return (stack.getItem() instanceof IronShortBowItem || stack.getItem() instanceof DiamondShortBowItem);
    }
}
