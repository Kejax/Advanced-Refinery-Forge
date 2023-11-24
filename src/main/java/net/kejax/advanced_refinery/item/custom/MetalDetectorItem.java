package net.kejax.advanced_refinery.item.custom;

import net.kejax.advanced_refinery.block.ModBlocks;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        if (!pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState state = pContext.getLevel().getBlockState(positionClicked.below(i));

                if (isValuableBlock(state)) {
                    outPutValuableCoordinates(positionClicked.below(i), player, state.getBlock());
                    foundBlock = true;

                    break;
                }
            }

            if(!foundBlock) {
                player.sendSystemMessage(Component.literal("No valuable blocks found!"));
            }

        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("item.advanced_refinery.metal_detector.lore"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    private void outPutValuableCoordinates(BlockPos blockPos, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Found " + I18n.get(block.getDescriptionId()) + " at " + "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"));
    }

    private boolean isValuableBlock(BlockState state) {
        return state.is(ModBlocks.SAPPHIRE_ORE.get()) || state.is(Blocks.DIAMOND_ORE) || state.is(Blocks.IRON_ORE) || state.is(Blocks.REDSTONE_ORE) || state.is(Blocks.GOLD_ORE);
    }
}
