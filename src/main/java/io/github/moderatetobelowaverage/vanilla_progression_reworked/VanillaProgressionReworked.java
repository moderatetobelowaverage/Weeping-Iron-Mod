package io.github.moderatetobelowaverage.vanilla_progression_reworked;


import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.moderatetobelowaverage.vanilla_progression_reworked.item.Moditems.STEEL_INGOT;

public class VanillaProgressionReworked implements ModInitializer {
	public static final String MOD_ID = "vanilla_progression_reworked";
	public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla Progression Reworked");
	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel_ingot"), STEEL_INGOT);
	}
}
