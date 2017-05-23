package com.jaredkimbel.automationutilities;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = AutomationUtilities.MODID, version = AutomationUtilities.VERSION)
public class AutomationUtilities
{
    public static final String MODID = "AutomationUtils";
    public static final String VERSION = "0.01";
    public static final String NAME = "Automation Utilities";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
