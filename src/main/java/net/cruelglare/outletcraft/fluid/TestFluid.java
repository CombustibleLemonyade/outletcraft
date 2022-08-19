
package net.cruelglare.outletcraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.cruelglare.outletcraft.init.OutletcraftModItems;
import net.cruelglare.outletcraft.init.OutletcraftModFluids;
import net.cruelglare.outletcraft.init.OutletcraftModBlocks;

public abstract class TestFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(OutletcraftModFluids.TEST,
			OutletcraftModFluids.FLOWING_TEST,
			FluidAttributes.builder(new ResourceLocation("outletcraft:blocks/ttxx"), new ResourceLocation("outletcraft:blocks/ttxx"))

	).explosionResistance(100f)

			.bucket(OutletcraftModItems.TEST_BUCKET).block(() -> (LiquidBlock) OutletcraftModBlocks.TEST.get());

	private TestFluid() {
		super(PROPERTIES);
	}

	public static class Source extends TestFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends TestFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
