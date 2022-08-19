
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cruelglare.outletcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.cruelglare.outletcraft.block.TestBlock;
import net.cruelglare.outletcraft.OutletcraftMod;

public class OutletcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OutletcraftMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
}
