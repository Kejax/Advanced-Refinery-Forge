package net.kejax.advanced_refinery.block.entity;

import net.kejax.advanced_refinery.AdvancedRefinery;
import net.kejax.advanced_refinery.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AdvancedRefinery.MOD_ID);


    public static final RegistryObject<BlockEntityType<GemPolishingStationBlockEntity>> GEM_POLISHING_BE =
            BLOCK_ENTIES.register("gem_polishing_be", () ->
                    BlockEntityType.Builder.of(GemPolishingStationBlockEntity::new,
                            ModBlocks.GEM_POLISHING_STATION.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTIES.register(eventBus);
    }

}
