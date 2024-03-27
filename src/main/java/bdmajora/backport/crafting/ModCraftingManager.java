package bdmajora.backport.crafting;

import bdmajora.backport.backport;
import bdmajora.backport.block.ModBlocks;
import bdmajora.backport.block.ModBlockTags;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.DataLoader;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class ModCraftingManager {
	public static final RecipeNamespace BACKPORT = new RecipeNamespace();
	public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));

	public static void onRecipesReady() {

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("S")
			.addInput('S', ModBlocks.crimsonStem)
			.setConsumeContainer(false)
			.create("crimsonPlanks", new ItemStack(ModBlocks.crimsonPlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("S")
			.addInput('S', ModBlocks.warpedStem)
			.setConsumeContainer(false)
			.create("warpedPlanks", new ItemStack(ModBlocks.warpedPlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', Block.logBirch)
			.setConsumeContainer(false)
			.create("birchPlank", new ItemStack(ModBlocks.birchPlank, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.acaciaLog)
			.setConsumeContainer(false)
			.create("acaciaPlanks", new ItemStack(ModBlocks.acaciaPlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.darkOakLog)
			.setConsumeContainer(false)
			.create("darkOakPlanks", new ItemStack(ModBlocks.darkOakPlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.jungleLog)
			.setConsumeContainer(false)
			.create("junglePlanks", new ItemStack(ModBlocks.junglePlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.mangroveLog)
			.setConsumeContainer(false)
			.create("mangrovePlanks", new ItemStack(ModBlocks.mangrovePlanks, 4));

	}
}


