package bdmajora.backport.item;

import bdmajora.backport.backport;
import bdmajora.backport.UtilIdRegistrar;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemHelper;

public class ModItems {
	// Items
	public static final Item recordPigStep = ItemHelper.createItem(backport.MOD_ID, new ItemRecordAccessor(backport.MOD_ID, UtilIdRegistrar.nextIdItem(), "disc_pig_step"), "disc_pig_step.png");
	public static void register() {
	}
}
