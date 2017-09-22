package init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.annotation.meta.getter;

public class ModCrafting {
	
	public static void register() {
		GameRegistry.addShapedRecipe(new ResourceLocation("uraniumblock"), new ResourceLocation("uraniumblocks"),new ItemStack(ModBlocks.uraniumblock),
		new Object[] {"UUU", "UUU", "UUU", 'U', ModItems.uraniumingot});
		GameRegistry.addShapelessRecipe(new ResourceLocation("uraniumingot"), new ResourceLocation("uraniumingots"), new ItemStack(ModItems.uraniumingot, 9), new Ingredient[] {Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.uraniumblock))});
		GameRegistry.addSmelting(ModBlocks.uraniumore, new ItemStack(ModItems.uraniumingot), 15);
	}


}
