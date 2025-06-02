package com.lingyun.celestial.datagen;

import com.lingyun.celestial.block.CelestialModBlocks;
import com.lingyun.celestial.item.CelestialModItemGroups;
import com.lingyun.celestial.item.CelestialModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CelestialModZhCnLanguageProvider extends FabricLanguageProvider {
    public CelestialModZhCnLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(CelestialModItems.STAR_VORTEX, "星云旋涡");
        translationBuilder.add(CelestialModItems.RAW_STAR, "星云原矿");
        translationBuilder.add(CelestialModItems.STAR_GEL, "星云凝胶");

        translationBuilder.add(CelestialModBlocks.STAR_BLOCK, "星辰块");

        translationBuilder.add(CelestialModItemGroups.CELESTIAL_GROUP, "天祸人灾");
    }
}
