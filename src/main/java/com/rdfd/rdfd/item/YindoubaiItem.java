package com.rdfd.rdfd.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.lang.reflect.Type;

public class YindoubaiItem extends Item {
    public YindoubaiItem(Settings settings) {
        super(settings);
    }
    public static final FoodComponent YINDOUBAI = new FoodComponent.Builder().hunger(20).saturationModifier(20.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,114514,99),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1,150),1.0f)
            .meat().alwaysEdible().build();
}