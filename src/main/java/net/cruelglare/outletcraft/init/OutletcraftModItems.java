
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cruelglare.outletcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.cruelglare.outletcraft.item.TestItem;
import net.cruelglare.outletcraft.OutletcraftMod;

public class OutletcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OutletcraftMod.MODID);
	public static final RegistryObject<Item> TEST_BUCKET = REGISTRY.register("test_bucket", () -> new TestItem());
}
