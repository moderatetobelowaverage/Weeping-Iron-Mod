package io.github.moderatetobelowaverage.weeping_iron_mod.mixin;

import net.minecraft.item.ArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin (ArmorMaterials.class)
public class ArmorMaterialsMixin {
	@Inject(method = "getToughness", at = @At("RETURN"), cancellable = true)

	public void getToughnessInject(CallbackInfoReturnable<Float> cir) {

		if((Object)this == ArmorMaterials.DIAMOND) {

			cir.setReturnValue(3.0F);

		}
		if((Object)this == ArmorMaterials.NETHERITE) {

			cir.setReturnValue(2.0F);

		}

	}

}
