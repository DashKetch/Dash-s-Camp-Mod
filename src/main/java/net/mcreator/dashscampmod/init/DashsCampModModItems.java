/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dashscampmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.dashscampmod.item.WhiteFabricItem;
import net.mcreator.dashscampmod.DashsCampModMod;

import java.util.function.Function;

public class DashsCampModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DashsCampModMod.MODID);
	public static final DeferredItem<Item> WHITE_FABRIC = register("white_fabric", WhiteFabricItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}