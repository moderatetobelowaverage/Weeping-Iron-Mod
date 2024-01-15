/*
package io.github.moderatetobelowaverage.weeping_iron_mod.mixin;

import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin (ToolMaterials.class)
public class ToolMaterialsMixin {
	@Inject(method = "getMiningSpeedMultiplier", at = @At("RETURN"), cancellable = true)

	public void getMiningSpeedInject(CallbackInfoReturnable<Float> cir) {

		if((Object)this == ToolMaterials.DIAMOND) {

			cir.setReturnValue(9.0F);

		}
		if((Object)this == ToolMaterials.NETHERITE) {

			cir.setReturnValue(8.0F);

		}

	}
	@Inject(method = "getAttackDamage", at = @At("RETURN"), cancellable = true)

	public void getAttackDamageInject(CallbackInfoReturnable<Float> cir) {

		if((Object)this == ToolMaterials.DIAMOND) {

			cir.setReturnValue(4.0F);

		}
		if((Object)this == ToolMaterials.NETHERITE) {

			cir.setReturnValue(3.0F);

		}

	}

}
*/
