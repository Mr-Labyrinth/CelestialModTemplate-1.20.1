package com.lingyun.celestial.mixin;

import com.lingyun.celestial.item.CelestialModItems;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(AbstractFurnaceBlockEntity.class)
public class AbstractFurnaceBlockEntityMixin {
    // 这里method后面添加的是需要拦截的函数。
    // @At的参数意思是添加的位置,这里意思是添加到尾部。
    @Inject(method = "createFuelTimeMap", at = @At("TAIL"))

    // 注意这里put的第二个参数是时间，单位是tick（1/20秒），最大值是32767。
    private static void addFuelItem(CallbackInfoReturnable<Map<Item, Integer>> cir){
        cir.getReturnValue().put(CelestialModItems.STAR_GEL, 30000);
    }
}
