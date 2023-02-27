package com.trudooku.schamamod.init;

import java.util.ArrayList;
import java.util.List;

import com.trudooku.schamamod.blocks.AluminiumOre;
import com.trudooku.schamamod.blocks.BananaLeaves;
import com.trudooku.schamamod.blocks.BananaLog;
import com.trudooku.schamamod.blocks.BananaPlanks;
import com.trudooku.schamamod.blocks.BlockBase;
import com.trudooku.schamamod.blocks.SapphireBlock;
import com.trudooku.schamamod.blocks.SapphireOre;
import com.trudooku.schamamod.blocks.SteelBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Blocks
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	public static final Block ALUMINIUM_ORE = new AluminiumOre("aluminium_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.GROUND);
	public static final Block BANANA_LEAVES = new BananaLeaves("banana_leaves", Material.LEAVES);
	public static final Block BANANA_PLANKS = new BananaPlanks("banana_planks", Material.WOOD);
	public static final Block BANANA_LOG = new BananaLog("banana_log", Material.WOOD);
}