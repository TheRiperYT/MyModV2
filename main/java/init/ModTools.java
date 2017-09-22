package init;

import com.theriper.uranium.Reference;

import items.ItemUraniumpickaxe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModTools {
	
	public static final ToolMaterial uranium = EnumHelper.addToolMaterial("uranium", 3, 1800, 9.0F, 4.0F, 10);
	
	public static Item uraniumpickaxe;
	
	public static void init() {
		uraniumpickaxe = new ItemUraniumpickaxe("uraniumpickaxe", uranium);
		}
	
	public static void register() {
		ForgeRegistries.ITEMS.register(uraniumpickaxe);
	}
	
	public static void registerRenders() {
		registerRender(uraniumpickaxe);
	}
	

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register
		(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
}
}