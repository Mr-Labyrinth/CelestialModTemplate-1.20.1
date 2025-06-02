package com.lingyun.celestial.datagen;

import com.lingyun.celestial.CelestialMod;
import com.lingyun.celestial.block.CelestialModBlocks;
import com.lingyun.celestial.item.CelestialModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class CelestialModRecipesProvider extends FabricRecipeProvider {
    public CelestialModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> STAR_VORTEX = List.of(CelestialModItems.RAW_STAR);
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, CelestialModItems.STAR_VORTEX,
                RecipeCategory.BUILDING_BLOCKS, CelestialModBlocks.STAR_BLOCK);

        offerSmelting(exporter, STAR_VORTEX, RecipeCategory.MISC, CelestialModItems.STAR_VORTEX, 0.7f, 200, "star_vortex");
        offerBlasting(exporter, STAR_VORTEX, RecipeCategory.MISC, CelestialModItems.STAR_VORTEX, 0.7f, 100, "star_vortex");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CelestialModItems.RAW_STAR,1 )
                .input(CelestialModItems.STAR_VORTEX)
                .input(Items.STONE)
                .criterion(hasItem(CelestialModItems.STAR_VORTEX), conditionsFromItem(CelestialModItems.STAR_VORTEX))
                .offerTo(exporter, new Identifier(CelestialMod.MOD_ID, "raw_star"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.SUGAR, 2)
                .pattern("###")
                .input('#', Items.BEETROOT)
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, new Identifier(CelestialMod.MOD_ID, "beetroot_sugar"));

    }
}
