package io.github.moderatetobelowaverage.weeping_iron_mod;

import net.minecraft.block.Block;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class SteelBlocks {
	public static final Block RAW_STEEL = new Block(QuiltBlockSettings.create().strength(3.0f).requiresTool());
	public static final Block REFINED_STEEL = new Block(QuiltBlockSettings.create().hardness(10.0f).resistance(1200.0f).requiresTool());
}
