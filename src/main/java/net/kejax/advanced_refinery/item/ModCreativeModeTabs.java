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
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
