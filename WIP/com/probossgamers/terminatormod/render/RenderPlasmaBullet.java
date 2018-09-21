package com.probossgamers.terminatormod.render;

import com.probossgamers.terminatormod.entities.EntityPlasmaBullet;
import com.probossgamers.terminatormod.models.ModelPlasmaBullet;
import com.probossgamers.terminatormod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderPlasmaBullet extends RenderL<EntityPlasmaBullet>
{
        protected ResourceLocation serpentTexture;

        public RenderPlasmaBullet(RenderManager renderManagerIn)
        {
            super(renderManagerIn, new ModelPlasmaBullet(), 1.0f);
            setEntityTexture();
        }

        @Override
        protected void preRenderCallback(EntityPlasmaBullet entity, float f)
        {
            preRenderCallbackSerpent((EntityPlasmaBullet) entity, f);
        }

        protected void preRenderCallbackSerpent(EntityPlasmaBullet entity, float f)
        {
            // some people do some G11 transformations or blends here, like you can do
            // GL11.glScalef(2F, 2F, 2F); to scale up the entity
            // which is used for Slime entities.  I suggest having the entity cast to
            // your custom type to make it easier to access fields from your
            // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor,
            // entity.scaleFactor);
        }

        protected void setEntityTexture()
        {
            serpentTexture = new ResourceLocation(Reference.MODID+":textures/entities/projectiles/plasmaBullet.png");
        }

        /**
         * Returns the location of an entity's texture. Doesn't seem to be called
         * unless you call Render.bindEntityTexture.
         */
        @Override
        protected ResourceLocation getEntityTexture(EntityPlasmaBullet par1Entity)
        {
            return serpentTexture;
        }
    }
}
