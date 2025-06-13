package net.kejax.advanced_refinery.item;

import net.kejax.advanced_refinery.AdvancedRefinery;
import net.kejax.advanced_refinery.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdvancedRefinery.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("test_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.advanced_refinery.main"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .displayItems((pParameters, pOutput) -> {

                        // Sapphire Items
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());

                        // Ruby Items
                        pOutput.accept(ModItems.RUBY.get());

                        // Ores and Mineral Blocks
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());

                        // Useful Blocks
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModBlocks.WITHER_PROOF_BLOCK.get());

                        // Food
                        pOutput.accept(ModItems.STRAWBERRY.get());

                        // Misc
                        pOutput.accept(ModItems.HAMMER.get());
                        pOutput.accept(ModItems.PINE_CONE.get());

                        // Machines
                        pOutput.accept(ModBlocks.GEM_POLISHING_STATION.get());

                        // Creative Items / Blocks
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
