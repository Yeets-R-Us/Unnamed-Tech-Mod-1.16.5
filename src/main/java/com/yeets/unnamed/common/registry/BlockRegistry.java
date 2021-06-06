package com.yeets.unnamed.common.registry;

import com.yeets.unnamed.common.UnnamedMod;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UnnamedMod.ModID);

    public static final RegistryObject<Block> METAL_PRESS = BLOCKS.register("metal_press", () -> new QuarryBlock());
}
