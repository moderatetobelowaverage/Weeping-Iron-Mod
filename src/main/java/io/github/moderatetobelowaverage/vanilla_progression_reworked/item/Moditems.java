package io.github.moderatetobelowaverage.vanilla_progression_reworked.item;

import io.github.moderatetobelowaverage.vanilla_progression_reworked.SteelArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class Moditems {
	public static final Item STEEL_INGOT = new Item(new QuiltItemSettings());
	public static final ArmorMaterial STEEL = new SteelArmorMaterial();
	public static final Item STEEL_HELMET = new ArmorItem(STEEL, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings());
	public static final Item STEEL_CHESTPLATE = new ArmorItem(STEEL, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings());
	public static final Item STEEL_LEGGINGS = new ArmorItem(STEEL, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings());
	public static final Item STEEL_BOOTS = new ArmorItem(STEEL, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings());


}


