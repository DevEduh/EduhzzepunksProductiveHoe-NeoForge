package com.eduhzzepunk.productivehoe.enchantment;

import com.eduhzzepunk.productivehoe.ProductiveHoeMod;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEnchantments {
    private static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ProductiveHoeMod.MOD_ID);

    public static final RegistryObject<Enchantment> ACREAGE =
            ENCHANTMENTS.register("acreage", AcreageEnchantment::new);
    public static final RegistryObject<Enchantment> BOUNTIFUL_SEED =
            ENCHANTMENTS.register("bountiful_seed", BountifulSeedEnchantment::new);

    private ModEnchantments() {}

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
