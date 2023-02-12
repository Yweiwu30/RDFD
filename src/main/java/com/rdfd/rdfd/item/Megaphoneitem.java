package com.rdfd.rdfd.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Megaphoneitem extends Item {

    public Megaphoneitem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        say(user);
        user.getItemCooldownManager().set(this, 20);
        return super.use(world, user, hand);
    }

    private void say(PlayerEntity uesr) {
        uesr.sendMessage(Text.literal("ECHO"));
    }
}
