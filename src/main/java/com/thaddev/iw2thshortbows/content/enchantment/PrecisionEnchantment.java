package com.thaddev.iw2thshortbows.content.enchantment;

import com.thaddev.iw2thshortbows.content.items.weapons.DiamondShortBowItem;
import com.thaddev.iw2thshortbows.content.items.weapons.IronShortBowItem;
import com.thaddev.iw2thshortbows.mechanics.inits.EnchantmentTargets;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PrecisionEnchantment extends Enchantment {

    public PrecisionEnchantment(Rarity weight, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTargets.SHORTBOW, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public int getMinPower(int p_45083_) {
        return 5 + 20 * (p_45083_ - 1);
    }

    @Override
    public int getMaxPower(int p_45085_) {
        return super.getMinPower(p_45085_) + 50;
    }

    @Override
    protected boolean canAccept(@NotNull Enchantment enchantment) {
        return !(enchantment instanceof PrecisionEnchantment);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof IronShortBowItem || stack.getItem() instanceof DiamondShortBowItem;
    }
}
