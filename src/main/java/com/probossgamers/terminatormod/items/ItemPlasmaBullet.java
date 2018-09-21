package com.probossgamers.terminatormod.items;

import com.probossgamers.terminatormod.entities.EntityPlasmaBullet;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPlasmaBullet extends ItemBasic
{

    public ItemPlasmaBullet(String name)
    {
        super(name);
    }

    public EntityPlasmaBullet createProjectile(World worldIn, ItemStack stack, EntityLivingBase shooter)
    {
        EntityPlasmaBullet entitytippedarrow = new EntityPlasmaBullet(worldIn, shooter);
        //entitytippedarrow.setPotionEffect(stack);
        return entitytippedarrow;
    }

    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
    {
        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
        return enchant > 0 && this.getClass() == ItemPlasmaBullet.class;
    }


}
