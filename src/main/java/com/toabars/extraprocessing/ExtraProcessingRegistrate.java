package com.toabars.extraprocessing;

import com.toabars.extraprocessing.content.shitblock.ShitBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class ExtraProcessingRegistrate {
    public static BlockEntry<Block> SHIT_BLOCK = CreateExtraprocessing.REGISTRATE.block("shit_block", Block::new)
            .defaultBlockstate()
            .simpleItem()
            .register();

    public static void register() {

    }
}
