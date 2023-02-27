package com.trudooku.schamamod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.STEEL_BLOCK, new ItemStack(ModItems.STEEL_INGOT, 9), 0.1f);
		GameRegistry.addSmelting(ModBlocks.ALUMINIUM_ORE, new ItemStack(ModItems.ALUMINIUM_INGOT, 1), 0.1f);
		GameRegistry.addSmelting(ModItems.PIG_IRON_INGOT, new ItemStack(ModItems.STEEL_INGOT, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.SAPPHIRE_BLOCK, new ItemStack(ModItems.SAPPHIRE, 9), 0.1f);
		GameRegistry.addSmelting(ModBlocks.SAPPHIRE_ORE, new ItemStack(ModItems.SAPPHIRE, 1), 0.1f);
	}
}