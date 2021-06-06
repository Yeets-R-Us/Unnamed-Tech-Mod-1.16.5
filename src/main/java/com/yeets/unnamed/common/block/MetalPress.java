package com.yeets.unnamed.common.block;

import com.yeets.unnamed.common.registry.TileEntityRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class MetalPress extends Block{
    public MetalPress() {
        super(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).sound(SoundType.METAL).strength(15f, 5f));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityRegistry.QUARRY_TILE_ENTITY_TYPE.get().create();
    }
}
