/*
 * Rift is a modification for Minecraft, built against Minecraft Forge. Copyright (C) 2015 Pterolatypus
 * This program is free software: you can redistribute it and/or modify it under the terms of version 2 of the GNU General Public License as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 */

package com.github.pterolatypus.rift.common.cfg;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {

    private Configuration config;

    public ConfigurationHandler(File configFile) {
        config = new Configuration(configFile);

        reloadConfig();

        if(config.hasChanged()) {
            config.save();
        }
    }

    public void reloadConfig() {
        config.load();
        //Then re-fetch values from the newly loaded config.
        //No config properties yet though, so nothing here.
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event) {
        //Reload configuration
        reloadConfig();
    }

    public Configuration getConfig() {
        return config;
    }

}
