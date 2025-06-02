package com.lingyun.celestial.item;

import com.lingyun.celestial.CelestialMod;
import com.lingyun.celestial.block.CelestialModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CelestialModItemGroups {
    public static final RegistryKey<ItemGroup> CELESTIAL_GROUP = register("celestial_group");

    private static RegistryKey<ItemGroup> register(String id){
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(CelestialMod.MOD_ID, id));
    }

    public static void registerGroups(){
        Registry.register(
                Registries.ITEM_GROUP,
                CELESTIAL_GROUP,
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.celestial_group"))
                        .icon(() -> new ItemStack(CelestialModItems.STAR_VORTEX))
                        .entries((displayContext, entries) -> {
                            // 这里添加物品
                            entries.add(CelestialModItems.STAR_VORTEX);
                            entries.add(CelestialModBlocks.STAR_BLOCK);
                            entries.add(CelestialModItems.RAW_STAR);
                            entries.add(CelestialModItems.STAR_GEL);
                        }).build());
    }
}
