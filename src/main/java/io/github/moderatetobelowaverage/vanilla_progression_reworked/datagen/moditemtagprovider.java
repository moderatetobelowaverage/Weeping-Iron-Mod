/*package io.github.moderatetobelowaverage.vanilla_progression_reworked.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import io.github.moderatetobelowaverage.vanilla_progression_reworked.item.Moditems
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ModItemTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(HolderLookup arg) {
		getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
			.add(Moditems.STEEL_HELMET, Moditems.STEEL_CHESTPLATE, Moditems.STEEL_LEGGINGS, Moditems.STEEL_BOOTS);
	}
}
*/
