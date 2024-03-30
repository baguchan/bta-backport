package bdmajora.backport.block;

import bdmajora.backport.UtilIdRegistrar;
import bdmajora.backport.backport;
import bdmajora.backport.block.Door.*;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.item.Item;
import net.minecraft.core.sound.BlockSounds;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockAxisAligned;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import turniplabs.halplibe.helper.BlockBuilder;

public class ModBlocks {

	public static final Block blackStone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("blackstone_top.png")
		.setSideTextures("blackstone.png")
		.setBottomTexture("blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackStone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledPolishedBlackstone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_polished_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledPolishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedPolishedBlackstoneBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_polished_blackstone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedPolishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block gildedBlackstone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gilded_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("gildedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstoneBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_blackstone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedBlackstoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedBlackstone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_blackstone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedBlackstone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mushroomStem = new BlockBuilder(backport.MOD_ID)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mushroom_stem.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("mushroomStem",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crackedStoneBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledStoneBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("end_stone.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("endStone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block endStoneBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("end_stone_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("endStoneBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mycelium = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("my_celium_top.png")
		.setSideTextures("my_celium_side.png")
		.setBottomTexture("dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("mycelium",UtilIdRegistrar.nextIdBlock(),Material.grass));

	public static final Block emeraldOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("emerald_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("emeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateEmeraldOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("deepslate_emerald_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateEmeraldOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block emeraldBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("emerald_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("emeraldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledNetherBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedNetherBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cracked_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("netherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherGoldOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_gold_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new BlockNetherGoldOre("netherGoldOre", UtilIdRegistrar.nextIdBlock()));

	public static final Block netherQuartzOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_quartz_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("netherQuartzOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redNetherBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_nether_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redNetherBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block hayBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("hay_block_top.png")
		.setSideTextures("hay_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("hayBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block coarseDirt = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("coarse_dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("coarseDirt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block diorite = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("diorite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("diorite",UtilIdRegistrar.nextIdBlock(),Material.stone));
	public static final Block polishedDiorite = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_diorite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedDiorite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block andesite = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("andesite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("andesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedAndesite = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_andesite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedAndesite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purpur_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpurBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpurPillar = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("purpur_pillar_top.png")
		.setSideTextures("purpur_pillar.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpurPillar",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherWartBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("nether_wart_block.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("netherWartBlock",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block warpedWartBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("warped_wart_block.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("warpedWartBlock",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block boneBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.DEFAULT)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("bone_block_top.png")
		.setSideTextures("bone_block_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("boneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block nylium = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("crimson_nylium.png")
		.setSideTextures("crimson_nylium_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, ModBlockTags.GROWS_NETHER_PLANTS)
		.build(new Block("nylium",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block warpedNylium = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("warped_nylium.png")
		.setSideTextures("warped_nylium_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, ModBlockTags.GROWS_NETHER_PLANTS)
		.build(new Block("warpedNylium", UtilIdRegistrar.nextIdBlock(), Material.dirt));

	public static final Block crimsonFungus = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("crimson_fungus.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingCrimsonFungus("crimson_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));
	public static final Block warpedFungus = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("warped_fungus.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingWarpedFungus("warped_fungus", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));
	public static final Block crimsonStem = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setSideTextures("crimson_stem.png")
		.setTopBottomTexture("crimson_stem_top.png")
		.setTopBottomTexture("crimson_stem_top.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("crimson_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));
	public static final Block warpedStem = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setSideTextures("warped_stem.png")
		.setTopBottomTexture("warped_stem_top.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new BlockAxisAligned("warped_stem", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));
	public static final Block crimsonPlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures("crimson_planks.png")
		.setTopBottomTexture("crimson_planks.png")
		.setTopBottomTexture("crimson_planks.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("crimson_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));
	public static final Block warpedPlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setSideTextures("warped_planks.png")
		.setTopBottomTexture("warped_planks.png")
		.setTopBottomTexture("warped_planks.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("warped_planks", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block shroomlight = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setSideTextures("shroomlight.png")
		.setTopBottomTexture("shroomlight.png")
		.setTopBottomTexture("shroomlight.png")
		.addTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
		.build(new Block("shroomlight", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_log));

	public static final Block cryingObsidian = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("crying_obsidian.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cryingObsidian",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lodestone = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("lodestone_top.png")
		.setSideTextures("lodestone_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lodestone",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block netherSprouts = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(0.0f)
		.setResistance(0.5f)
		.setBlockModel(new BlockModelRenderBlocks(1))
		.setTextures("nether_sprouts.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new BlockSaplingWarpedFungus("netherSprouts", UtilIdRegistrar.nextIdBlock(), MaterialAccess.nether_plant));

	public static final Block quartzBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("quartz_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("quartzBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block soulSoil = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.SAND)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("soul_soil.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("soulSoil",UtilIdRegistrar.nextIdBlock(),Material.sand));

	public static final Block target = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("target_top.png")
		.setSideTextures("target_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("target",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block ancientDebris = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(6.0F).setResistance(1000.0f)
		.setTopBottomTexture("ancient_debris_top.png")
		.setSideTextures("ancient_debris_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("ancientDebris",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block loom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("loom_top.png")
		.setBottomTexture("loom_bottom.png")
		.setNorthTexture("loom_side.png")
		.setSouthTexture("loom_front.png")
		.setWestTexture("loom_side.png")
		.setEastTexture("loom_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("loom",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block fletchingTable = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("fletching_table_top.png")
		.setBottomTexture("fletching_table_top.png")
		.setNorthTexture("fletching_table_side.png")
		.setSouthTexture("fletching_table_front.png")
		.setWestTexture("fletching_table_side.png")
		.setEastTexture("fletching_table_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("fletchingTable",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block smithingTable = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("smithing_table_top.png")
		.setBottomTexture("smithing_table_bottom.png")
		.setNorthTexture("smithing_table_side.png")
		.setSouthTexture("smithing_table_front.png")
		.setWestTexture("smithing_table_side.png")
		.setEastTexture("smithing_table_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("smithingTable",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block amethystBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("amethyst_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("amethystBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("copper_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("copperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block chiseledCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block copperOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("copper_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("copperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCopperOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("deepslate_copper_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateCopperOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cutCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedChiseledCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block exposedCutCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("exposed_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("exposedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedChiseledCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block oxidizedCutCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("oxidized_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("oxidizedCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawCopperBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_copper_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawCopperBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredChiseledCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_chiseled_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredChiseledCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block weatheredCutCopper = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("weathered_cut_copper.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("weatheredCutCopper",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawGoldBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_gold_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawGoldBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block rawIronBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("raw_iron_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("rawIronBlock",UtilIdRegistrar.nextIdBlock(),Material.metal));

	public static final Block calcite = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("calcite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("calcite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block dripstoneBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("dripstone_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("dripstoneBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block rootedDirt = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("rooted_dirt.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("rootedDirt",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block chiseledtuffBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("chiseled_tuff_bricks_top.png")
		.setSideTextures("chiseled_tuff_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledtuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledTuff = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("chiseled_tuff_top.png")
		.setSideTextures("chiseled_tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedTuff = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("polished_tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedTuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuffBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("tuff_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("tuffBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block tuff = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("tuff.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("tuff",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block ochrefroglight = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTexture("ochre_froglight_top.png")
		.setSideTextures("ochre_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("ochrefroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pearlescentfroglight = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTexture("pearlescent_froglight_top.png")
		.setSideTextures("pearlescent_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pearlescentfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block verdantfroglight = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(0.5f)
		.setResistance(1.0f)
		.setLuminance(15)
		.setTopBottomTexture("verdant_froglight_top.png")
		.setSideTextures("verdant_froglight_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("verdantfroglight",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block seaLantern = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setLuminance(15)
		.setTextures("sea_lantern.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("seaLantern",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block mud = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mud.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("mud",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block muddyMangroveRoot = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.GRASS)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("muddy_mangrove_roots_top.png")
		.setSideTextures("muddy_mangrove_roots_side.png")
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.build(new Block("muddyMangroveRoot",UtilIdRegistrar.nextIdBlock(),Material.dirt));

	public static final Block mudBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("mud_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("mudBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block packedMud = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("packed_mud.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("packedMud",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block reinforcedDeepslate = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopTexture("reinforced_deepslate_top.png")
		.setBottomTexture("reinforced_deepslate_bottom.png")
		.setSideTextures("reinforced_deepslate_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("reinforcedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block sculk = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setTextures("sculk.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("sculk",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block bambooBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("bamboo_block_top.png")
		.setSideTextures("bamboo_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooMosaic = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("bamboo_mosaic.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooMosaic",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block bambooPlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("bamboo_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("bambooPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block strippedBambooBlock = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTopBottomTexture("stripped_bamboo_block_top.png")
		.setSideTextures("stripped_bamboo_block.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("strippedBambooBlock",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block blackTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("black_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("blue_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("brown_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cyan_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gray_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("green_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_blue_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_gray_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("lime_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("magenta_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("orange_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("pink_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purple_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block terracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("terracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("white_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("yellow_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("black_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("blue_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("brown_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("cyan_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("gray_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("green_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_blue_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("light_gray_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("lime_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("magenta_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("orange_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("purple_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("red_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("white_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowGlazedTerracotta = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("yellow_glazed_terracotta.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowGlazedTerracotta",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magma = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setBlockModel(new BlockModelRenderBlocks(27))
		.setLuminance(5)
		.setTextures("magma.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magma",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block smoothBasalt = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("smooth_basalt.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("smoothBasalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block basalt = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("basalt_top.png")
		.setSideTextures("basalt_side.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("basalt",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslate = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("deepslate_top.png")
		.setSideTextures("deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block chiseledDeepslate = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("chiseled_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("chiseledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cobbledDeepslate = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cobbled_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cobbledDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cracked_deepslate_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedDeepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block crackedDeepslateTiles = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cracked_deepslate_tiles.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("crackedDeepslateTiles",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateBricks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_bricks.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateBricks",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateCoalOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_coal_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateCoalOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateDiamondOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_diamond_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateDiamondOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateIronOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_iron_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateIronOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block deepslateLapisOre = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("deepslate_lapis_ore.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("deepslateLapisOre",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block polishedDeepslate = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("polished_deepslate.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("polishedDeepslate",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block granite = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("granite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("granite",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blackConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("black_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blackConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block blueConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("blue_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("blueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block brownConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("brown_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("brownConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block cyanConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cyan_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("cyanConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block grayConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("gray_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("grayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block greenConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("green_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("greenConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightBlueConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_blue_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightBlueConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block lightGrayConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("light_gray_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("lightGrayConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block limeConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("lime_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("limeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block magentaConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("magenta_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("magentaConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block orangeConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("orange_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("orangeConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block pinkConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("pink_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("pinkConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block purpleConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("purple_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("purpleConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block redConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("red_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("redConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block whiteConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("white_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("whiteConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcretePowder = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_concrete_powder.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowConcretePowder",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block yellowConcrete = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("yellow_concrete.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("yellowConcrete",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static final Block birchPlank = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("birchPlank",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block acaciaLog = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("acacia_log_top.png")
		.setSideTextures("acacia_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("acaciaLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block acaciaPlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("acaciaPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block darkOakLog = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("dark_oak_log_top.png")
		.setSideTextures("dark_oak_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("darkOakLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block darkOakPlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("darkOakPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block jungleLog = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("jungle_log_top.png")
		.setSideTextures("jungle_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("jungleLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block junglePlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("junglePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block mangroveLog = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("mangrove_log_top.png")
		.setSideTextures("mangrove_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("mangroveLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block mangrovePlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("mangrovePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block spruceLog = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTopBottomTexture("spruce_log_top.png")
		.setSideTextures("spruce_log.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("spruceLog",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block sprucePlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("sprucePlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block cherryPlanks = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_planks.png")
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new Block("cherryPlanks",UtilIdRegistrar.nextIdBlock(),Material.wood));

	public static final Block crimsonDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("crimson_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("crimsonDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block crimsonDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("crimson_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("crimsonDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block warpedDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("warped_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CrimsonDoor("warpedDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block warpedDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("warped_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WarpedDoor("wardpedDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block acaciaDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new AcaciaDoor("acaciaDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block acaciaDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("acacia_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new AcaciaDoor("acaciaDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block bambooDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("bamboo_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BambooDoor("bambooDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block bambooDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("bamboo_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BambooDoor("bambooDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block birchDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BirchDoor("birchDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block birchDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("birch_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new BirchDoor("birchDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block cherryDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CherryDoor("cherryDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block cherryDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("cherry_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CherryDoor("cherryDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block copperDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CopperDoor("copperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block copperDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new CopperDoor("copperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block darkOakDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new DarkOakDoor("darkOakDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block darkOakDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("dark_oak_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new DarkOakDoor("darkOakDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block exposedCopperDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("exposed_copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new ExposedCopperDoor("exposedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block exposedCopperDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("exposed_copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new ExposedCopperDoor("exposedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block jungleDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new JungleDoor("jungleDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block jungleDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("jungle_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new JungleDoor("jungleDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block mangroveDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new MangroveDoor("mangroveDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block mangroveDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("mangrove_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new MangroveDoor("mangroveDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block oxidizedCopperDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("oxidized_copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new OxidizedCopperDoor("oxidizedCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block oxidizedCopperDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("oxidized_copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new OxidizedCopperDoor("oxidizedCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));

	public static final Block spruceDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new SpruceDoor("spruceDoorTop", UtilIdRegistrar.nextIdBlock(), Material.wood, true));

	public static final Block spruceDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("spruce_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new SpruceDoor("spruceDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.wood, false));

	public static final Block weatheredCopperDoorTop = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("weathered_copper_door_top.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WeatheredCopperDoor("weatheredCopperDoorTop", UtilIdRegistrar.nextIdBlock(), Material.metal, true));

	public static final Block weatheredCopperDoorBottom = new BlockBuilder(backport.MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(2.0f)
		.setResistance(2.0f)
		.setTextures("weathered_copper_door_bottom.png")
		.setBlockModel(new BlockModelRenderBlocks(7))
		.addTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
		.build(new WeatheredCopperDoor("weatheredCopperDoorBottom", UtilIdRegistrar.nextIdBlock(), Material.metal, false));


	public static void register() {
		ItemToolPickaxe.miningLevels.put(ModBlocks.ancientDebris, 3);
		ItemToolPickaxe.miningLevels.put(ModBlocks.cryingObsidian, 3);
	}
}
