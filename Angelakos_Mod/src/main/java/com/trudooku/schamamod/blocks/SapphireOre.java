package com.trudooku.schamamod.blocks;

import java.util.Random;

import com.trudooku.schamamod.init.ModBlocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SapphireOre extends BlockBase
{
	public SapphireOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
		setLightOpacity(0);
	}	
}