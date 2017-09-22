package com.theriper.uranium.blocks;

import com.theriper.uranium.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockUranium extends Block {

	public BlockUranium() {
		super(Material.IRON);
		setUnlocalizedName(Reference.UraniumBlocks.URANIUMBLOCK.getUnlocalizedName());
		setRegistryName (Reference.UraniumBlocks.URANIUMBLOCK.getRegistryName());
	}

}
