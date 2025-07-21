/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dashscampmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.dashscampmod.block.RightMultiBlockCore2Block;
import net.mcreator.dashscampmod.block.RightMultiBlock2Block;
import net.mcreator.dashscampmod.block.LeftMultiBlockCore1Block;
import net.mcreator.dashscampmod.block.LeftMultiBlock1Block;
import net.mcreator.dashscampmod.block.GrillCoalBlock;
import net.mcreator.dashscampmod.block.CenterMultiBlockCore3Block;
import net.mcreator.dashscampmod.block.CenterMultiBlock3Block;
import net.mcreator.dashscampmod.DashsCampModMod;

import java.util.function.Function;

public class DashsCampModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DashsCampModMod.MODID);
	public static final DeferredBlock<Block> BOTTOM_GRILL_COAL = register("bottom_grill_coal", GrillCoalBlock::new);
	public static final DeferredBlock<Block> LEFT_MULTI_BLOCK_1 = register("left_multi_block_1", LeftMultiBlock1Block::new);
	public static final DeferredBlock<Block> RIGHT_MULTI_BLOCK_2 = register("right_multi_block_2", RightMultiBlock2Block::new);
	public static final DeferredBlock<Block> LEFT_MULTI_BLOCK_CORE_1 = register("left_multi_block_core_1", LeftMultiBlockCore1Block::new);
	public static final DeferredBlock<Block> RIGHT_MULTI_BLOCK_CORE_2 = register("right_multi_block_core_2", RightMultiBlockCore2Block::new);
	public static final DeferredBlock<Block> CENTER_MULTI_BLOCK_3 = register("center_multi_block_3", CenterMultiBlock3Block::new);
	public static final DeferredBlock<Block> CENTER_MULTI_BLOCK_CORE_3 = register("center_multi_block_core_3", CenterMultiBlockCore3Block::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}