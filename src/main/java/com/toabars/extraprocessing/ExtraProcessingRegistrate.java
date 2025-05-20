package com.toabars.extraprocessing;

import com.toabars.extraprocessing.AllSpriteShifts;
import com.simibubi.create.Create;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;

public class ExtraProcessingRegistrate {
    //public static BlockEntry<Block> SHIT_BLOCK = CreateExtraprocessing.REGISTRATE.block("shit_block", Block::new)
            //.properties(BlockBehaviour.Properties::noOcclusion)
            //.addLayer(() -> RenderType::cutoutMipped)
            //.defaultBlockstate()
            //.simpleItem()
            //.register();

    //public static ItemEntry<Item> SHIT_ITEM = CreateExtraprocessing.REGISTRATE.item("shit", Item::new)
            //.register();

    public static BlockEntry<CasingBlock> GRANITE_CASING = CreateExtraprocessing.REGISTRATE.block("granite_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.PODZOL))
            .transform(BuilderTransformers.casing(() -> AllSpriteShifts.GRANITE_CASING))
            //.defaultBlockstate()
            //.simpleItem()
            .register();



    public static ItemEntry<Item> GRANITE_ALLOY = CreateExtraprocessing.REGISTRATE.item("granite_alloy", Item::new)
            .register();

    public static void register(IEventBus modEventBus) {

    }
}