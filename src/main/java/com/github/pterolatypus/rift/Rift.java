package com.github.pterolatypus.rift;

/**
 * Rift is a modification for Minecraft, built against Minecraft Forge. Copyright (C) 2015 Pterolatypus
 * This program is free software: you can redistribute it and/or modify it under the terms of version 2 of the GNU General Public License as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 */

import com.github.pterolatypus.rift.proxy.IProxy;
import com.github.pterolatypus.rift.reference.Strings;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("unused")
@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class Rift
{

    @Mod.Instance("rift")
    public static Rift instance;

    @SidedProxy(clientSide = Strings.PROXY_CLIENT, serverSide = Strings.PROXY_SERVER)
    public static IProxy proxy;

    @SuppressWarnings("unused")
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @SuppressWarnings("unused")
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    @SuppressWarnings("unused")
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
