package com.toabars.extraprocessing.registrate;

import com.simibubi.create.Create;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.content.processing.AssemblyOperatorBlockItem;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.infrastructure.config.CStress;
import com.toabars.extraprocessing.CreateExtraProcessing;
import com.toabars.extraprocessing.content.variants.CasingVariantMechanicalMixerBlock;
import com.toabars.extraprocessing.foundation.CasingVariantBlockList;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.axeOrPickaxe;

public class ExtraProcessingItemsRegistrate {
    //public static BlockEntry<Block> SHIT_BLOCK = CreateExtraprocessing.REGISTRATE.block("shit_block", Block::new)
    //.register();

    //public static ItemEntry<Item> SHIT_ITEM = CreateExtraprocessing.REGISTRATE.item("shit", Item::new)
    //.register();

//    public static BlockEntry<CasingBlock> GRANITE_CASING = ;

    public static CasingVariantBlockList<CasingBlock> CASING_VARIANTS = new CasingVariantBlockList<>((casing) ->
        CreateExtraProcessing.REGISTRATE.block(casing.getRegistryName() + "_casing", CasingBlock::new)
            .properties(p -> p.mapColor(s -> casing.getMapColour()))
            .transform(BuilderTransformers.casing(casing::getSpriteShift))
            .register()
    );


    public static CasingVariantBlockList<CasingVariantMechanicalMixerBlock> MECHANICAL_MIXER_VARIANT = new CasingVariantBlockList<>((casing) ->
        CreateExtraProcessing.REGISTRATE.block(casing.getRegistryName() + "_mechanical_mixer", CasingVariantMechanicalMixerBlock::new)
            .initialProperties(SharedProperties::stone)
            .properties(p -> p.noOcclusion()
                .mapColor(MapColor.STONE))
            .transform(axeOrPickaxe())
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .addLayer(() -> RenderType::cutoutMipped)
            .item(AssemblyOperatorBlockItem::new)
            .transform(customItemModel())
            .register()
    );

    public static ItemEntry<Item> GRANITE_ALLOY = CreateExtraProcessing.REGISTRATE.item("granite_alloy", Item::new)
        .register();

    public static void register(IEventBus modEventBus) {
    }
}