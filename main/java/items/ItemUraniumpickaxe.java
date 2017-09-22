package items;

import com.theriper.uranium.Reference;

import net.minecraft.item.ItemPickaxe;

public class ItemUraniumpickaxe extends ItemPickaxe {
	
	public ItemUraniumpickaxe(String name, ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(Reference.UraniumTools.URANIUMPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.UraniumTools.URANIUMPICKAXE.getRegistryName());
	}
	
}
