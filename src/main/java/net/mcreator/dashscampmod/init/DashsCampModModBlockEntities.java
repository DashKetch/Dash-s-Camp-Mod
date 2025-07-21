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

import net.mcreator.dashscampmod.block.entity.RightMultiBlockCore2BlockEntity;
import net.mcreator.dashscampmod.block.entity.RightMultiBlock2BlockEntity;
import net.mcreator.dashscampmod.block.entity.LeftMultiBlockCore1BlockEntity;
import net.mcreator.dashscampmod.block.entity.LeftMultiBlock1BlockEntity;
import net.mcreator.dashscampmod.block.entity.GrillCoalBlockEntity;
import net.mcreator.dashscampmod.block.entity.CenterMultiBlockCore3BlockEntity;
import net.mcreator.dashscampmod.block.entity.CenterMultiBlock3BlockEntity;
import net.mcreator.dashscampmod.DashsCampModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DashsCampModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DashsCampModMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrillCoalBlockEntity>> BOTTOM_GRILL_COAL = register("bottom_grill_coal", DashsCampModModBlocks.BOTTOM_GRILL_COAL, GrillCoalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LeftMultiBlock1BlockEntity>> LEFT_MULTI_BLOCK_1 = register("left_multi_block_1", DashsCampModModBlocks.LEFT_MULTI_BLOCK_1, LeftMultiBlock1BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RightMultiBlock2BlockEntity>> RIGHT_MULTI_BLOCK_2 = register("right_multi_block_2", DashsCampModModBlocks.RIGHT_MULTI_BLOCK_2, RightMultiBlock2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LeftMultiBlockCore1BlockEntity>> LEFT_MULTI_BLOCK_CORE_1 = register("left_multi_block_core_1", DashsCampModModBlocks.LEFT_MULTI_BLOCK_CORE_1,
			LeftMultiBlockCore1BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RightMultiBlockCore2BlockEntity>> RIGHT_MULTI_BLOCK_CORE_2 = register("right_multi_block_core_2", DashsCampModModBlocks.RIGHT_MULTI_BLOCK_CORE_2,
			RightMultiBlockCore2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CenterMultiBlock3BlockEntity>> CENTER_MULTI_BLOCK_3 = register("center_multi_block_3", DashsCampModModBlocks.CENTER_MULTI_BLOCK_3, CenterMultiBlock3BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CenterMultiBlockCore3BlockEntity>> CENTER_MULTI_BLOCK_CORE_3 = register("center_multi_block_core_3", DashsCampModModBlocks.CENTER_MULTI_BLOCK_CORE_3,
			CenterMultiBlockCore3BlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BOTTOM_GRILL_COAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LEFT_MULTI_BLOCK_1.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RIGHT_MULTI_BLOCK_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LEFT_MULTI_BLOCK_CORE_1.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RIGHT_MULTI_BLOCK_CORE_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CENTER_MULTI_BLOCK_3.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CENTER_MULTI_BLOCK_CORE_3.get(), SidedInvWrapper::new);
	}
}