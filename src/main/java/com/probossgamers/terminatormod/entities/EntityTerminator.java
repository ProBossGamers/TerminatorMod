package com.probossgamers.terminatormod.entities;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityTerminator extends EntityMob
{

    public EntityTerminator(World worldIn)
    {
        super(worldIn);
    }

    // you don't have to call this as it is called automatically during EntityLiving subclass creation
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();

        // standard attributes registered to EntityLivingBase
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
        getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);

        // need to register any additional attributes
        getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
    }

    /*
    @Override
    public boolean attackEntityAsMob(Entity entityTarget)
    {
        float attackDamage = (float)getEntityAttribute(SharedMonsterAttributes
                .ATTACK_DAMAGE).getAttributeValue();
        int knockbackModifier = 0;

        if (entityTarget instanceof EntityLivingBase)
        {
            attackDamage += EnchantmentHelper.getEnchantmentModifierLiving(this,
                    (EntityLivingBase)entityTarget);
            knockbackModifier  += EnchantmentHelper.getKnockbackModifier(this,
                    (EntityLivingBase)entityTarget);
        }

        boolean isTargetHurt = entityTarget.attackEntityFrom(DamageSource
                .causeMobDamage(this), attackDamage);

        if (wasDamageDone)
        {
            if (knockbackModifier  > 0)
            {
                entityTarget.addVelocity((double)(-MathHelper.sin(rotationYaw *
                                (float)Math.PI / 180.0F) * (float)knockbackModifier  * 0.5F),
                        0.1D, (double)(MathHelper.cos(rotationYaw *
                                (float)Math.PI / 180.0F) * (float)knockbackModifier  * 0.5F));
                motionX *= 0.6D;
                motionZ *= 0.6D;
            }

            int fireModifier = EnchantmentHelper.getFireAspectModifier(this);

            if (fireModifier > 0)
            {
                entityTarget.setFire(fireModifier * 4);
            }

            // I copied these enchantments from EntityMob, not sure what they do
            if (entityTarget instanceof EntityLivingBase)
            {
                EnchantmentHelper.func_151384_a((EntityLivingBase)entityTarget, this);
            }

            EnchantmentHelper.func_151385_b(this, entityTarget);
        }

        return isTargetHurt ;
    }
    */

}
