package com.eduhzzepunk.productivehoe;

import com.eduhzzepunk.productivehoe.enchantment.ModEnchantments;
import com.eduhzzepunk.productivehoe.network.ModNetworking;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
@Mod(ProductiveHoeMod.MOD_ID)
public class ProductiveHoeMod {
    public static final String MOD_ID = "eduhzzepunks_productive_hoe";

    public ProductiveHoeMod(IEventBus modEventBus) {
        ModEnchantments.register(modEventBus);
        ModNetworking.register();
    }
}
