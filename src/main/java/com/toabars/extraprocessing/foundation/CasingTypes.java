package com.toabars.extraprocessing.foundation;

import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.toabars.extraprocessing.registrate.ExtraProcessingSpriteShifts;
import net.minecraft.world.level.material.MapColor;

public enum CasingTypes {
    GRANITE(ExtraProcessingSpriteShifts.GRANITE_CASING, MapColor.PODZOL),
    ;

    private final CTSpriteShiftEntry spriteShift;
    private final MapColor mapColor;

    CasingTypes(CTSpriteShiftEntry spriteShift, MapColor mapColor) {
        this.spriteShift = spriteShift;
        this.mapColor = mapColor;
    }

    public String getRegistryName() {
        return this.name().toLowerCase();
    }

    public CTSpriteShiftEntry getSpriteShift() {
        return spriteShift;
    }

    public MapColor getMapColour() {
        return mapColor;
    }
}
