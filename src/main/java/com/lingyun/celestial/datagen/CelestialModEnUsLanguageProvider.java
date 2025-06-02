package com.lingyun.celestial.datagen;

import com.lingyun.celestial.block.CelestialModBlocks;
import com.lingyun.celestial.item.CelestialModItemGroups;
import com.lingyun.celestial.item.CelestialModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CelestialModEnUsLanguageProvider extends FabricLanguageProvider {
    public CelestialModEnUsLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(CelestialModItems.STAR_VORTEX, "Star Vortex");
        translationBuilder.add(CelestialModItems.RAW_STAR, "Raw Star");
        translationBuilder.add(CelestialModItems.STAR_GEL, "Star Gel");

        translationBuilder.add(CelestialModBlocks.STAR_BLOCK, "Star Block");

        translationBuilder.add(CelestialModItemGroups.CELESTIAL_GROUP, "Celestial Mod");
    }
}
