package io.github.moderatetobelowaverage.vanilla_progression_reworked;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.moderatetobelowaverage.vanilla_progression_reworked.item.Moditems.*;

public class VanillaProgressionReworked implements ModInitializer {
	public static final String MOD_ID = "vanilla_progression_reworked";
	public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla Progression Reworked");
	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_ingot"), STEEL_INGOT);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_helmet"), STEEL_HELMET);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_chestplate"), STEEL_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_leggings"), STEEL_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_boots"), STEEL_BOOTS);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.NETHERITE_INGOT, STEEL_INGOT);
			});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.NETHERITE_BOOTS, STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS);
		});
	}
}
