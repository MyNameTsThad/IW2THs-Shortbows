package com.thaddev.iw2thshortbows.mechanics.inits;

import com.mojang.serialization.Codec;
import com.thaddev.iw2thshortbows.IWant2TryHardsShortbows;
import com.thaddev.iw2thshortbows.mechanics.lootmodifiers.MicrochipInBastionAdditionModifier;
import com.thaddev.iw2thshortbows.mechanics.lootmodifiers.MicrochipInDesertTempleAdditionModifier;
import com.thaddev.iw2thshortbows.mechanics.lootmodifiers.MicrochipInDungeonAdditionModifier;
import com.thaddev.iw2thshortbows.mechanics.lootmodifiers.MicrochipInJungleTempleAdditionModifier;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GlobalLootModifierInit {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLOBAL_LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, IWant2TryHardsShortbows.MODID);

    public static final RegistryObject<Codec<MicrochipInDungeonAdditionModifier>> MICROCHIP_IN_DUNGEON_LOOT = GLOBAL_LOOT_MODIFIERS
        .register("microchip_in_dungeon", MicrochipInDungeonAdditionModifier.CODEC);
    public static final RegistryObject<Codec<MicrochipInDesertTempleAdditionModifier>> MICROCHIP_IN_DESERT_TEMPLE_LOOT = GLOBAL_LOOT_MODIFIERS
        .register("microchip_in_desert_temple", MicrochipInDesertTempleAdditionModifier.CODEC);
    public static final RegistryObject<Codec<MicrochipInJungleTempleAdditionModifier>> MICROCHIP_IN_JUNGLE_TEMPLE_LOOT = GLOBAL_LOOT_MODIFIERS
        .register("microchip_in_jungle_temple", MicrochipInJungleTempleAdditionModifier.CODEC);
    public static final RegistryObject<Codec<MicrochipInBastionAdditionModifier>> MICROCHIP_IN_BASTION_LOOT = GLOBAL_LOOT_MODIFIERS
        .register("microchip_in_bastion", MicrochipInBastionAdditionModifier.CODEC);
}
