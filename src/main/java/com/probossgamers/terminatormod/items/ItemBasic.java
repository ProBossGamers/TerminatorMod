package com.probossgamers.terminatormod.items;

import com.probossgamers.terminatormod.ModItems;
import com.probossgamers.terminatormod.creativetabs.TerminatorCreativeTab;
import net.minecraft.item.Item;

public class ItemBasic extends Item
{

    public ItemBasic(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModItems.tabTerminatorMod);
    }
}
