package io.github.moderatetobelowaverage.vanilla_progression_reworked;

import net.minecraft.block.Block;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class ModBlocks{
	public static final Block RAW_STEEL = new Block(QuiltBlockSettings.create().strength(3.0f).requiresTool());
	public static final Block REFINED_STEEL = new Block(QuiltBlockSettings.create().strength(4.0f).requiresTool());
}
