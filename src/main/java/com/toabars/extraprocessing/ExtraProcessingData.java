package com.toabars.extraprocessing;

import com.tterrag.registrate.providers.RegistrateDataProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.toabars.extraprocessing.CreateExtraProcessing.REGISTRATE;

public class ExtraProcessingData {
    public static void onData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        event.getGenerator().addProvider(true,
                REGISTRATE.setDataProvider(
                        new RegistrateDataProvider(REGISTRATE, CreateExtraProcessing.MOD_ID, event)
                )
        );
    }
}
