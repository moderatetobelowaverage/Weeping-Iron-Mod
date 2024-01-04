package io.github.moderatetobelowaverage.vanilla_progression_reworked.item;

import io.github.moderatetobelowaverage.vanilla_progression_reworked.SteelArmorMaterial;
import io.github.moderatetobelowaverage.vanilla_progression_reworked.SteelToolMaterial;
import net.minecraft.item.*;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class Moditems {
	public static final Item STEEL_INGOT = new Item(new QuiltItemSettings());
	public static final ArmorMaterial STEEL = new SteelArmorMaterial();
	public static final Item STEEL_HELMET = new ArmorItem(STEEL, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings());
	public static final Item STEEL_CHESTPLATE = new ArmorItem(STEEL, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings());
	public static final Item STEEL_LEGGINGS = new ArmorItem(STEEL, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings());
	public static final Item STEEL_BOOTS = new ArmorItem(STEEL, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings());
	public static ToolItem STEEL_SWORD = new SwordItem(SteelToolMaterial.INSTANCE, 1, -2.8F, new QuiltItemSettings());
	public static ToolItem STEEL_PICKAXE = new PickaxeItem(SteelToolMaterial.INSTANCE, 1, -2.8F, new QuiltItemSettings());
	public static ToolItem STEEL_AXE = new AxeItem(SteelToolMaterial.INSTANCE, 7.0F, -3.2F, new QuiltItemSettings());
	public static ToolItem STEEL_SHOVEL = new ShovelItem(SteelToolMaterial.INSTANCE, 1, -2.8F, new QuiltItemSettings());
	public static ToolItem STEEL_HOE = new HoeItem(SteelToolMaterial.INSTANCE, 7, -3.2F, new QuiltItemSettings());


}


