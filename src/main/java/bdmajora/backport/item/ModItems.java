package bdmajora.backport.item;

import bdmajora.backport.backport;
import bdmajora.backport.item.Doors.*;
import bdmajora.backport.UtilIdRegistrar;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemHelper;

public class ModItems {
	// Items
	public static final Item recordPigStep = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "disc_pig_step"), "disc_pig_step.png");
	public static final Item record11 = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_11"), "music_disc_11.png");
	public static final Item recordOtherSide = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_other_side"), "music_disc_other_side.png");
	public static final Item recordRelic = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_relic"), "music_disc_relic.png");
	public static final Item record5 = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor("record.Disc", UtilIdRegistrar.nextIdItem(), "music_disc_5"), "music_disc_5.png");

	//nether items
	public static final Item netherBrick = ItemHelper.createItem(backport.MOD_ID, new ItemAccessor("item.brick", UtilIdRegistrar.nextIdItem(), "nether_brick"), "nether_brick.png");

	//Doors
	public static final Item crimsonDoor = ItemHelper.createItem(backport.MOD_ID, new ItemCrimsonDoor("item.crimsonDoor", UtilIdRegistrar.nextIdItem()), "crimson_door.png");

	public static final Item wardpedDoor = ItemHelper.createItem(backport.MOD_ID, new ItemWarpedDoor("item.warpedDoor", UtilIdRegistrar.nextIdItem()), "warped_door.png");

	public static final Item acaciaDoor = ItemHelper.createItem(backport.MOD_ID, new ItemAcaciaDoor("item.acaciaDoor", UtilIdRegistrar.nextIdItem()), "acacia_door.png");

	public static final Item bambooDoor = ItemHelper.createItem(backport.MOD_ID, new ItemBambooDoor("item.bambooDoor", UtilIdRegistrar.nextIdItem()), "bamboo_door.png");

	public static final Item birchDoor = ItemHelper.createItem(backport.MOD_ID, new ItemBirchDoor("item.birchDoor", UtilIdRegistrar.nextIdItem()), "birch_door.png");

	public static final Item cherryDoor = ItemHelper.createItem(backport.MOD_ID, new ItemCherryDoor("item.cherryDoor", UtilIdRegistrar.nextIdItem()), "cherry_door.png");

	public static final Item copperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemCopperDoor("item.copperDoor", UtilIdRegistrar.nextIdItem()), "copper_door.png");

	public static final Item darkOakDoor = ItemHelper.createItem(backport.MOD_ID, new ItemDarkOakDoor("item.darkOakDoor", UtilIdRegistrar.nextIdItem()), "dark_oak_door.png");

	public static final Item exposedCopperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemExposedCopperDoor("item.exposedCopperDoor", UtilIdRegistrar.nextIdItem()), "exposed_copper_door.png");

	public static final Item jungleDoor = ItemHelper.createItem(backport.MOD_ID, new ItemJungleDoor("item.jungleDoor", UtilIdRegistrar.nextIdItem()), "jungle_door.png");

	public static final Item mangroveDoor = ItemHelper.createItem(backport.MOD_ID, new ItemMangroveDoor("item.mangroveDoor", UtilIdRegistrar.nextIdItem()), "mangrove_door.png");

	public static final Item oxidizedCopperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemOxidizedCopperDoor("item.oxidizedCopperDoor", UtilIdRegistrar.nextIdItem()), "oxidized_copper_door.png");

	public static final Item spruceDoor = ItemHelper.createItem(backport.MOD_ID, new ItemSpruceDoor("item.spruceDoor", UtilIdRegistrar.nextIdItem()), "spruce_door.png");

	public static final Item weatheredCopperDoor = ItemHelper.createItem(backport.MOD_ID, new ItemWeatheredCopperDoor("item.weatheredCopperDoor", UtilIdRegistrar.nextIdItem()), "weathered_copper_door.png");

	public static void register() {
	}
}
