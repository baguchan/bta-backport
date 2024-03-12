package bdmajora.backport.item;

import bdmajora.backport.backport;
import bdmajora.backport.UtilIdRegistrar;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemHelper;

public class ModItems {
	public static final Item recordPigStep = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor(backport.MOD_ID, UtilIdRegistrar.nextIdItem(), "disc_pig_step"), "record.pig_step", "disc_pig_step.png");

	// Add your other records here
	// public static final Item yourOtherRecord = ...

	public static void register() {
	}
}
