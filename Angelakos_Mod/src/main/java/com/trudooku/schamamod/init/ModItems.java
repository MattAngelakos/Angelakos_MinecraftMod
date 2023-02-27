package com.trudooku.schamamod.init;

import java.util.ArrayList;
import java.util.List;

import com.trudooku.schamamod.items.ItemBase;
import com.trudooku.schamamod.items.armor.ArmorBase;
import com.trudooku.schamamod.items.food.FoodBase;
import com.trudooku.schamamod.items.food.FoodEffectBase;
import com.trudooku.schamamod.items.tools.ToolAxe;
import com.trudooku.schamamod.items.tools.ToolHoe;
import com.trudooku.schamamod.items.tools.ToolPickaxe;
import com.trudooku.schamamod.items.tools.ToolSpade;
import com.trudooku.schamamod.items.tools.ToolSword;
import com.trudooku.schamamod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_STEEL_INGOT= EnumHelper.addToolMaterial("material_steel_ingot", 3, 2000, 7.0F, 2.5F, 15);
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL_INGOT = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 17, 
																								new int[] {3, 5, 7, 3}, 16, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 1.0F);
	public static final ToolMaterial MATERIAL_SAPPHIRE= EnumHelper.addToolMaterial("material_sapphire", 3, 1000, 8.0F, 3.F, 12);
	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MOD_ID + ":sapphire", 18, 
																								new int[] {3, 7, 7, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	//Items
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item ALUMINIUM_INGOT = new ItemBase("aluminium_ingot");
	public static final Item CRUSHED_COAL = new ItemBase("crushed_coal");
	public static final Item PIG_IRON_INGOT = new ItemBase("pig_iron_ingot");
	//Tools
	
		//Swords
		public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL_INGOT);
		public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
		//Shovels
		public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL_INGOT);
		public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
		//Pickaxes
		public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL_INGOT);
		public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
		//Axes
		public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL_INGOT);
		public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
		//Hoe
		public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL_INGOT);
		public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);
		//Bows
		
	//Armor
		//Helmets
		public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_MATERIAL_STEEL_INGOT, 1, EntityEquipmentSlot.HEAD);
		public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
		//Chestplates
		public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_MATERIAL_STEEL_INGOT, 1, EntityEquipmentSlot.CHEST);
		public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
		//Leggings
		public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_MATERIAL_STEEL_INGOT, 2, EntityEquipmentSlot.LEGS);
		public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings", ARMOR_MATERIAL_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
		//Boots
		public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_MATERIAL_STEEL_INGOT, 1, EntityEquipmentSlot.FEET);
		public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);
		
	//Food
		public static final Item BANANA = new FoodEffectBase("banana", 4, 4.0f, false, new PotionEffect(MobEffects.JUMP_BOOST, (60*20), 3, false, true));
}