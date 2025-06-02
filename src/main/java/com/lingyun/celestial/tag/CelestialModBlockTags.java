package com.lingyun.celestial.tag;

import com.lingyun.celestial.CelestialMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CelestialModBlockTags {
    public static final TagKey<Block> CELESTIAL_BLOCKS = of("celestial_blocks");

    public static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(CelestialMod.MOD_ID, id));
    }
}
