package io.github.moderatetobelowaverage.weeping_iron_mod;


import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelToolMaterial implements ToolMaterial {
	public static final SteelToolMaterial INSTANCE = new SteelToolMaterial();
	@Override
	public int getDurability() {return 2531;}
	@Override
	public float getMiningSpeedMultiplier() {
		return 7.0F;
	}
	@Override
	public float getAttackDamage() {
		return 3.0F;
	}
	@Override
	public int getMiningLevel() {
		return 3;
	}
	@Override
	public int getEnchantability() {
		return 14;
	}
	@Override
	public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(SteelItems.STEEL_INGOT);
	}
}
