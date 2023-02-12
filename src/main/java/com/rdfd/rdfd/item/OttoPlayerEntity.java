package com.rdfd.rdfd.item;

import com.rdfd.rdfd.RDFD;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class OttoPlayerEntity extends BlockEntity {
    public OttoPlayerEntity(BlockPos pos, BlockState state) {
        super(RDFD.OTTO_PLAYER_ENTITY, pos, state);
    }
}
