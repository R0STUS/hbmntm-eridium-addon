package org.rost.emadd;

import org.rost.emadd.items.ModItems;
import org.rost.emadd.blocks.ModBlocks;
import org.rost.emadd.fluids.ModFluids;
import org.rost.emadd.ModHazard;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = EmAdd.MODID, version = EmAdd.VERSION)
public class EmAdd {
    public static final String MODID = "emadd";
    public static final String VERSION = "0.0.0";
    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModItems.mainRegistry();
        ModBlocks.mainRegistry();
        ModFluids.mainRegistry();
        ModHazard.mainRegistry();
    }
}
