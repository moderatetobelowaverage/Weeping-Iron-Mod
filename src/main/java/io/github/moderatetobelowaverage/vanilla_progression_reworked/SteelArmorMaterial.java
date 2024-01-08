package io.github.moderatetobelowaverage.vanilla_progression_reworked;

import io.github.moderatetobelowaverage.vanilla_progression_reworked.item.Moditems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;


public class SteelArmorMaterial implements ArmorMaterial {
	private static final int[] DURABILITY = new int[]{380,550,500,450};
	private static final int[] PROTECTION = new int[]{2,5,8,3};
	@Override
	public int getDurability(ArmorItem.ArmorSlot slot) {
		return DURABILITY[slot.getEquipmentSlot().getEntitySlotId()];
	}

	@Override
	public int getProtection(ArmorItem.ArmorSlot slot) {
		return PROTECTION[slot.getEquipmentSlot().getEntitySlotId()];
	}
	@Override
	public int getEnchantability() {
		return 10;
	}
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
	}
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Moditems.STEEL_INGOT);
	}
	@Override
	public String getName() {
		return "steel";
	}

	@Override
	public float getToughness() {
		return 1;
	}

	@Override
	public float getKnockbackResistance() {
		return 0.2f;
	}
}
