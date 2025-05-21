package com.toabars.extraprocessing.registrate;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.neoforged.bus.api.IEventBus;

import static com.toabars.extraprocessing.CreateExtraProcessing.REGISTRATE;

public class ExtraProcessingFluidsRegistrate {
    public static final FluidEntry<VirtualFluid> MOLTEN_BUTTER = REGISTRATE.virtualFluid("molten_butter")
            .lang("Molten Butter")
            .tag(AllTags.commonFluidTag("teas"))
            .register();

    public static void register(IEventBus modEventBus) {}
}
