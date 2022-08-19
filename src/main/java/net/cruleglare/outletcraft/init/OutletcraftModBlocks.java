
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cruleglare.outletcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.cruleglare.outletcraft.block.OutletBlock;
import net.cruleglare.outletcraft.block.MinecrapBlock;
import net.cruleglare.outletcraft.OutletcraftMod;

public class OutletcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OutletcraftMod.MODID);
	public static final RegistryObject<Block> OUTLET = REGISTRY.register("outlet", () -> new OutletBlock());
	public static final RegistryObject<Block> MINECRAP = REGISTRY.register("minecrap", () -> new MinecrapBlock());
}
