package com.probossgamers.terminatormod;

import com.probossgamers.terminatormod.entities.EntityPlasmaBullet;
import com.probossgamers.terminatormod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

public class ModEntities
{
    private static int ID;

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event)
    {
        EntityEntry entry = EntityEntryBuilder.create()
                .entity(EntityPlasmaBullet.class)
                .id(new ResourceLocation(Reference.MODID), ID++).name("my_entity")
            .egg(0xFFFFFF, 0xAAAAAA)
            .tracker(64, 20, false)
            .build();
        event.getRegistry().register(entry);
    }
}
