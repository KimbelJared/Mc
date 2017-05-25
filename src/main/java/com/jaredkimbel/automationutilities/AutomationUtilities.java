package com.jaredkimbel.automationutilities;

import com.jaredkimbel.automationutilities.proxy.CommonProxy;
import com.jaredkimbel.automationutilities.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AutomationUtilities.MODID, version = AutomationUtilities.VERSION, name = AutomationUtilities.NAME)
public class AutomationUtilities
{
    public static final String MODID = "automationutils";
    public static final String VERSION = "0.01";
    public static final String NAME = "Automation Utilities";
    
    @SidedProxy(clientSide = "com.jaredkimbel.automationutilities.proxy.ClientProxy", serverSide = "com.jaredkimbel.automationutilities.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static AutomationUtilities instance;

    public static CreativeTab creativeTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        creativeTab = new CreativeTab(CreativeTabs.getNextID(), "automation_utils");
        proxy.preInit(event);
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        proxy.postInit(event);
    }
}
