package io.github.moderatetobelowaverage.weeping_iron_mod;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.moderatetobelowaverage.weeping_iron_mod.SteelBlocks.RAW_STEEL;
import static io.github.moderatetobelowaverage.weeping_iron_mod.SteelBlocks.REFINED_STEEL;
import static io.github.moderatetobelowaverage.weeping_iron_mod.SteelItems.*;

public class WeepingIronMod implements ModInitializer {
	public static final String MOD_ID = "weeping_iron_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla Progression Reworked");
	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_ingot"), STEEL_INGOT);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_helmet"), STEEL_HELMET);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_chestplate"), STEEL_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_leggings"), STEEL_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_boots"), STEEL_BOOTS);
		Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "raw_steel"), RAW_STEEL);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "raw_steel"), new BlockItem(RAW_STEEL, new QuiltItemSettings()));
		Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "refined_steel"), REFINED_STEEL);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "refined_steel"), new BlockItem(REFINED_STEEL, new QuiltItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_sword"), STEEL_SWORD);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_pickaxe"), STEEL_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_axe"), STEEL_AXE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_shovel"), STEEL_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_hoe"), STEEL_HOE);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(Items.IRON_BLOCK, REFINED_STEEL.asItem());
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(entries -> {
			entries.addAfter(Items.RAW_IRON, RAW_STEEL.asItem());
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(entries -> {
			entries.addAfter(Items.IRON_HOE, STEEL_PICKAXE, STEEL_AXE, STEEL_SHOVEL, STEEL_HOE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.IRON_BOOTS, STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS);
			entries.addAfter(Items.IRON_AXE, STEEL_AXE);
			entries.addAfter(Items.IRON_SWORD, STEEL_SWORD);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.IRON_INGOT, STEEL_INGOT);
		});
	}
}
