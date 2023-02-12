package com.rdfd.rdfd.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent YINDOUBAI = new FoodComponent.Builder().hunger(20).saturationModifier(10.0f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,114514,100),1.0f).meat().alwaysEdible().build();

}
