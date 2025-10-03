package org.rost.emadd.blocks;

import org.rost.emadd.EmAdd;
import com.hbm.main.MainRegistry;
import com.hbm.blocks.generic.BlockGeneric;
import com.hbm.blocks.generic.BlockCluster;
import com.hbm.blocks.generic.BlockHazard;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block ore_eridium;
    public static Block cluster_eridium;
    public static Block block_em299;
    public static Block block_em304;
    public static Block block_em306;
    public static Block block_em312;
    public static Block block_em320p;

    public static void mainRegistry() {
        initBlocks();
        regBlocks();
    }

    private static void initBlocks() {
		block_em299 = new BlockHazard().makeBeaconable().setBlockName("block_em299").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(50.0F).setBlockTextureName(EmAdd.MODID + ":block_em299");
		block_em304 = new BlockHazard().makeBeaconable().setBlockName("block_em304").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(50.0F).setBlockTextureName(EmAdd.MODID + ":block_em304");
		block_em306 = new BlockHazard().makeBeaconable().setBlockName("block_em306").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(50.0F).setBlockTextureName(EmAdd.MODID + ":block_em306");
		block_em312 = new BlockHazard().makeBeaconable().setBlockName("block_em312").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(50.0F).setBlockTextureName(EmAdd.MODID + ":block_em312");
		block_em320p = new BlockHazard().makeBeaconable().setBlockName("block_em320p").setCreativeTab(MainRegistry.blockTab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(50.0F).setBlockTextureName(EmAdd.MODID + ":block_em320p");
		cluster_eridium = new BlockCluster(Material.rock).setBlockName("cluster_eridium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(15.0F).setBlockTextureName(EmAdd.MODID + ":cluster_eridium");
		ore_eridium = new BlockGeneric(Material.rock).setBlockName("ore_eridium").setCreativeTab(MainRegistry.blockTab).setHardness(5.0F).setResistance(10.0F).setBlockTextureName(EmAdd.MODID + ":ore_eridium");
    }

    private static void regBlocks() {
		GameRegistry.registerBlock(block_em299, block_em299.getUnlocalizedName());
		GameRegistry.registerBlock(block_em304, block_em304.getUnlocalizedName());
		GameRegistry.registerBlock(block_em306, block_em306.getUnlocalizedName());
		GameRegistry.registerBlock(block_em312, block_em312.getUnlocalizedName());
		GameRegistry.registerBlock(block_em320p, block_em320p.getUnlocalizedName());
		GameRegistry.registerBlock(cluster_eridium, cluster_eridium.getUnlocalizedName());
		GameRegistry.registerBlock(ore_eridium, ore_eridium.getUnlocalizedName());
    }
}
