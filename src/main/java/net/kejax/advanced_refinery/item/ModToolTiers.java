package net.kejax.advanced_refinery.item;

import net.kejax.advanced_refinery.AdvancedRefinery;
import net.kejax.advanced_refinery.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 2048, 10.0F, 4, 15, ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(AdvancedRefinery.MOD_ID, "sapphire"), List.of(Tiers.DIAMOND),
            List.of(Tiers.NETHERITE)
    );

}
