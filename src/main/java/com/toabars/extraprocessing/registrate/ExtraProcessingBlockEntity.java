package com.toabars.extraprocessing.registrate;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.kinetics.mixer.MechanicalMixerBlockEntity;
import com.simibubi.create.content.kinetics.mixer.MechanicalMixerRenderer;
import com.simibubi.create.content.kinetics.mixer.MixerVisual;
import com.toabars.extraprocessing.CreateExtraProcessing;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class ExtraProcessingBlockEntity {

    public static final BlockEntityEntry<MechanicalMixerBlockEntity> CASING_VARIANT_MECHANICAL_MIXER =
        CreateExtraProcessing.REGISTRATE.blockEntity("mechanical_mixer", MechanicalMixerBlockEntity::new)
            .visual(() -> MixerVisual::new)
            .validBlocks(ExtraProcessingItemsRegistrate.MECHANICAL_MIXER_VARIANT.toArray())
            .renderer(() -> MechanicalMixerRenderer::new)
            .register();

    public static void register() {
    }

}
