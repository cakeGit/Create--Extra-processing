package com.toabars.extraprocessing.registrate;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import com.simibubi.create.foundation.block.connected.CTType;
import com.toabars.extraprocessing.CreateExtraProcessing;
import net.createmod.catnip.data.Couple;
import net.createmod.catnip.lang.Lang;
import net.createmod.catnip.render.SpriteShiftEntry;
import net.createmod.catnip.render.SpriteShifter;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class ExtraProcessingSpriteShifts {

	public static final CTSpriteShiftEntry GRANITE_CASING = omni("granite_casing");

	private static Couple<CTSpriteShiftEntry> vault(String name) {
		final String prefixed = "block/vault/vault_" + name;
		return Couple.createWithContext(
			medium -> CTSpriteShifter.getCT(AllCTTypes.RECTANGLE, CreateExtraProcessing.asResource(prefixed + "_small"),
				Create.asResource(medium ? prefixed + "_medium" : prefixed + "_large")));
	}

	//

	private static CTSpriteShiftEntry omni(String name) {
		return getCT(AllCTTypes.OMNIDIRECTIONAL, name);
	}

	private static CTSpriteShiftEntry horizontal(String name) {
		return getCT(AllCTTypes.HORIZONTAL, name);
	}

	private static CTSpriteShiftEntry vertical(String name) {
		return getCT(AllCTTypes.VERTICAL, name);
	}

	//

	private static SpriteShiftEntry get(String originalLocation, String targetLocation) {
		return SpriteShifter.get(CreateExtraProcessing.asResource(originalLocation), CreateExtraProcessing.asResource(targetLocation));
	}

	private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName, String connectedTextureName) {
		return CTSpriteShifter.getCT(type, CreateExtraProcessing.asResource("block/" + blockTextureName), // CHANGE HERE
			CreateExtraProcessing.asResource("block/" + connectedTextureName + "_connected"));
	}

	private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName) {
		return getCT(type, blockTextureName, blockTextureName);
	}

}
