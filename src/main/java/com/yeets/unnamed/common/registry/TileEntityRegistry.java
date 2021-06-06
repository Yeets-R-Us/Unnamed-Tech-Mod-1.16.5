package com.yeets.unnamed.common.registry;

import com.yeets.unnamed.common.UnnamedMod;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityRegistry {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
            .create(ForgeRegistries.TILE_ENTITIES, UnnamedMod.ModID);

    public static final RegistryObject<TileEntityType<MetalPressTileEntity>> METAL_PRESS_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("metal_press",
                    () -> TileEntityType.Builder.of(MetalPressTileEntity::new, BlockRegistry.METAL_PRESS.get()).build(null));
}
