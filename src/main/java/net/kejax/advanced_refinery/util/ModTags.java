package net.kejax.advanced_refinery.util;

import net.kejax.advanced_refinery.AdvancedRefinery;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");

        public static final TagKey<Block> IS_VALUABLE_ORE = tag("is_valuable_ore");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AdvancedRefinery.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> SAPPHIRE_TOOL = tag("sapphire_tool");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(AdvancedRefinery.MOD_ID, name));
        }

    }
}
