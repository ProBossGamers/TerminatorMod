package com.probossgamers.terminatormod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TerminatorCreativeTab extends CreativeTabs
{
    public TerminatorCreativeTab()
    {
        super("terminatorTab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.APPLE);
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
}
