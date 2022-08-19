
package net.cruelglare.outletcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.cruelglare.outletcraft.init.OutletcraftModFluids;

public class TestItem extends BucketItem {
	public TestItem() {
		super(OutletcraftModFluids.TEST,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
