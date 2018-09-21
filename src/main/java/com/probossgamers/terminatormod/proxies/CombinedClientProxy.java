package com.probossgamers.terminatormod.proxies;

import com.probossgamers.terminatormod.entities.EntityPlasmaBullet;
import com.probossgamers.terminatormod.models.ModelPlasmaBullet;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * The methods here only get called if they are running on
 * a normal Minecraft client.
 */
public class CombinedClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        /*
         * This is where I would put the renderer if I had one
         */
    }


    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
