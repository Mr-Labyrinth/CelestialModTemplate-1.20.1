package com.lingyun.celestial.item;

import com.lingyun.celestial.CelestialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class CelestialModItems {
    // 以下是注册物品的代码
    public static final Item STAR_GEL = registerItem("star_gel", new Item(new Item.Settings().food(CelestialModFoodComponents.STAR_GEL)));

    public static final Item RAW_STAR = registerItem("raw_star",new Item(new Item.Settings()));

    public  static  final  Item STAR_VORTEX = registerItem("star_vortex",new Item(new Item.Settings()));


    // 以下是注册物品组的注册方法。
    public  static  Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(CelestialMod.MOD_ID,id)),item);
    }

    public  static  Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CelestialMod.MOD_ID,id),item);
    }

    public static Item register(String id, Item item) {
        return register(new Identifier(CelestialMod.MOD_ID,id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, key, item);
    }

    // 以下是将物品添到原版物品栏的方法。
    private static void addNaturalItemGroup(FabricItemGroupEntries entries){
        entries.add(STAR_VORTEX);
    }

    public  static void registerItems(){
        // 添加到自然物品栏
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(CelestialModItems::addNaturalItemGroup);
    }
}
