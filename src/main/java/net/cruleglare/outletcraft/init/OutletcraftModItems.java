
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cruleglare.outletcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.cruleglare.outletcraft.item.MinephoneItem;
import net.cruleglare.outletcraft.OutletcraftMod;

public class OutletcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OutletcraftMod.MODID);
	public static final RegistryObject<Item> OUTLET = block(OutletcraftModBlocks.OUTLET, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MINEPHONE = REGISTRY.register("minephone", () -> new MinephoneItem());
	public static final RegistryObject<Item> MINECRAP = block(OutletcraftModBlocks.MINECRAP, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
