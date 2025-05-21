package com.toabars.extraprocessing.registrate;

import com.simibubi.create.AllFluids;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.simibubi.create.infrastructure.config.AllConfigs;
import com.toabars.extraprocessing.CreateExtraProcessing;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import static com.toabars.extraprocessing.CreateExtraProcessing.REGISTRATE;

public class ExtraProcessingFluidsRegistrate {
    public static final FluidEntry<VirtualFluid> MOLTEN_BUTTER = REGISTRATE.virtualFluid("molten_butter")
            .register();

    public static void register(IEventBus modEventBus) {

    }
}
