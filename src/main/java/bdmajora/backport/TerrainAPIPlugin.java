package bdmajora.backport;

import bdmajora.backport.block.ModBlocks;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.nether.api.ChunkDecoratorNetherAPI;

public class TerrainAPIPlugin implements TerrainAPI {
	@Override
	public String getModID() {
		return backport.MOD_ID;
	}

	@Override
	public void onInitialize() {
		ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(backport.MOD_ID, ModBlocks.netherGoldOre, 12, 24, 1F, false);
		ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(backport.MOD_ID, ModBlocks.netherQuartzOre, 14, 20, 1F, false);
	}
}
