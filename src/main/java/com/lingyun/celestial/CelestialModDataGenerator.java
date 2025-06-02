package com.lingyun.celestial;

import com.lingyun.celestial.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CelestialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CelestialModblockTagsProvider::new);
		pack.addProvider(CelestialModEnUsLanguageProvider::new);
		pack.addProvider(CelestialModItemTagsProvider::new);
		pack.addProvider(CelestialModLootTableProvider::new);
		pack.addProvider(CelestialModModelsProvider::new);
		pack.addProvider(CelestialModRecipesProvider::new);
		pack.addProvider(CelestialModZhCnLanguageProvider::new);
	}
}
