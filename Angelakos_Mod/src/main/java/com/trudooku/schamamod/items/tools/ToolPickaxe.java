package com.trudooku.schamamod.items.tools;

import com.trudooku.schamamod.Main;
import com.trudooku.schamamod.init.ModItems;
import com.trudooku.schamamod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
