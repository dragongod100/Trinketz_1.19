package com.snedhlep.trinketz.entity.projectile;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class VirusFireball extends Fireball {
    public VirusFireball(EntityType<? extends Fireball> p_37006_, Level p_37007_) {
        super(p_37006_, p_37007_);
    }

    public VirusFireball(EntityType<? extends Fireball> p_36990_, double p_36991_, double p_36992_, double p_36993_, double p_36994_, double p_36995_, double p_36996_, Level p_36997_) {
        super(p_36990_, p_36991_, p_36992_, p_36993_, p_36994_, p_36995_, p_36996_, p_36997_);
    }

    public VirusFireball(EntityType<? extends Fireball> p_36999_, LivingEntity p_37000_, double p_37001_, double p_37002_, double p_37003_, Level p_37004_) {
        super(p_36999_, p_37000_, p_37001_, p_37002_, p_37003_, p_37004_);
    }

    @Override
    protected void onHitEntity(EntityHitResult p_37259_) {

    }

    @Override
    protected void onHitBlock(BlockHitResult p_37258_) {

    }

    @Override
    public boolean hurt(DamageSource p_36839_, float p_36840_) {
        return false;
    }
}
