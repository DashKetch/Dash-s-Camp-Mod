/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dashscampmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dashscampmod.DashsCampModMod;

public class DashsCampModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DashsCampModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FUNCTIONAL_CAMPING = REGISTRY.register("functional_camping",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dashs_camp_mod.functional_camping")).icon(() -> new ItemStack(Items.FISHING_ROD)).displayItems((parameters, tabData) -> {
				tabData.accept(DashsCampModModItems.WHITE_FABRIC.get());
				tabData.accept(DashsCampModModBlocks.GRILL_COAL.get().asItem());
			}).build());
}