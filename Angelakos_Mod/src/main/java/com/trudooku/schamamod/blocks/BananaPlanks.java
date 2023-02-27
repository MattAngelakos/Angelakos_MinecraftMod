package com.trudooku.schamamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BananaPlanks extends BlockBase
{
	public BananaPlanks(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 0);
		setLightLevel(0.0F);
		setLightOpacity(0);
	}	
}
