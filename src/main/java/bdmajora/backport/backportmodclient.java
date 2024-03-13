package bdmajora.backport;


import net.fabricmc.api.ClientModInitializer;
import turniplabs.halplibe.helper.SoundHelper;

public class backportmodclient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Add streaming for the music disc
		SoundHelper.Client.addStreaming(backport.MOD_ID, "disc_pig_step.ogg");
		SoundHelper.Client.addStreaming(backport.MOD_ID, "music_disc_13.ogg");
	}
}
