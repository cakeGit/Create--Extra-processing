package com.toabars.extraprocessing;

import com.toabars.extraprocessing.content.shitblock.ShitBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ExtraProcessingRegistrate {
    public static BlockEntry<Block> SHIT_BLOCK = CreateExtraprocessing.REGISTRATE.block("shit_block", Block::new)
            .defaultBlockstate()
            .simpleItem()
            .register();

    public static ItemEntry<Item> SHIT_ITEM = CreateExtraprocessing.REGISTRATE.item("shit", Item::new)
            .register();

    public static void register() {

    }
}