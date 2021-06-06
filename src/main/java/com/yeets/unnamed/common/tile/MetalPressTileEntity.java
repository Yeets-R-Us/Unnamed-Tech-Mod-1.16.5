package com.yeets.unnamed.common.tile;

import com.yeets.unnamed.common.registry.TileEntityRegistry;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class MetalPressTileEntity extends TileEntity implements ITickableTileEntity {
    public MetalPressTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public MetalPressTileEntity() {
        this(TileEntityRegistry.METAL_PRESS_TILE_ENTITY_TYPE.get());
    }

    @Override
    public void tick() {

    }
}
