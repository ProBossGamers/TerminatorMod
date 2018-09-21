package com.probossgamers.terminatormod;

import com.probossgamers.terminatormod.util.Reference;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TerminatorMod
{


    private static Logger logger;

    @Mod.Instance
    public static TerminatorMod instance;

    /*
     * PreInitialization - "Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry."
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //System.out.println(Reference.MODID + ":preInit");
        ModItems.init();

    }

    /*
     * Initialization - "Do your mod setup. Build whatever data structures you care about. Register recipes."
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
       // System.out.println(Reference.MODID + ":init");
    }

    /*
     * PostInitialization -  "Handle interaction with other mods, complete your setup based on this.
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
       // System.out.println(Reference.MODID + ":postInit");
    }
}
