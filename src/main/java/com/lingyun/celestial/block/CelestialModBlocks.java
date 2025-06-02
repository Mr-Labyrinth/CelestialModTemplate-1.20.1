package com.lingyun.celestial.block;

import com.lingyun.celestial.CelestialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CelestialModBlocks {
    public static final Block STAR_BLOCK = register("star_block", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));


    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(CelestialMod.MOD_ID, id), block);

    }

    public static void registerBlockItems(String id, Block block){
        Registry.register(Registries.ITEM, new Identifier(CelestialMod.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){

    }
}
