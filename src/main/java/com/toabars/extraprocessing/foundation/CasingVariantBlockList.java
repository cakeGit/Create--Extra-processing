package com.toabars.extraprocessing.foundation;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class CasingVariantBlockList<T extends Block> implements Iterable<BlockEntry<T>> {

    private static final int CASING_COUNT = CasingTypes.values().length;

    private final BlockEntry<?>[] values = new BlockEntry<?>[CASING_COUNT];

    public CasingVariantBlockList(Function<CasingTypes, BlockEntry<? extends T>> filler) {
        for (CasingTypes color : CasingTypes.values()) {
            values[color.ordinal()] = filler.apply(color);
        }
    }

    @SuppressWarnings("unchecked")
    public BlockEntry<T> get(CasingTypes color) {
        return (BlockEntry<T>) values[color.ordinal()];
    }

    public boolean contains(Block block) {
        for (BlockEntry<?> entry : values) {
            if (entry.is(block)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public BlockEntry<T>[] toArray() {
        return (BlockEntry<T>[]) Arrays.copyOf(values, values.length);
    }

    @Override
    public Iterator<BlockEntry<T>> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < values.length;
            }

            @SuppressWarnings("unchecked")
            @Override
            public BlockEntry<T> next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                return (BlockEntry<T>) values[index++];
            }
        };
    }

}

