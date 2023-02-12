package com.rdfd.rdfd;

import com.rdfd.rdfd.item.Megaphoneitem;
import com.rdfd.rdfd.item.ModFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.impl.registry.sync.FabricRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.commons.logging.Log;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class RDFD implements  ModInitializer {
    public static final String MOD_ID = "rdfd";
    public static final Logger LOGGER = LoggerFactory.getLogger("RDFD");

    public static final Item YINDOUBAI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.YINDOUBAI));
    public static final Item MEGAPHONE = new Megaphoneitem(new Item.Settings().group(ItemGroup.MISC).maxCount(1));

    public static final ItemGroup RDFD_GROUP = FabricItemGroupBuilder.create(
            new Identifier("rdfd", "rdfd_group"))
            .icon(() -> new ItemStack(RDFD.YINDOUBAI))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(RDFD.YINDOUBAI));
                stacks.add(new ItemStack(RDFD.MEGAPHONE));
            })
            .build();
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("rdfd", "yindoubai"), YINDOUBAI);
        Registry.register(Registry.ITEM, new Identifier("rdfd", "megaphone"), MEGAPHONE);

    }
}
