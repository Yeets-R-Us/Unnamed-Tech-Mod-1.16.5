package com.yeets.unnamed.common;

import com.yeets.unnamed.common.registry.UnnamedItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod("unnamedmod")
public class UnnamedMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String ModID = "unnamedmod";

    public UnnamedMod() {
        GeckoLib.initialize();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        //BlockInit.BLOCKS.register(bus);
        UnnamedItems.ITEMS.register(bus);
        //UnnamedTileEntityTypes.TILE_ENTITY_TYPE.register(bus);
        //ContainerTypesInit.CONTAINER_TYPES.register(bus);

       // MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
        MinecraftForge.EVENT_BUS.register(this);
    }
}