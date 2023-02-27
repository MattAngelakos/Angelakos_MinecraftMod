package com.trudooku.schamamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SteelBlock extends BlockBase
{
	public SteelBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(8.0F);
		setResistance(1000.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
		setLightOpacity(0);
	}	
}