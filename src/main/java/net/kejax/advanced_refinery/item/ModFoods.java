package net.kejax.advanced_refinery.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.2F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 40), 1.0F).build();

}
