package com.toabars.extraprocessing.registrate;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.toabars.extraprocessing.AllSpriteShifts;
import com.toabars.extraprocessing.CreateExtraProcessing;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;

import static com.toabars.extraprocessing.CreateExtraProcessing.REGISTRATE;

public class ExtraProcessingItemsRegistrate {
    //public static BlockEntry<Block> SHIT_BLOCK = CreateExtraprocessing.REGISTRATE.block("shit_block", Block::new)
            //.register();

    //public static ItemEntry<Item> SHIT_ITEM = CreateExtraprocessing.REGISTRATE.item("shit", Item::new)
            //.register();

    public static BlockEntry<CasingBlock> GRANITE_CASING = CreateExtraProcessing.REGISTRATE.block("granite_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.PODZOL))
            .transform(BuilderTransformers.casing(() -> AllSpriteShifts.GRANITE_CASING))
            .register();



    public static ItemEntry<Item> GRANITE_ALLOY = CreateExtraProcessing.REGISTRATE.item("granite_alloy", Item::new)
            .register();



    public static void register(IEventBus modEventBus) {}
}