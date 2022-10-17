package com.snedhlep.trinketz.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class FireSword extends SwordItem {

    public FireSword() {
        super(new ToolTier(), 0, 0, new Properties());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player user, InteractionHand hand) {
        world.addFreshEntity(new LargeFireball(world, user, user.getX(), user.getY(), user.getZ(), 2));

        return super.use(world, user, hand);

    }
}
