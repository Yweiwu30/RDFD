package com.rdfd.rdfd.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class BlackCatWitherItem extends Item {
	public BlackCatWitherItem(Settings settings) {
		super(settings);
	}

	public static final FoodComponent BLACK_CAT_WITHER = new FoodComponent.Builder().hunger(6).saturationModifier(0f)
			.statusEffect(new StatusEffectInstance(StatusEffects.WITHER,5,60),1.0f)
			.meat().alwaysEdible().build();

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
		tooltip.add(Text.translatable("item.rdfd.blackcatwither.tooltip0"));
		tooltip.add(Text.translatable("item.rdfd.blackcatwither.tooltip1"));
	}
}
