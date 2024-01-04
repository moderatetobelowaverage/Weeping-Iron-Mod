package io.github.moderatetobelowaverage.vanilla_progression_reworked;


import io.github.moderatetobelowaverage.vanilla_progression_reworked.item.Moditems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelToolMaterial implements ToolMaterial {
	public static final SteelToolMaterial INSTANCE = new SteelToolMaterial();
	@Override
	public int getDurability() {
		return 500;
	}
	@Override
	public float getMiningSpeedMultiplier() {
		return 5.0F;
	}
	@Override
	public float getAttackDamage() {
		return 3.0F;
	}
	@Override
	public int getMiningLevel() {
		return 2;
	}
	@Override
	public int getEnchantability() {
		return 15;
	}
	@Override
	public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(Moditems.STEEL_INGOT);
	}
}
