package com.trudooku.schamamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BananaLeaves extends BlockBase
{
	public BananaLeaves(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.PLANT);
		setHardness(0.35F);
		setResistance(1.5F);
		setLightLevel(0.0F);
		setLightOpacity(1);
	}	
}
