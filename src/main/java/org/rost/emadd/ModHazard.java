package org.rost.emadd;

import org.rost.emadd.items.ModItems;
import org.rost.emadd.blocks.ModBlocks;
import com.hbm.hazard.HazardSystem;
import com.hbm.hazard.HazardRegistry;
import com.hbm.hazard.HazardData;
import com.hbm.hazard.type.HazardTypeBase;

public class ModHazard {

    public static final float em304 = 0.005F;
    public static final float em306 = 2.0F;
    public static final float em299 = 25.0F;
    public static final float em320p = 500.0F;
    public static final float em_slag = 288.0F;

    public static void mainRegistry() {
        regHazard();
    }

    private static void regHazard() {
    	HazardSystem.register(ModBlocks.block_em299, makeData(HazardRegistry.RADIATION, em299 * HazardRegistry.block));
    	HazardSystem.register(ModBlocks.block_em304, makeData(HazardRegistry.RADIATION, em304 * HazardRegistry.block));
    	HazardSystem.register(ModBlocks.block_em306, makeData(HazardRegistry.RADIATION, em306 * HazardRegistry.block));
    	HazardSystem.register(ModBlocks.block_em320p, makeData(HazardRegistry.RADIATION, em320p * HazardRegistry.block));

    	HazardSystem.register(ModItems.ingot_em299, makeData(HazardRegistry.RADIATION, em299 * HazardRegistry.ingot));
		HazardSystem.register(ModItems.ingot_em304, makeData(HazardRegistry.RADIATION, em304 * HazardRegistry.ingot));
		HazardSystem.register(ModItems.ingot_em306, makeData(HazardRegistry.RADIATION, em306 * HazardRegistry.ingot));
		HazardSystem.register(ModItems.ingot_em320p, makeData(HazardRegistry.RADIATION, em320p * HazardRegistry.ingot));

		HazardSystem.register(ModItems.powder_em299, makeData(HazardRegistry.RADIATION, em299 * HazardRegistry.powder));
		HazardSystem.register(ModItems.powder_em304, makeData(HazardRegistry.RADIATION, em304 * HazardRegistry.powder));
		HazardSystem.register(ModItems.powder_em306, makeData(HazardRegistry.RADIATION, em306 * HazardRegistry.powder));
		HazardSystem.register(ModItems.powder_em320p, makeData(HazardRegistry.RADIATION, em320p * HazardRegistry.powder));
    }

    private static HazardData makeData() { return new HazardData(); }
	private static HazardData makeData(HazardTypeBase hazard) { return new HazardData().addEntry(hazard); }
	private static HazardData makeData(HazardTypeBase hazard, float level) { return new HazardData().addEntry(hazard, level); }
	private static HazardData makeData(HazardTypeBase hazard, float level, boolean override) { return new HazardData().addEntry(hazard, level, override); }
}
