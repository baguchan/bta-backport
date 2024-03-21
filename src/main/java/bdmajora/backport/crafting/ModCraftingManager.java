package bdmajora.backport.crafting;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.DataLoader;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.ItemStack;

public class ModCraftingManager {
	public static final RecipeNamespace BACKPORT = new RecipeNamespace();
	public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));

	public static void onRecipesReady() {
		BACKPORT.register("workbench", WORKBENCH);
		Registries.RECIPES.register("backport", BACKPORT);
		DataLoader.loadRecipes("/assets/backport/recipes/workbench.json");
	}
}
