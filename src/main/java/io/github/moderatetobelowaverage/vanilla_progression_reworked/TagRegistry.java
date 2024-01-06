package io.github.moderatetobelowaverage.vanilla_progression_reworked;

import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class TagRegistry{
	public static final TagKey<Block> HEAT_SOURCES = create("heat_sources", RegistryKeys.BLOCK);

	private static <E> TagKey<E> create(String pathName, RegistryKey<? extends Registry<E>> registry) {
		return TagKey.of(registry, new Identifier(VanillaProgressionReworked.MOD_ID, pathName));

	}
}
