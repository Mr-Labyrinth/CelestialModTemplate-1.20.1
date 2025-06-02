package com.lingyun.celestial.tag;

import com.lingyun.celestial.CelestialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CelestialModItemTags {
    public static final TagKey<Item> CELESTIAL_ITEMS = of("celestial_items");

    public static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(CelestialMod.MOD_ID, id));
    }
}
