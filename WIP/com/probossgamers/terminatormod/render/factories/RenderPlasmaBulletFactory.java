package com.probossgamers.terminatormod.render.factories;

import com.probossgamers.terminatormod.models.ModelPlasmaBullet;
import com.probossgamers.terminatormod.render.RenderPlasmaBullet;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGelZombieFactory implements IRenderFactory<Entity> {

    public static final RenderGelZombieFactory INSTANCE = new RenderGelZombieFactory();

    @Override
    public Render<? super Entity> createRenderFor(RenderManager manager) {
        // TODO Auto-generated method stub
        return new RenderPlasmaBullet(manager, new ModelPlasmaBullet(), 1.0f);
    }

}