package init;

import items.ItemUraniumingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {
	
	public static Item uraniumingot;
	
	public static void init() {
		uraniumingot = new ItemUraniumingot();
	}
	
	public static void register() {
		ForgeRegistries.ITEMS.register(uraniumingot);
	}
	
	public static void registerRenders() {
		registerRender(uraniumingot);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().
		register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		
}
