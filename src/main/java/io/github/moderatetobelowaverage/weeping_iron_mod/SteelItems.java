package io.github.moderatetobelowaverage.weeping_iron_mod;

import net.minecraft.item.*;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class SteelItems {
	public static final Item STEEL_INGOT = new Item(new QuiltItemSettings());
	public static final ArmorMaterial STEEL = new SteelArmorMaterial();
	public static final Item STEEL_HELMET = new ArmorItem(STEEL, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings());
	public static final Item STEEL_CHESTPLATE = new ArmorItem(STEEL, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings());
	public static final Item STEEL_LEGGINGS = new ArmorItem(STEEL, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings());
	public static final Item STEEL_BOOTS = new ArmorItem(STEEL, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings());
	public static ToolItem STEEL_SWORD = new SwordItem(SteelToolMaterial.INSTANCE, 2, -2.4F, new QuiltItemSettings());
	public static ToolItem STEEL_PICKAXE = new PickaxeItem(SteelToolMaterial.INSTANCE, 0, -2.8F, new QuiltItemSettings());
	public static ToolItem STEEL_AXE = new AxeItem(SteelToolMaterial.INSTANCE, 5.0F, -3.1F, new QuiltItemSettings());
	public static ToolItem STEEL_SHOVEL = new ShovelItem(SteelToolMaterial.INSTANCE, 1, -3F, new QuiltItemSettings());
	public static ToolItem STEEL_HOE = new HoeItem(SteelToolMaterial.INSTANCE, -3, -1F, new QuiltItemSettings());


}


