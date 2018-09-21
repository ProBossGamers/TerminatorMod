package com.probossgamers.terminatormod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

/**
 * plasmabullet by Unknown
 */
@SideOnly(Side.CLIENT)
public class ModelPlasmaBullet extends ModelBase
{
    public ModelRenderer Plasma;

    public ModelPlasmaBullet()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.Plasma = new ModelRenderer(this, 0, 0);
        this.Plasma.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Plasma.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 6);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.Plasma.render(scale);
        GlStateManager.disableBlend();
    }

    public void setRotationAngles(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
