package com.theriper.uranium.blocks;

import com.theriper.uranium.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreUranium extends Block {
	
	public OreUranium() {
		super(Material.IRON);
		setUnlocalizedName(Reference.UraniumOres.URANIUMORE.getUnlocalizedName());
		setRegistryName (Reference.UraniumOres.URANIUMORE.getRegistryName());
	}
}
