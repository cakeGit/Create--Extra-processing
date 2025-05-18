package com.toabars.extraprocessing;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;

public class ExtraProcessingRegistrate {
    public static BlockEntry<Block> SHIT_BLOCK = CreateExtraprocessing.REGISTRATE.block("shit_block", Block::new)
            .properties(BlockBehaviour.Properties::noOcclusion)
            .addLayer(() -> RenderType::cutoutMipped)
            .defaultBlockstate()
            .simpleItem()
            .register();

    public static ItemEntry<Item> SHIT_ITEM = CreateExtraprocessing.REGISTRATE.item("shit", Item::new)
            .register();

    public static void register(IEventBus modEventBus) {

    }
}