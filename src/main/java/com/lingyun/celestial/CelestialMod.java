package com.lingyun.celestial;

import com.lingyun.celestial.block.CelestialModBlocks;
import com.lingyun.celestial.item.CelestialModItemGroups;
import com.lingyun.celestial.item.CelestialModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CelestialMod implements ModInitializer {
	public static final String MOD_ID = "celestial-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		CelestialModItems.registerItems();// 物品注册初始化

		CelestialModItemGroups.registerGroups();// 物品栏辅助注册方法

		CelestialModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}