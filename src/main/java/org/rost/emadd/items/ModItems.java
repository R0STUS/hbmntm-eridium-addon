package org.rost.emadd.items;

import org.rost.emadd.EmAdd;
import com.hbm.main.MainRegistry;
import com.hbm.hazard.HazardSystem;
import com.hbm.hazard.HazardRegistry;
import com.hbm.hazard.HazardData;
import com.hbm.hazard.type.HazardTypeBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final float em304 = 0.005F;
    public static final float em306 = 2.0F;
    public static final float em299 = 25.0F;
    public static final float em320p = 500000.0F;
    public static final float em_slag = 288.0F;

    public static Item ingot_em299;
    public static Item powder_em299;

    public static Item ingot_em304;
    public static Item powder_em304;

    public static Item ingot_em306;
    public static Item powder_em306;

    public static Item ingot_em312;
    public static Item powder_em312;

    public static Item ingot_em320p;
    public static Item powder_em320p;

    public static Item crystal_eridium;
    public static Item raw_eridium;
    public static Item powder_eridium;


	public static void mainRegistry() {
		initItems();
		regItems();
		regHazard();
	}

    private static void initItems() {
        ingot_em299 = new Item().setUnlocalizedName("ingot_em299").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":ingot_em299");
        powder_em299 = new Item().setUnlocalizedName("powder_em299").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":powder_em299");

        ingot_em304 = new Item().setUnlocalizedName("ingot_em304").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":ingot_em304");
        powder_em304 = new Item().setUnlocalizedName("powder_em304").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":powder_em304");

        ingot_em306 = new Item().setUnlocalizedName("ingot_em306").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":ingot_em306");
        powder_em306 = new Item().setUnlocalizedName("powder_em306").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":powder_em306");

        ingot_em312 = new Item().setUnlocalizedName("ingot_em312").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":ingot_em312");
        powder_em312 = new Item().setUnlocalizedName("powder_em312").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":powder_em312");

        ingot_em320p = new Item().setUnlocalizedName("ingot_em320p").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":ingot_em320p");
        powder_em320p = new Item().setUnlocalizedName("powder_em320p").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":powder_em320p");

        crystal_eridium = new Item().setUnlocalizedName("crystal_eridium").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":crystal_eridium");
        raw_eridium = new Item().setUnlocalizedName("raw_eridium").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":raw_eridium");
        powder_eridium = new Item().setUnlocalizedName("powder_eridium").setCreativeTab(MainRegistry.partsTab).setTextureName(EmAdd.MODID + ":powder_eridium");
    }

    private static void regHazard() {
    	HazardSystem.register(ingot_em299, makeData(HazardRegistry.RADIATION, em299 * HazardRegistry.ingot));
		HazardSystem.register(ingot_em304, makeData(HazardRegistry.RADIATION, em304 * HazardRegistry.ingot));
		HazardSystem.register(ingot_em306, makeData(HazardRegistry.RADIATION, em306 * HazardRegistry.ingot));
		HazardSystem.register(ingot_em320p, makeData(HazardRegistry.RADIATION, em320p * HazardRegistry.ingot));

		HazardSystem.register(powder_em299, makeData(HazardRegistry.RADIATION, em299 * HazardRegistry.powder));
		HazardSystem.register(powder_em304, makeData(HazardRegistry.RADIATION, em304 * HazardRegistry.powder));
		HazardSystem.register(powder_em306, makeData(HazardRegistry.RADIATION, em306 * HazardRegistry.powder));
		HazardSystem.register(powder_em320p, makeData(HazardRegistry.RADIATION, em320p * HazardRegistry.powder));
    }

    private static HazardData makeData() { return new HazardData(); }
	private static HazardData makeData(HazardTypeBase hazard) { return new HazardData().addEntry(hazard); }
	private static HazardData makeData(HazardTypeBase hazard, float level) { return new HazardData().addEntry(hazard, level); }
	private static HazardData makeData(HazardTypeBase hazard, float level, boolean override) { return new HazardData().addEntry(hazard, level, override); }

    private static void regItems() {
        GameRegistry.registerItem(ingot_em299, ingot_em299.getUnlocalizedName());
        GameRegistry.registerItem(powder_em299, powder_em299.getUnlocalizedName());

        GameRegistry.registerItem(ingot_em304, ingot_em304.getUnlocalizedName());
        GameRegistry.registerItem(powder_em304, powder_em304.getUnlocalizedName());

        GameRegistry.registerItem(ingot_em306, ingot_em306.getUnlocalizedName());
        GameRegistry.registerItem(powder_em306, powder_em306.getUnlocalizedName());

        GameRegistry.registerItem(ingot_em312, ingot_em312.getUnlocalizedName());
        GameRegistry.registerItem(powder_em312, powder_em312.getUnlocalizedName());

        GameRegistry.registerItem(ingot_em320p, ingot_em320p.getUnlocalizedName());
        GameRegistry.registerItem(powder_em320p, powder_em320p.getUnlocalizedName());

        GameRegistry.registerItem(crystal_eridium, crystal_eridium.getUnlocalizedName());
        GameRegistry.registerItem(raw_eridium, raw_eridium.getUnlocalizedName());
        GameRegistry.registerItem(powder_eridium, powder_eridium.getUnlocalizedName());
    }

}
