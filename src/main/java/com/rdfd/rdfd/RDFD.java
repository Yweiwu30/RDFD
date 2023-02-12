package com.rdfd.rdfd;

import com.rdfd.rdfd.item.MegaphoneItem;
import com.rdfd.rdfd.item.ModFoodComponents;
import com.rdfd.rdfd.item.OttoPlayer;
import com.rdfd.rdfd.item.OttoPlayerEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.impl.registry.sync.FabricRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
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

    public static final ItemGroup RDFD_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("rdfd", "rdfd_group"))
            .icon(() -> new ItemStack(RDFD.YINDOUBAI)).build();

    public static final Item YINDOUBAI = new Item(new Item.Settings()
            .group(RDFD.RDFD_GROUP).food(ModFoodComponents.YINDOUBAI));
    public static final Item MEGAPHONE = new MegaphoneItem(new Item.Settings().group(RDFD.RDFD_GROUP).maxCount(1));
    public static final OttoPlayer OTTO_PLAYER = new OttoPlayer(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    public static BlockEntityType<OttoPlayerEntity> OTTO_PLAYER_ENTITY;
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("rdfd", "yindoubai"), YINDOUBAI);
        Registry.register(Registry.ITEM, new Identifier("rdfd", "megaphone"), MEGAPHONE);
        Registry.register(Registry.BLOCK, new Identifier("rdfd", "otto_player"), OTTO_PLAYER);
        Registry.register(Registry.ITEM, new Identifier("rdfd", "otto_player"), new BlockItem(OTTO_PLAYER, new FabricItemSettings()));
        OTTO_PLAYER_ENTITY = Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                new Identifier("rdfd", "otto_player_entity"),
                FabricBlockEntityTypeBuilder.create(OttoPlayerEntity::new, OTTO_PLAYER).build()
        );
    }
}
