package net.kejax.advanced_refinery.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class WitherOnlyProofBlock extends Block {

    public WitherOnlyProofBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canEntityDestroy(BlockState state, BlockGetter level, BlockPos pos, Entity entity) {
        if (entity instanceof WitherBoss || entity instanceof WitherSkull) {
            return false;
        }
        return super.canEntityDestroy(state, level, pos, entity);
    }
}
