package bdmajora.backport.block;

import bdmajora.backport.backport;
import bdmajora.backport.UtilIdRegistrar;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.client.sound.block.BlockSoundDispatcher;
import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlockLayer;
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
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
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
		.setBlockSound(BlockSounds.STONE)
		.setHardness(1.0f)
		.setResistance(1.0f)
		.setTextures("emerald_block.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("emeraldBlock",UtilIdRegistrar.nextIdBlock(),Material.stone));

	public static void register() {
	}
}

