package com.yeets.unnamed.common;

import javax.annotation.Nonnull;

import com.yeets.unnamed.common.registry.UnnamedItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class UnnamedItemGroup extends ItemGroup {

    public static final UnnamedItemGroup UNNAMED_MOD = new UnnamedItemGroup(ItemGroup.TABS.length,
            "unnamed_mod");

    public UnnamedItemGroup(int index, String label) {
        super(index, label);
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(UnnamedItems.EXAMPLE_ITEM.get());
    }
}
