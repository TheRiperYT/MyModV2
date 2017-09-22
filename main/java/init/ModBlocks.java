package init;

import com.theriper.uranium.blocks.BlockUranium;
import com.theriper.uranium.blocks.OreUranium;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {

	public static Block uraniumblock;
	public static Block uraniumore;
	
	public static void init() {
		uraniumblock = new BlockUranium();
		uraniumore = new OreUranium();
	}
	
	public static void register() {
		registerBlock(uraniumblock);
		registerBlock(uraniumore);
	}
	
	private static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(uraniumblock);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ForgeRegistries.BLOCKS.register(uraniumore);
//		ItemBlock item = new ItemBlock(block);
//		item.setRegistryName(block.getRegistryName());
//		ForgeRegistries.ITEMS.register(item);
	}
	
	
	public static void registerRenders() {
		registerRender(uraniumblock);
		registerRender(uraniumore);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().
		register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
