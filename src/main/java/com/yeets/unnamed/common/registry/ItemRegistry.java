package com.yeets.unnamed.common.registry;


import com.yeets.unnamed.common.UnnamedItemGroup;
import com.yeets.unnamed.common.UnnamedMod;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnnamedMod.ModID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties().tab(UnnamedItemGroup.UNNAMED_MOD).rarity(Rarity.RARE)));
}