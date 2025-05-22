package com.toabars.extraprocessing.content.variants;

import com.simibubi.create.content.kinetics.mixer.MechanicalMixerBlock;
import com.simibubi.create.content.kinetics.mixer.MechanicalMixerBlockEntity;
import com.toabars.extraprocessing.registrate.ExtraProcessingBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class CasingVariantMechanicalMixerBlock extends MechanicalMixerBlock {

    public CasingVariantMechanicalMixerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<? extends MechanicalMixerBlockEntity> getBlockEntityType() {
        return ExtraProcessingBlockEntity.CASING_VARIANT_MECHANICAL_MIXER.get();
    }

}
