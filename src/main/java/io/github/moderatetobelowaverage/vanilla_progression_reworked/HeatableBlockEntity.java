package io.github.moderatetobelowaverage.vanilla_progression_reworked;

import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface HeatableBlockEntity {

    default boolean isHeated(World world, BlockPos pos) {
        BlockState stateBelow = world.getBlockState(pos.down());

        if (stateBelow.isIn(TagRegistry.HEAT_SOURCES)) {
            if (stateBelow.contains(Properties.LIT)) {
                return stateBelow.get(Properties.LIT);
            }
            return true;
        }
		else return false;
	}

}
