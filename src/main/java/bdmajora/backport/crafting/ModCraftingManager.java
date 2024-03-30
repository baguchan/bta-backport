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
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.crimsonPlanks)
			.setConsumeContainer(false)
			.create("crimsonDoor", new ItemStack(ModItems.crimsonDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("S")
			.addInput('S', ModBlocks.warpedStem)
			.setConsumeContainer(false)
			.create("warpedPlanks", new ItemStack(ModBlocks.warpedPlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.warpedPlanks)
			.setConsumeContainer(false)
			.create("warpedDoor", new ItemStack(ModItems.wardpedDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', Block.logBirch)
			.setConsumeContainer(false)
			.create("birchPlank", new ItemStack(ModBlocks.birchPlank, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.birchPlank)
			.setConsumeContainer(false)
			.create("birchDoor", new ItemStack(ModItems.birchDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.acaciaLog)
			.setConsumeContainer(false)
			.create("acaciaPlanks", new ItemStack(ModBlocks.acaciaPlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.acaciaPlanks)
			.setConsumeContainer(false)
			.create("acaciaDoor", new ItemStack(ModItems.acaciaDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.darkOakLog)
			.setConsumeContainer(false)
			.create("darkOakPlanks", new ItemStack(ModBlocks.darkOakPlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.darkOakPlanks)
			.setConsumeContainer(false)
			.create("darkOakDoor", new ItemStack(ModItems.darkOakDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.jungleLog)
			.setConsumeContainer(false)
			.create("junglePlanks", new ItemStack(ModBlocks.junglePlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.junglePlanks)
			.setConsumeContainer(false)
			.create("jungleDoor", new ItemStack(ModItems.jungleDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.mangroveLog)
			.setConsumeContainer(false)
			.create("mangrovePlanks", new ItemStack(ModBlocks.mangrovePlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.mangrovePlanks)
			.setConsumeContainer(false)
			.create("mangroveDoor", new ItemStack(ModItems.mangroveDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("L")
			.addInput('L', ModBlocks.spruceLog)
			.setConsumeContainer(false)
			.create("sprucePlanks", new ItemStack(ModBlocks.sprucePlanks, 4));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.sprucePlanks)
			.setConsumeContainer(false)
			.create("spruceDoor", new ItemStack(ModItems.spruceDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.cherryPlanks)
			.setConsumeContainer(false)
			.create("cherryDoor", new ItemStack(ModItems.cherryDoor, 3));

		RecipeBuilder.Shaped(backport.MOD_ID)
			.setShape("PP", "PP", "PP")
			.addInput('P', ModBlocks.bambooPlanks)
			.setConsumeContainer(false)
			.create("bambooDoor", new ItemStack(ModItems.bambooDoor, 3));

	}
}


