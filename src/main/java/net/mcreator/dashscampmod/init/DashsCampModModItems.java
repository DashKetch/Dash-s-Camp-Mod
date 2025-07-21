/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dashscampmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dashscampmod.item.WhiteFabricItem;
import net.mcreator.dashscampmod.DashsCampModMod;

import java.util.function.Function;

public class DashsCampModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DashsCampModMod.MODID);
	public static final DeferredItem<Item> WHITE_FABRIC = register("white_fabric", WhiteFabricItem::new);
	public static final DeferredItem<Item> GRILL_COAL = block(DashsCampModModBlocks.GRILL_COAL, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> LEFT_MULTI_BLOCK_1 = block(DashsCampModModBlocks.LEFT_MULTI_BLOCK_1);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}