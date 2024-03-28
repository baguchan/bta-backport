package bdmajora.backport.item;

import bdmajora.backport.backport;
import bdmajora.backport.item.Doors.ItemCrimsonDoor;
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
	public static void register() {
	}
}
