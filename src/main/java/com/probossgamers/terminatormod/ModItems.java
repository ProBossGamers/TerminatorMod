package com.probossgamers.terminatormod;

import com.probossgamers.terminatormod.creativetabs.TerminatorCreativeTab;
import com.probossgamers.terminatormod.items.ItemBasic;
import com.probossgamers.terminatormod.items.ItemPlasmaBullet;
import com.probossgamers.terminatormod.items.ItemPlasmaRifle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

/**
 * The type Mod items.
 */
public class ModItems
{
    //static Item tutorialItem;
    public static Item plasmaBullet;
    public static Item plasmaRifle;

    public static final CreativeTabs tabTerminatorMod = new TerminatorCreativeTab();
    /**
     * The init method creates instances
     * of every item and defines their unique
     * properties.
     *
     */
    public static void init() {

      plasmaBullet = new ItemPlasmaBullet("plasma_bullet");
      plasmaRifle = new ItemPlasmaRifle("plasma_rifle");
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(plasmaBullet);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(plasmaBullet);
    }

    /*
     * This method allows every single item
     * to be rendered properly on screen; whether it is in
     * the inventory, equipped, or in the world.
     */
    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}
