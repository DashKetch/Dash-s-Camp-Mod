/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dashscampmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.dashscampmod.block.entity.GrillCoalBlockEntity;
import net.mcreator.dashscampmod.DashsCampModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DashsCampModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DashsCampModMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrillCoalBlockEntity>> BOTTOM_GRILL_COAL = register("bottom_grill_coal", DashsCampModModBlocks.BOTTOM_GRILL_COAL, GrillCoalBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BOTTOM_GRILL_COAL.get(), SidedInvWrapper::new);
	}
}