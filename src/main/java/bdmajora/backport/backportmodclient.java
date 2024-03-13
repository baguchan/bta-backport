package bdmajora.backport;

import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.helper.AchievementHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.helper.SoundHelper;

public class backportmodclient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Add streaming for the music disc
		SoundHelper.Client.addStreaming(backport.MOD_ID, "disc_pig_step.ogg");
	}
}
