package org.rost.emadd.fluids;

import com.hbm.inventory.fluid.FluidType;
import com.hbm.inventory.fluid.Fluids;
import com.hbm.inventory.fluid.trait.FT_Corrosive;
import com.hbm.inventory.fluid.trait.FT_VentRadiation;
import com.hbm.render.util.EnumSymbol;

public class ModFluids {

    public static FluidType EM_SLAG;

    public static void mainRegistry() {
        initFluids();
    }

    private static void initFluids() {
	    EM_SLAG = new FluidType("EM_SLAG", 0x34005A, 4, 0, 4, EnumSymbol.RADIATION).addTraits(new FT_VentRadiation(1.0F), new FT_Corrosive(30), Fluids.LIQUID);

		Fluids.metaOrder.add(EM_SLAG);
    }
}
