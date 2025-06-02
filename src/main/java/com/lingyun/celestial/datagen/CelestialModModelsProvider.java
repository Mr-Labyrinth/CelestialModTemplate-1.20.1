package com.lingyun.celestial.datagen;

import com.lingyun.celestial.block.CelestialModBlocks;
import com.lingyun.celestial.item.CelestialModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class CelestialModModelsProvider extends FabricModelProvider {
    public CelestialModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(CelestialModBlocks.STAR_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(CelestialModItems.STAR_VORTEX, Models.GENERATED);
        itemModelGenerator.register(CelestialModItems.RAW_STAR, Models.GENERATED);
        itemModelGenerator.register(CelestialModItems.STAR_GEL, Models.GENERATED);
    }
}
