package com.newclear.techmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NewclearTechMod.MOD_ID)
public class NewclearTechMod {
    public static final String MOD_ID = "newcleartechmod";
    private static final Logger LOGGER = LogManager.getLogger();

    public NewclearTechMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing NewclearTechMod");
    }
} 