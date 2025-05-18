package com.toabars.extraprocessing;

import com.tterrag.registrate.providers.RegistrateDataProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.toabars.extraprocessing.CreateExtraprocessing.REGISTRATE;

public class ExtraProcessingData {
    public static void onData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        event.getGenerator().addProvider(true,
                REGISTRATE.setDataProvider(
                        new RegistrateDataProvider(REGISTRATE, CreateExtraprocessing.MOD_ID, event)
                )
        );
    }

    public ExtraProcessingData(IEventBus modEventBus, ModContainer modContainer) {
        //LOGGER.info("Cake, Why is the pipe placing code so half baked lmao");

        REGISTRATE.registerEventListeners(modEventBus);
        //ExtraProcessingRegistrate.register(modEventBus);
        //IndustryBlocks.register();
        //IndustryBlockEntities.register();
        //IndustryCreativeTabs.register(modEventBus);
        //IndustryEntityTypes.register();
        //IndustryPackets.register();
        //IndustryPartials.register();
        modEventBus.addListener(ExtraProcessingData::onData);
    }
}
