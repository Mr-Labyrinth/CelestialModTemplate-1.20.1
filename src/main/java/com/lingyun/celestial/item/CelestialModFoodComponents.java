package com.lingyun.celestial.item;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class CelestialModFoodComponents {
    public static final FoodComponent STAR_GEL = new FoodComponent.Builder().hunger(4).saturationModifier(0.7F)
            // 添加效果。
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1), 1.0F)
            // 食物可以一只被食用。
            .alwaysEdible()
            // 食物是使用时间短。
            .snack()
            .build();
}
