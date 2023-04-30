package com.unrealdinnerbone.mutiproject;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod("mutiproject")
public class MutiProject {

    private static final Logger LOGGER = LogUtils.getLogger();

    public MutiProject() {
        LOGGER.info("Muti Project Workspace Loading...");
    }

}
